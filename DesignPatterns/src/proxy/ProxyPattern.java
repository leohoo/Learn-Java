package proxy;

interface Image {
    public abstract void displayImage();
}
 
//on System A 
class RealImage implements Image {
 
    private String filename = null;
    /**
     * Constructor
     * @param FILENAME
     */
    public RealImage(final String FILENAME) { 
        filename = FILENAME;
        loadImageFromDisk();
    }
 
    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    /**
     * Displays the image
     */
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }
 
}
 
//on System B 
class ProxyImage implements Image {
 
    private RealImage image = null;
    private String filename = null;
    /**
     * Constructor
     * @param FILENAME
     */
    public ProxyImage(final String FILENAME) { 
        filename = FILENAME; 
    }
 
    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }
 
}
 
public class ProxyPattern {
 
   /**
    * Test method
    */
   public static void main(String[] args) {
        final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image IMAGE2 = new ProxyImage("HiRes_10MB_Photo2");     
 
        IMAGE1.displayImage(); // loading necessary
        IMAGE1.displayImage(); // loading unnecessary
        IMAGE2.displayImage(); // loading necessary
        IMAGE2.displayImage(); // loading unnecessary
        IMAGE1.displayImage(); // loading unnecessary
    }
 
}