package mediator;

import java.awt.Color;
import java.awt.event.ActionListener;

public class RedBtnSearch extends BtnSearch {

	RedBtnSearch(ActionListener al, IMediator m) {
		super(al, m);
		this.setBackground(Color.RED);
		this.setForeground(Color.BLUE);
	}

}
