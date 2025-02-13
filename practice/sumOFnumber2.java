import java.util.Scanner;

class sumOFnumber2{
    public static void main(String args[])
    {
        int x,y,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = sc.nextInt();
        System.out.print("Enter the second number:");
        y = sc.nextInt();
        sum = x + y;
        System.out.print("The sum of two number x and y is: " + sum);
       // public static int sum(int a,int b)
       // {
            //int sum = a + b;
           // return sum;
        //}
    }
}