
/**
 * The RegDemo class serves as the driver for the car registration project.
 * It demonstrates the full registration processing flow by using the 
 * RegistrationMethods class to:
 * 
 * <ul>
 *   <li>Prompt for file names</li>
 *   <li>Load and process car owner data</li>
 *   <li>Identify overdue and almost-due registrations</li>
 *   <li>Write results to an output file</li>
 * </ul>
 * 
 * This class represents the entry point of the DMV-style registration program.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 5/28/2025
 */
public class RegDemo
{
    /**
     * The main method drives the car registration application.
     * It prompts the user for input/output file paths, reads and processes data,
     * identifies overdue and soon-to-be-due registrations, and writes formatted
     * output to a report file.
     *
     * @param args Command-line arguments (not used)
     * @throws Exception if any I/O or parsing error occurs during processing
     */
    public static void main(String[] args) throws Exception
    {
        int size = 0;
        RegistrationMethods dmv = new RegistrationMethods();
        dmv.setFileNames();
        size = dmv.getArraySize();
        CarOwner[]ltState = new CarOwner[size];
        dmv.processTextToArray(ltState);
        dmv.printArrayToFile(ltState, "List of Car Owners");
        CarOwner[] overdue = dmv.flagOverdueOwners(ltState);
        dmv.printArrayToFile(overdue, "Owners with Expired Registration");
        CarOwner[] almostDue= dmv.flagAlmostDueOwners(ltState);
        dmv.printArrayToFile(almostDue, "Owners with registration expiring in three months or less");
        System.out.println("The output file is located at: " + dmv.getOutputFileName());
    }

}
