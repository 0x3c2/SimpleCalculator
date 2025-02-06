import java.util.Scanner;
public class calculator
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        float x, y;
        int oper;
        System.out.print("1. Sum (+)\n2. Sub (-)\n3. Multi (*)\n4. Div (/)\n5. Mod (%)\n0. Exit\nChoose the operation : ");
        oper =input.nextInt();
        if(oper==0) return;
        
        System.out.println("Enter two numbers to calculate :");
        x=input.nextInt();
        y =input.nextInt();
        switch(oper)
        {
            case 1:
                System.out.println(x+"+"+y+" = "+(x+y));
                break;
            case 2:
                System.out.println(x+"-"+y+" = "+(x-y));
                break;
            case 3:
                System.out.println(x+"*"+y+" = "+(x*y));
                break;
            case 4:
                System.out.println(x+"/"+y+" = "+(x/y));
                break;
            case 5:
                System.out.println(x+"%"+y+" = "+(x%y));
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
