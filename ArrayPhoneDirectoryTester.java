package telephonedirectory;

/**
* @author eeu213
 * @version V.10
 * @since 28/4/2014
 * @see ArrayPhoneDirectory.java
 * @see DirectoryEntry.java
 * @see PhoneDirectory.java
 */
import java.io.*;

public class ArrayPhoneDirectoryTester extends ArrayPhoneDirectory {

    public static void main(String[] args) {

        final String sourceName = ("M:/Object Orientated Programming/TelephoneDirectory/src/telephonedirectory/telnos.txt");
        
        ArrayPhoneDirectory directory1 = new ArrayPhoneDirectory(); // creates directories for entry
        ArrayPhoneDirectory directory2 = new ArrayPhoneDirectory();

        directory1.loadData(sourceName); // loads the data in the file

        directory1.addChangeEntry("Michael Smith", "398896"); // adds a directory

        System.out.println("Testing .format\n" + directory1.format()); // prints the directory

        System.out.println("Look up Entry for Michael Smith\n\n" + directory1.lookUpEntry("Michael Smith")); // looks up the name and prints the number

        directory1.save(); // saves the information to the file

        System.out.print("\nTest addChangeEntry 398896 to 07564165670:\n");
        directory1.addChangeEntry("Michael Smith", "07564165670"); // changes the number on the stored entry
        System.out.print(directory1.format()); 

        directory2.loadData(sourceName);

        directory2.addChangeEntry("John Roberts", "0156260566"); // adds a new entry

        directory2.save();
        System.out.println("\nSecond Entry: \n" + directory2.format()); 

        System.out.println("Test the Remove Entry Method:");
        directory1.removeEntry("Michael Smith"); // removes the entry from the array
        directory1.save();
        System.out.println(directory1.format());

    }
}
