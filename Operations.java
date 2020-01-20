import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations
{
    private String a,b;
    private Matcher aDouble, bDouble;
    Pattern p = Pattern.compile("[.]");

    public void inputDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        a = scanner.nextLine();
        System.out.println("Input b: ");
        b = scanner.nextLine();
    }

    public boolean aIsDouble()
        {
        aDouble = p.matcher(a);
        if(!aDouble.find())
            return false;
        else
            return true;
        }

    public boolean bIsDouble()
        {
        bDouble = p.matcher(b);
        if(!bDouble.find())
            return false;
        else
            return true;
        }

    public String getA()
        {
        return a;
        }

    public String getB()
        {
        return b;
        }
}
//// TODO: 06/30/2019 It stops after checking if A is double or not, with both Integers works well