import java.util.*;
import java.io.*;

/**
 * 
 * Final project
 * The RegistrationMethods class handles input/output and processing of CarOwner data
 * from a CSV file. It supports reading car owner records, identifying overdue or almost-due
 * registrations, and writing reports to an output file.
 * 
 * This class is designed for use in a DMV-style registration system.
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/22/2025
 */
public class RegistrationMethods
{
    private String inputFileName;
    private String outputFileName;
    public static final int REG_MONTH = 4;
    public static final int REG_YEAR = 2025;

    /**
     * Prompts the user for the input and output file locations.
     * Validates that the input file exists before proceeding.
     * Sets the input and output file name variables.
     */
    public void setFileNames()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Provide the location of the registration.csv file: ");
        inputFileName = keyboard.nextLine();
        File file;
        file = new File (inputFileName);
        while(!(file.exists())){
            System.out.print("Does not exist. Enter a new location: ");
            inputFileName = keyboard.nextLine();
            file = new File(inputFileName);
        }
        System.out.print("What is the location of the output file: ");
        outputFileName = keyboard.nextLine();
    }

    /**
     * Calculates the number of CarOwner records (lines) in the input CSV file.
     * 
     * @return the number of data records (not counting the header)
     * @throws IOException if the file cannot be read
     */
    public int getArraySize() throws IOException
    {

        int counter = 0;
        File file = new File(inputFileName);
        Scanner input = new Scanner(file);
        input.nextLine();
        while(input.hasNextLine())
        {
            counter++;
            input.nextLine();
        }
        input.close();
        return counter;
    }

    /**
     * Reads data from the input CSV file and populates a CarOwner array.
     * Skips the header row and parses each data line.
     * 
     * @param inArray the array to be filled with CarOwner objects
     * @throws IOException if the file cannot be read
     */
    public void processTextToArray(CarOwner[] inArray) throws IOException
    {
        File file = new File (inputFileName);
        Scanner input = new Scanner(file);
        input.nextLine();
        int index = 0;
        while (input.hasNextLine()){
            String line = input.nextLine();
            String[] tokens = line.split(",");
            int month = Integer.parseInt(tokens[3]);
            int year = Integer.parseInt(tokens[4]);
            CarOwner temp = new CarOwner(tokens[1], tokens[0], tokens[2], month, Integer.parseInt(tokens[4]));
            inArray[index] = temp;
            index ++;
        }

        input.close();
    }

    /**
     * Writes a message followed by the contents of a CarOwner array to the output file.
     * Appends the data rather than overwriting existing content.
     * 
     * @param inArray the array of CarOwner objects to write
     * @param inMsg a header or message to be printed before the array contents
     * @throws IOException if the file cannot be written to
     */
    public void processTextToArray(CarOwner[] inArray, String inMsg) throws IOException
    {
        FileWriter file = new FileWriter(outputFileName, true);
        PrintWriter output = new PrintWriter(file);
        output.println(inMsg);
        for(CarOwner item: inArray)
            output.println(item);
        output.println();
        output.close();
    }

    /**
     * Identifies CarOwner records that are more than 12 months overdue for registration.
     * 
     * @param inArray the full list of CarOwner records
     * @return a new array containing only overdue CarOwner objects
     * @throws IOException if an I/O error occurs (included for consistency, though not used directly)
     */
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray) throws IOException
    {
        CarOwner[] overDue;
        int monthsTotal = REG_YEAR*12 + REG_MONTH;
        int counter = 0;
        int index = 0;
        for(int i=0; i < inArray.length; i ++){
            if(monthsTotal - (inArray[i].getYear()*12 + inArray[i].getMonth())>12)
                counter++;
        }
        overDue = new CarOwner[counter];
        for(int i=0; i< inArray.length; i++){
            if(monthsTotal - (inArray[i].getYear()*12+inArray[i].getMonth())>12){
                overDue[index] = inArray[i];
                index++;
            }
        }
        return overDue;
    }

    /**
     * Identifies CarOwner records that are within 9 to 12 months of being due for registration.
     * 
     * @param inArray the full list of CarOwner records
     * @return a new array containing only almost-due CarOwner objects
     * @throws IOException if an I/O error occurs (included for consistency, though not used directly)
     */
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray) throws IOException
    {
        CarOwner[] almostDue;
        int monthsTotal = REG_YEAR*12 + REG_MONTH;
        int counter = 0;
        int index = 0;
        for(int i=0; i< inArray.length;i++){
            if(monthsTotal - (inArray[i].getYear() *12 +inArray[i].getMonth())>9&& monthsTotal- (inArray[i].getYear() *12 +inArray[i].getMonth())<=12){
                counter++;
            }
        }
        almostDue = new CarOwner[counter];
        for(int i=0; i< inArray.length; i++){
            if(monthsTotal - (inArray[i].getYear() *12 +inArray[i].getMonth())>9&& monthsTotal- (inArray[i].getYear() *12 +inArray[i].getMonth())<=12){
                almostDue[index] = inArray[i];
                index++;
            }
        }
        return almostDue;
    }

    /**
     * Returns the name of the output file set by the user.
     * 
     * @return the output file name
     */
    public String getOutputFileName()
    {
        return outputFileName;
    }
}