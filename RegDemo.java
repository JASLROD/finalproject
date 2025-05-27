
/**
 * Write a description of class RegDemo here.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/22/2025
 */
public class RegDemo
{
    public static void main(String[] args)
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
