package telephonedirectory;

/**
* @author eeu213
 * @version V.10
 * @since 28/4/2014
 * @see ArrayPhoneDirectory.java
 * @see ArrayPhoneDirectoryTester.java
 * @see DirectoryEntryTester.java
 * @see PhoneDirectory.java
 * @param name carried over from the tester
 * @param telno carried over from the tester
 */
public class DirectoryEntry  {
    
 String name; 
 String telno; 
 
 
 // creates an object to with two strings
 
 public DirectoryEntry(String name, String telno)
 {
     this.name = name;
     this.telno = telno;
 } 
 
 // gets the name from the object 
 
 public String getName()
 {
     return name;
 } 
 
 // gets the number from the object
 
 public String getNumber()
 {
     return telno;
 } 
 
 // sets the number for the object
 
 public void setNumber(String telno)
 {
     this.telno = telno;
 } 
 
 // prints out the object
 
 public String toString()
 {
     return getClass().getSimpleName() + "[Name = " + getName() 
             + ", Telno = " + getNumber() + "]";
 } 
 
 // formats the print out of the object
 
 public String format()
 {
    return String.format(getName() + "\n" + getNumber());
 } 
 

}

