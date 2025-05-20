
/**
 * Write a description of class RegDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegDemo
{
    public static void main(String[] args)
    {

        int size = 0;
        RegistrationMethods dmv = new RegistrationMethods();
        dmv.setFileNames();
        size = dmv. getArraySize();
        CarOwner[]ltState = new CarOwner[size];
        dmv.processTextToArray(ltState);
        

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
