import java.util.Scanner;
public class calculator
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        float x,z;
        int oper;
        System.out.print("1. Sum (+)\n2. Sub (-)\n3. Multi (*)\n4. Div (/)\n5. Mod (%)\nChoose the operation : ");
        oper =input.nextInt();
        System.out.println("Enter two numbers to calculate :");
        x=input.nextInt();
        z=input.nextInt();
        switch(oper)
        {
            case 1:
                System.out.println(x+"+"+z+" = "+(x+z));
                break;
            case 2:
                System.out.println(x+"-"+z+" = "+(x-z));
                break;
            case 3:
                System.out.println(x+"*"+z+" = "+(x*z));
                break;
            case 4:
                System.out.println(x+"/"+z+" = "+(x/z));
                break;
            case 5:
                System.out.println(x+"%"+z+" = "+(x%z));
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
