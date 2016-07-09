
package lab.pkg2;
/**
 * @author eeu213
 * @version V.1
 * @since 10/2/2014
 * @see Person.java 
 */
public class PersonTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //inputs values from the constructor for name, age, height, gender        
        Person person1 = new Person("Michael", "Smith", 19, 1.57, "male");
        Person person2 = new Person("Joe", "Bloggs", 30, 1.7, "male");
        Person person3 = new Person("John", "Trott", 50, 1.6, "male");
        Person person4 = new Person("Heather", "Perkins", 20, 1.5, "female");
        //blank value to test the set value
        Person person5 = new Person();        
        
        //sets values to person5
        person5.setfName("Joanne");
        person5.setsName("Jones");
        person5.setAge(34);
        person5.setHeight(1.7);
        person5.setsGender("female");
        
        //prints out all the values plus the strings set in Person.java
        System.out.println(person1.toString());        
        System.out.println(person2.toString());        
        System.out.println(person3.toString());        
        System.out.println(person4.toString());        
        System.out.println(person5.toString());
        
        System.out.println("\n");
        
        //gets and prints out each element of a single person in lines
        System.out.println(person1.getfName());
        System.out.println(person1.getsName());
        System.out.println(person1.getAge());
        System.out.println(person1.getHeight());
        System.out.println(person1.getGender());
        
        System.out.println("\n");
        
        //prints out the formatted person strings with tabs
        System.out.println(person1.Format());        
        System.out.println(person2.Format());        
        System.out.println(person3.Format());        
        System.out.println(person4.Format());        
        System.out.println(person5.Format());
        System.out.println(person1.getCount());  
    }
}
