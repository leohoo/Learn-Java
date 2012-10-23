package mediator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
//Colleague interface
interface Command {
    void execute();
}
 
//Abstract Mediator
interface IMediator {
    void book();
    void view();
    void search();
    void registerView(BtnView v);
    void registerSearch(BtnSearch s);
    void registerBook(BtnBook b);
    void registerDisplay(LblDisplay d);
}
 
//Concrete mediator
class Mediator implements IMediator {
 
    BtnView btnView;
    BtnSearch btnSearch;
    BtnBook btnBook;
    LblDisplay show;
 
    //....
    public void registerView(BtnView v) {
        btnView = v;
    }
 
    public void registerSearch(BtnSearch s) {
        btnSearch = s;
    }
 
    public void registerBook(BtnBook b) {
        btnBook = b;
    }
 
    public void registerDisplay(LblDisplay d) {
        show = d;
    }
 
    public void book() {
        btnBook.setEnabled(false);
        btnView.setEnabled(true);
        btnSearch.setEnabled(true);
        show.setText("booking...");
    }
 
    public void view() {
        btnView.setEnabled(false);
        btnSearch.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("viewing...");
    }
 
    public void search() {
        btnSearch.setEnabled(false);
        btnView.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("searching...");
    }
 
}
 
//A concrete colleague
class BtnView extends JButton implements Command {
 
    IMediator med;
 
    BtnView(ActionListener al, IMediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }
 
    public void execute() {
        med.view();
    }
 
}
 
//A concrete colleague
class BtnSearch extends JButton implements Command {
 
    IMediator med;
 
    BtnSearch(ActionListener al, IMediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }
 
    public void execute() {
        med.search();
    }
 
}
 
//A concrete colleague
class BtnBook extends JButton implements Command {
 
    IMediator med;
 
    BtnBook(ActionListener al, IMediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }
 
    public void execute() {
        med.book();
    }
 
}
 
class LblDisplay extends JLabel {
 
    IMediator med;
 
    LblDisplay(IMediator m) {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }
 
}
 
class MediatorDemo extends JFrame implements ActionListener {
 
//    IMediator med = new Mediator();
    IMediator med = new Mediator();
 
    MediatorDemo() {
        JPanel p = new JPanel();
        p.add(new BtnView(this, med));
        p.add(new BtnBook(this, med));
        p.add(new RedBtnSearch(this, med));
        getContentPane().add(new LblDisplay(med), "North");
        getContentPane().add(p, "South");
        setSize(400, 200);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent ae) {
        Command comd = (Command) ae.getSource();
        comd.execute();
    }
 
    public static void main(String[] args) {
        new MediatorDemo();
    }
 
}