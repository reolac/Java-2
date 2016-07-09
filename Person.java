package lab.pkg2;

/**
 * @author eeu213
 * @version V.1
 * @since 10/2/2014
 * @see PersonTester.java 
 */
public class Person 
{
    
/**
 * @param forename private variable for the first name
 * @param surname private variable for the surname
 * @param age private variable for the age
 * @param height private variable for the height in metres 
 * @param gender private variable for the gender
 * @param personCount private static variable to count the amount of values
 */
    
    private String forename;
    private String surname; 
    private int age;
    private double height; 
    private String gender;    
    private static int personCount;
    
 /**
  * @param fName constructor for forename
  * @param sName constructor for surname
  * @param aAge constructor for age
  * @param aHeight constructor for height
  * @param aGender constructor for gender
  */
    
    public Person(String fName, String sName, int aAge, double aHeight, String aGender)
    {
        forename = fName;
        surname = sName;
        age = aAge;
        height = aHeight;
        gender = aGender;
        personCount = personCount + 1;
    }
    
    public Person()
    {
       personCount = personCount + 1;          
    }
    
    /**
     * @return adds +1 to the counter  
     */

    public int getCount()
    {
        return personCount;
    }
    
    /**
     * @return returns the forename from the value inputted in PersonTester
     */   
    
    public String getfName()
    {
        return forename;
    }
    
    /**
     * @return returns the surname from the value inputted in PersonTester
     */
    
    public String getsName()
    {
        return surname;
    }
    
    /**
     * @return returns the age from the value inputted in PersonTester
     */
    
    public int getAge()
    {
        return age;
    }
    
    /**
     * @return returns the height from the value inputted in PersonTester 
     */
    
    public double getNumber()
    {
        return height;
    }
    
    /**
     * @return converts the height to a string and adds "m" to the end of the double
     */
    
    public String getHeight()
    {
        return height + "m";
    }
    
    /**
     * @return returns the gender from the value inputted in the PersonTester
     */
    
    public String getGender()
    {
        return gender;
    } 
    
    /**
     * @return returns all of the values inputted in PersonTester plus strings to identify what is what
     */
    
    public String toString()
    {
        return "Person[foreName = " + getfName() + ", surName = " + getsName() + ", age = " + getAge() + ", height = " + getHeight()+ ", gender = " + getGender() + "]";
    }
    
    /**
     * @return formats the values inputted %-10s is tabbing.
     */
    
    public String Format()
    {
        return String.format("%-10s %-10s %-10s %-10s %-10s", getfName(), getsName(), getAge(), getHeight(), getGender());
    }
    
    /**
     * @param forename sets the forename as the value inputted in the set method
     */
    
    public void setfName(String forename)
    {
        this.forename = forename;         
    }
    
    /**
     * @param surname sets the surname as the value inputted in the set method
     */
    
    public void setsName(String surname)
    {
        this.surname = surname; 
    }
    
    /**
     * @param age sets the age as the value inputted in the set method
     */
    
    public void setAge(int age)
    {
        this.age = age; 
    }
    
    /**
     * @param height sets the height as the value inputted in the height method
     */

    public void setHeight(double height)
    {
        this.height = height; 
    }
    
    /**
     * @param gender sets the gender as the value inputted in the gender method
     */
    
    public void setsGender(String gender)
    {
        this.gender = gender;
    }    
}

