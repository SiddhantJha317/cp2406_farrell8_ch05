import java.util.Scanner;
public class AscendingDescending
{
    public static void main(String[] args)
    {
        int num1, num2, num3;
        int low, med, high;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer >> ");
        num1 = keyboard.nextInt();
        System.out.print(" another ");
        num2 = keyboard.nextInt();
        System.out.print("And a third >> ");
        num3 = keyboard.nextInt();
        if(num1 <= num2 && num1 <= num3)
        {
            low = num1;
            if(num2 <= num3)
            {
                med = num2;
                high = num3;
            }
            else
            {
                med = num3;
                high = num2;
            }
        }
        else
        {
            if(num2 <= num1 && num2 <= num3)
            {
                low = num2;
                if(num1 <= num3)
                {
                    med = num1;
                    high = num3;
                }
                else
                {
                    med = num3;
                    high = num1;
                }
            }
            else
            {
                low = num3;
                if(num1 <= num2)
                {
                    med = num1;
                    high = num2;
                }
                else
                {
                    med = num2;
                    high = num1;
                }
            }
        }
        System.out.println("Ascending sequence: " + low + " " +
                med + " " + high);
        System.out.println("Descending sequence: " + high + " " +
                med + " " + low);


    }
}
