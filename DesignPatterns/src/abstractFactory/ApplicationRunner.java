package abstractFactory;

/* GUIFactory example -- */

interface Buttonlike {
    public void paint();
}
 
interface GUIFactorylike {
    public Buttonlike createButton();
}
 
class WinFactory implements GUIFactorylike {
    public Buttonlike createButton() {
        return new WinButton();
    }
}
 
class OSXFactory implements GUIFactorylike {
    public Buttonlike createButton() {
        return new OSXButton();
    }
}
 
class WinButton implements Buttonlike {
    public void paint() {
        System.out.println("I'm a WinButton");
    }
}
 
class OSXButton implements Buttonlike {
    public void paint() {
        System.out.println("I'm an OSXButton");
    }
}
 
class Application {
    public Application(GUIFactorylike factory) {
        Buttonlike button = factory.createButton();
        button.paint();
    }
}
 
public class ApplicationRunner {
    public static void main(String[] args) {
        new Application(createOsSpecificFactory());
    }
 
    public static GUIFactorylike createOsSpecificFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) return new WinFactory();
        else return new OSXFactory();
    }

	private static int readFromConfigFile(String osType) {
		return 0;
	}
}