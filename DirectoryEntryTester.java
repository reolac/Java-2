package telephonedirectory;

/**
* @author eeu213
 * @version V.10
 * @since 28/4/2014
 * @see ArrayPhoneDirectory.java
 * @see DirectoryEntry.java
 * @see DirectoryEntryTester.java
 * @see PhoneDirectory.java
 */
public class DirectoryEntryTester {


    public static void main(String[] args) 
    {
        
        DirectoryEntry directory1  = new DirectoryEntry("Michael Smith", 
                "07564165670");
        DirectoryEntry directory2 = new DirectoryEntry("Kieran Smith", "080001066");
        DirectoryEntry directory3 = new DirectoryEntry("Gareth Bold", "0156260566");
        
        System.out.println("Testing the getName");
        System.out.println(directory1.getName());
        
        System.out.println("\n");
        
        System.out.println("Testing the getNumber");
        System.out.println(directory1.getNumber());
        
        System.out.println("\n");
        
        System.out.println("Testing the setNumber");
        directory1.setNumber("01492541100");
        System.out.println(directory1.getNumber());
        
        System.out.println("\n");       
        
        System.out.println("Testing the .toString");
        System.out.println(directory1.toString()); 
        System.out.println("");
        System.out.println(directory2.toString());
        System.out.println("");
        System.out.println(directory3.toString());
        
        System.out.println("\n");
        
        System.out.println("Testing the .format");
        System.out.println(directory1.format());
        System.out.println("");
        System.out.println(directory2.format());
        System.out.println("");
        System.out.println(directory3.format());
    }
}
