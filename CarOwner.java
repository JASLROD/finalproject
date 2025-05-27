
/**
 *final project
 * The CarOwner class extends Citizen and adds car ownership details,
 * including a license plate, and registration month and year.
 * Useful for applications that track registered vehicle owners.
 * 
 * Inherits first and last name from the Citizen superclass.
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/22/2025
 */
public class CarOwner extends Citizen
{
    private String license;
    private int month;
    private int year;

    /**
     * Constructs a CarOwner with default values.
     * Inherits name from the Citizen default constructor.
     * License is set to "not Assigned", month and year to 0.
     */
    public CarOwner()
    {
        super();
        license = "not Assigned";
        month = 0;
        year = 0;
    }

    /**
     * Constructs a CarOwner with full name, license, and registration date.
     * 
     * @param inFirst the owner's first name
     * @param inLast the owner's last name
     * @param inLicense the license plate number
     * @param inMonth the registration month
     * @param inYear the registration year
     */
    public CarOwner(String inFirst, String inLast, String inLicense, int inMonth, int inYear)
    {
        super(inFirst, inLast);
        String license = inLicense;
        month = inMonth;
        year = inYear;
    }

    /**
     * Returns a string representation of the CarOwner object,
     * including the inherited name, license, and registration date.
     * 
     * @return a formatted string with car owner details
     */
    public String toString()
    {
        String str = super.toString() + "\t" + license + "\t" + month +"/ " + year;
        return str;
    }

    /**
     * Sets the license plate number.
     * 
     * @param inLicense the new license plate number
     */
    public void setLicense(String inLicense)
    {
     license = inLicense;
    }

    /**
     * Returns the license plate number.
     * 
     * @return the license plate number
     */
    public String getLicense()
    {
        return license;
    }

    /**
     * Sets the registration month.
     * 
     * @param inMonth the month the car was registered
     */
    public void setMonth(int inMonth)
    {
        month = inMonth;
    }

    /**
     * Returns the registration month.
     * 
     * @return the registration month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Sets the registration year.
     * 
     * @param inYear the year the car was registered
     */
    public void setYear(int inYear)
    {
        year = inYear;
    }

    /**
     * Returns the registration year.
     * 
     * @return the registration year
     */
    public int getYear()
    {
        return year;
    }
}
