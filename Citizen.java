
/**
 * Write a description of class Citizen here.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/22/2025
 */
public class Citizen
{
    private String firstName;
    private String lastName;

    /**
     * Constructor for objects of class Citizen
     */
    public Citizen()
    {
        firstName = "No Name";
        lastName = "No Name";
    }

    /**
     * Constructor for objects of class Citizen
     */
    public Citizen(String inFirst, String inLast)
    {
        String firstName = inFirst;
        String lastName = inLast;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        String str = firstName + " " + lastName;
        return str;
    }

    /**
     * Constructor for objects of class Citizen
     */
    public void setFirstName(String inFirst)
    {
        firstName = inFirst;
    }

    /**
     * Constructor for objects of class Citizen
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * Constructor for objects of class Citizen
     */
    public void setLastName(String inLast)
    {
       lastName = inLast;
    }
    
    /**
     * Constructor for objects of class Citizen
     */
    public String getLastName()
    {
        return lastName;
    }
}