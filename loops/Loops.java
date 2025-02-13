package loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

// for Loops
        // for(int i = 0; i < 10; i++){
        //     System.out.println("hello "+ i);
        // }
       

// while loops'
//    int i = 0;
//    while (i<10) {
//    i++;
//     System.out.println(i);
//    }  



// do while loop
// int i = 1;
// do {
    
//     System.out.println(i);
//     i++;
// } while ( i < 10);


// Q .1 Sum of natural Number

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// for(int i = 0; i<n; i++){
//     sum = sum+i;
   
// } 
// System.out.println("Sum"+sum);


// Q.2 print the table of any number

Scanner sc =new Scanner(System.in);
int n = sc.nextInt();

for(int i = 1; i<=10; i++){
    System.out.println(i*n);
}

    }
}