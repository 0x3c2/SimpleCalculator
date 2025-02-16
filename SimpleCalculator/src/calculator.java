import java.util.Scanner;
public class calculator
{
    static int operation;
    public static float howManyNumbers()
    {
        int size;
        Scanner input=new Scanner(System.in);
        System.out.print("How many numbers you like to calculate : ");
        size=input.nextInt();
        float nums[]=new float[size];
        float calcNums =0;
        if(operation==1)
        {
            for (int i = 0; i < size; i++) {
                System.out.print("Enter your #"+(i+1)+" number : ");
                nums[i] = input.nextFloat();
                calcNums += nums[i];
            }
        }
        if (operation==2){
            for (int i = 0; i < size; i++) {
                System.out.print("Enter your #"+(i+1)+" number : ");
                nums[i] = input.nextFloat();
                calcNums -= nums[i];
            }
        }
        if (operation==3){
            calcNums =1;
            for (int i = 0;i < size; i++) {
                System.out.print("Enter your #"+(i+1)+" number : ");
                nums[i] = input.nextFloat();
                calcNums *= nums[i];
            }
        }
        System.out.println("Your result is: "+calcNums+"\n");
        return calcNums;
    }

    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        float x, y;
//        int operation;

        do
        {
            System.out.print("1. Sum (+)\n2. Sub (-)\n3. Multi (*)\n4. Div (/)\n5. Mod (%)\n0. Exit\nChoose the operation : ");
            operation = input.nextInt();
            switch (operation) {
                case 1:
                    howManyNumbers();
                    break;
                case 2:
                    howManyNumbers();
                    break;
                case 3:
                    howManyNumbers();
                    break;
                case 4:
                    System.out.print("Enter the first number : ");
                    x = input.nextInt();
                    System.out.print("Enter the second number : ");
                    y = input.nextInt();
                    System.out.println(x + "/" + y + " = " + (x / y)+"\n");
                    break;
                case 5:
                    System.out.print("Enter the first number : ");
                    x = input.nextInt();
                    System.out.print("Enter the second number : ");
                    y = input.nextInt();
                    System.out.println(x + "%" + y + " = " + (x % y)+"\n");
                    break;
                case 0:
                    System.out.println("Goodbye"); break;
                default:
                    System.out.println("invalid input, Try again");
            }
        }while(operation !=0);
    }
}
