import java.util.Scanner;

public class CheckTypes
{
    public void run()
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose an operation (+,-,* or /) ");
        String choice = scanner.nextLine();
        Calculator calc = new Calculator();
        Operations op = new Operations();
        op.inputDigits();

        switch (choice)
            {
            case "+":
                if (!op.aIsDouble() && !op.bIsDouble())
                    System.out.println(calc.addition(Integer.parseInt(op.getA()), Integer.parseInt(op.getB())));
                else if (!op.aIsDouble() && op.bIsDouble())
                    System.out.println(calc.addition(Integer.parseInt(op.getA()), Double.parseDouble(op.getB())));
                else if (op.aIsDouble() && !op.bIsDouble())
                    System.out.println(calc.addition(Double.parseDouble(op.getA()), Integer.parseInt(op.getB())));
                else if (op.aIsDouble() && op.bIsDouble())
                    System.out.println(calc.addition(Double.parseDouble(op.getA()), Double.parseDouble(op.getB())));
                else System.out.println("Exception");
                break;
            case "-":
                if (!op.aIsDouble() && !op.bIsDouble())
                    System.out.println(calc.subs(Integer.parseInt(op.getA()), Integer.parseInt(op.getB())));
                else if (!op.aIsDouble() && op.bIsDouble())
                    System.out.println(calc.subs(Integer.parseInt(op.getA()), Double.parseDouble(op.getB())));
                else if (op.aIsDouble() && !op.bIsDouble())
                    System.out.println(calc.subs(Double.parseDouble(op.getA()), Integer.parseInt(op.getB())));
                else if (op.aIsDouble() && op.bIsDouble())
                    System.out.println(calc.subs(Double.parseDouble(op.getA()), Double.parseDouble(op.getB())));
                else System.out.println("Exception");
                break;
            case "*":
                if (!op.aIsDouble() && !op.bIsDouble())
                    System.out.println(calc.multiply(Integer.parseInt(op.getA()), Integer.parseInt(op.getB())));
                else if (!op.aIsDouble() && op.bIsDouble())
                    System.out.println(calc.multiply(Integer.parseInt(op.getA()), Double.parseDouble(op.getB())));
                else if (op.aIsDouble() && !op.bIsDouble())
                    System.out.println(calc.multiply(Double.parseDouble(op.getA()), Integer.parseInt(op.getB())));
                else if (op.aIsDouble() && op.bIsDouble())
                    System.out.println(calc.multiply(Double.parseDouble(op.getA()), Double.parseDouble(op.getB())));
                else System.out.println("Exception");
                break;
            case "/":
                while (op.getA().equals("0") && op.getB().equals("0"))
                    {
                    if (!op.aIsDouble() && !op.bIsDouble()) System.out.println(calc.division(Integer.parseInt(op.getA()), Integer.parseInt(op.getB())));
                    else if (!op.aIsDouble() && op.bIsDouble()) System.out.println(calc.division(Integer.parseInt(op.getA()), Double.parseDouble(op.getB())));
                    else if (op.aIsDouble() && !op.bIsDouble()) System.out.println(calc.division(Double.parseDouble(op.getA()), Integer.parseInt(op.getB())));
                    else if (op.aIsDouble() && op.bIsDouble()) System.out.println(calc.division(Double.parseDouble(op.getA()), Double.parseDouble(op.getB())));
                    else System.out.println("Exception");
                    }
                System.out.println("None of a or b shouldn't be zero");
            }
        }
}
