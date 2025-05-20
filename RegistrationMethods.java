
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
}
