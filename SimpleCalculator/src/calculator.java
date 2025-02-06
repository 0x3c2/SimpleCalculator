import java.util.Scanner;
public class calculator
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        float x,z;
        int oper;
        do
        {
            System.out.print("1. Sum (+)\n2. Sub (-)\n3. Multi (*)\n4. Div (/)\n5. Mod (%)\n0. Exit\nChoose the operation : ");
            oper = input.nextInt();
            switch (oper) {
                case 1:
                    System.out.print("Enter the first number : ");
                    x = input.nextInt();
                    System.out.print("Enter the second number : ");
                    z = input.nextInt();
                    System.out.println(x + "+" + z + " = " + (x + z)+"\n");
                    break;
                case 2:
                    System.out.print("Enter the first number : ");
                    x = input.nextInt();
                    System.out.print("Enter the second number : ");
                    z = input.nextInt();
                    System.out.println(x + "-" + z + " = " + (x - z)+"\n");
                    break;
                case 3:
                    System.out.print("Enter the first number : ");
                    x = input.nextInt();
                    System.out.print("Enter the second number : ");
                    z = input.nextInt();
                    System.out.println(x + "*" + z + " = " + (x * z)+"\n");
                    break;
                case 4:
                    System.out.print("Enter the first number : ");
                    x = input.nextInt();
                    System.out.print("Enter the second number : ");
                    z = input.nextInt();
                    System.out.println(x + "/" + z + " = " + (x / z)+"\n");
                    break;
                case 5:
                    System.out.print("Enter the first number : ");
                    x = input.nextInt();
                    System.out.print("Enter the second number : ");
                    z = input.nextInt();
                    System.out.println(x + "%" + z + " = " + (x % z)+"\n");
                    break;
                case 0:
                    System.out.println("Goodbye"); break;
                default:
                    System.out.println("invalid input, Try again");
            }
        }while(oper!=0);
    }
}
