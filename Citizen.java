
/**
 * The Citizen class stores basic information about a citizen, including
 * their first and last names.
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
     * Constructs a Citizen object with default values ("No Name" for both first and last names).
     */
    public Citizen()
    {
        firstName = "No Name";
        lastName = "No Name";
    }

    /**
     * Constructs a Citizen object with the specified first and last names.
     *
     * @param inFirst The first name of the citizen.
     * @param inLast The last name of the citizen.
     */
    public Citizen(String inFirst, String inLast)
    {
        firstName = inFirst;
        lastName = inLast;
    }

    /**
     * Returns a string representation of the Citizen object, combining first and last name.
     *
     * @return A string in the format "firstName lastName".
     */

    public String toString()
    {
        String str = firstName + " " + lastName;
        return str;
    }

    /**
     * Sets the first name of the citizen.
     *
     * @param inFirst The new first name.
     */
    public void setFirstName(String inFirst)
    {
        firstName = inFirst;
    }

    /**
     * Returns the first name of the citizen.
     *
     * @return The first name.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets the last name of the citizen.
     *
     * @param inLast The new first name.
     */
    public void setLastName(String inLast)
    {
        lastName = inLast;
    }

    /**
     * Returns the last name of the citizen.
     *
     * @return The last name.
     */
    public String getLastName()
    {
        return lastName;
    }
}