
/**
 * Write a description of class RegistrationMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegistrationMethods
{
    private String inputFileName;
    private String outputFileName;
    public static final int REG_MONTH = 4;
    public static final int REG_YEAR = 2025;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getArraySize() throws IOException
    {

        int counter = 0;
        File file = new File(inputFileName);
        Scanner input = Scanner(file);
        input.nextLine();
        while(input.hasNextLine())
        {
            counter++;
            input.nextLine();
        }
        input.close();
        return counter;
    }

    public void setFileNames()
    {
        Scanner keyboard = new Scanner(System.in);
        File file;
        System.outprint("Provide the location of the registration.csv file: ");
        inputFileName = keyboard.nextLine();
        file = new File (input FileName);

    }

    /**
     * 
     *
     */
    public void processTextToArray(CarOwner[] inArray) throws IOException
    {
        File file = new File (inputFileName);
        Scanner input = new Scanner(file);
        input.nextLine();
        int index = 0;

        while (input.hasNextLine()){
            String line = input.NextLine();
            String[] tokens = line.split(",");
            int month = Integer.parseInt(takens[3]);
            CarOwner temp = newCarOwner(tokens[1], takens[0], tokens[2], month, Integer.parseInt(tokens[4]))
            inArray[index] = temp;
            index ++;
        }