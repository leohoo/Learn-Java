package chainofres;
 
abstract class Logger {
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;
 
    // The next element in the chain of responsibility
    protected Logger next;
 
    public Logger setNext(Logger log) {
        next = log;
        return log;
    }
 
    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }
 
    abstract protected void writeMessage(String msg);
}
 
class StdoutLogger extends Logger {
    public StdoutLogger(int mask) { 
        this.mask = mask;
    }
 
    protected void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}
 
 
class EmailLogger extends Logger {
    public EmailLogger(int mask) {
        this.mask = mask;
    }
 
    protected void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}
 
class StderrLogger extends Logger {
    public StderrLogger(int mask) {
        this.mask = mask;
    }
 
    protected void writeMessage(String msg) {
        System.err.println("Sending to stderr: " + msg);
    }
}
 
public class ChainOfResponsibility {
    public static void main(String[] args) {
        // Build the chain of responsibility
        Logger logger, logger1,logger2;
        logger = new StdoutLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));
 
        // Handled by StdoutLogger
        logger.message("Entering function y.", Logger.DEBUG);
 
        // Handled by StdoutLogger and EmailLogger
        logger.message("Step1 completed.", Logger.NOTICE);
 
        // Handled by all three loggers
        logger.message("An error has occurred.", Logger.ERR);
    }
}
/*
The output is:
   Writing to stdout:   Entering function y.
   Writing to stdout:   Step1 completed.
   Sending via e-mail:  Step1 completed.
   Writing to stdout:   An error has occurred.
   Sending via e-mail:  An error has occurred.
   Writing to stderr:   An error has occurred.
*/