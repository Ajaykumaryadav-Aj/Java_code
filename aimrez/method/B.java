package aimrez.method;

import java.util.Scanner;

public class B {


    public static void main(String[] args) {


        // *****************************************************
Scanner reader =new Scanner(System.in);
System.out.println("Enter number");
int num = reader.nextInt();

if (num %  2== 0) {
    System.out.println(num+" is even");
}else{
    System.out.println(num+" is odd");
}

// *******************************************************************

        A ai = new A(" Rahul ",15);
        A a2 = new A(" Ajay ", 20);

        ai.persion();
        a2.persion();
        System.out.println(A.sum(5, 60));

    }
    
}
