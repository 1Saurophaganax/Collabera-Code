/**
 * 
 * @author me
 * 
 * @apiNote day
 */
class javaversioncheck {

  public static void main(String[] args) {
        System.out.println("\nJava Version: "+System.getProperty("java.version") );
        System.out.println("\nJava Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("\nJava Home: "+System.getProperty("java.home"));
        System.out.println("\nJava Vendor: "+System.getProperty("java.vendor"));
        System.out.println("\nJava Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("\nJava Class Path: "+System.getProperty("java.class.path")+"\n");
    }
}