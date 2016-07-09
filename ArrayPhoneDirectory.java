package telephonedirectory;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author eeu213
 * @version V.10
 * @since 28/4/2014
 * @see ArrayPhoneDirectoryTester.java
 * @see DirectoryEntry.java
 * @see DirectoryEntryTester.java
 * @see LinkedListPhoneDirectory.java
 * @see PhoneDirectory.java
 * @see PhoneDirectoryCLI.java
 * @see PhoneDirectoryUI.java
 * @param capacity the size of the array
 * @param size the amount of elements stored in the array
 * @param theDirectory the array to store the elements
 * @param sourceName location of the file to load and write to
 * @param modified flags if the array has be changed since the last load or save
 */
public class ArrayPhoneDirectory implements PhoneDirectory {

    private static final int INIT_CAPACITY = 100;
    private int capacity = INIT_CAPACITY;
    private int size = 0;
    private DirectoryEntry[] theDirectory = new DirectoryEntry[capacity];
    private final String sourceName = "M:/Object Orientated Programming"
            + "/TelephoneDirectory/src/telephonedirectory/telnos.txt";
    private boolean modified = false;

    /**
     * @author eeu213
     * @version V.10
     * @since 28/4/2014
     * @see ArrayPhoneDirectoryTester.java
     * @see DirectoryEntry.java
     * @see DirectoryEntryTester.java
     * @see LinkedListPhoneDirectory.java
     * @see PhoneDirectory.java
     * @see PhoneDirectoryCLI.java
     * @see PhoneDirectoryUI.java
     */
    /**
     * Searches the array of directory entries for a specific name
     *
     * @param i iterate through the
     * @param name carried over from the tester
     * @return the location of the name if it exists in the array*
     */
    private int find(String name) {

        int i = 0;
        if (size == 0) {
            return -1;
        }
        for (i = 0; i < size; i++) {
            if (theDirectory[i].getName().equals(name)) {
                return i;
            } else if (theDirectory[i].getName() != name) {
                i = -1;
                return i;
            }
        }

        return i;
    }

// Adds a new entry with the given name and telno to the array of 
// directory entries 
    private void add(String name, String telno) {

        if (size >= capacity) {
            reallocate();
        }

        theDirectory[size] = new DirectoryEntry(name, telno);

        size++;

        save();

    }

    public void loadData(String sourceName) {
        File file = new File(sourceName);

        try {
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < size; i++) {
                String name = scanner.next() + " " + scanner.next();
                String number = scanner.next();

                theDirectory[size] = new DirectoryEntry(name, number);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

// Creates a new array of directory entries with twice the capacity 
// of the previous one 
    private void reallocate() {
        capacity = capacity * 2;
        DirectoryEntry[] newDirectory = new DirectoryEntry[capacity];
        System.arraycopy(theDirectory, 0, newDirectory, 0, capacity);
        theDirectory = newDirectory;
        //set theDirectory to newDirectory 
    }

    public String format() {

        String format = "  ";

        for (DirectoryEntry current : theDirectory) {
            if (current != null) {
                format = "\n" + current.format() + "\n";
            }
        }
        return format;
    }

    public void save() {

        File file = new File(sourceName);
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);

            for (int i = 0; i < size; i++) {
                if (theDirectory[i] != null) {

                    printWriter.println(theDirectory[i].getName());
                    printWriter.println(theDirectory[i].getNumber());
                    printWriter.flush();
                    printWriter.close();

                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArrayPhoneDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String addChangeEntry(String name, String number) {

        int location = find(name);

        if (location != -1) {

            String num = theDirectory[location].getNumber();

            theDirectory[location].setNumber(number);

            return num;
        } else {

            add(name, number);
            return name;
        }
    }

    public String lookUpEntry(String name) {
        int loc = find(name);

        if (loc != -1) {

            return theDirectory[loc].getNumber();
        } else {
            return "Entry does not exist";
        }
    }

    public String removeEntry(String name) {
        int loc = find(name);

        if (loc != -1) {
            theDirectory[loc].name = null;
            theDirectory[loc].telno = null;
        } else {
            return "Entry does not exist";
        }
        return null;
    }

}
