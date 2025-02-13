package patterns;

import java.util.Scanner;

import array.reverseArray;

public class Star {
    
public static void main(String[] args) {
    for(int i =0; i<4; i++){
        for(int j = 0; j<4; j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }

    String s = revString("Ajay");
    System.out.println(s);

// Scanner reader =new Scanner(System.in);
// int num = reader.nextInt();
//    // // int n = 29;

//     // String a = num % 2 ==0 ?" is even":"is odd";
//     // System.out.println(num + a);2
    


    Scanner sc = new Scanner(System.in);
   int np = sc.nextInt();
   
//    System.out.println((np*(np+1))/2);
   System.out.println(np*(np+1)/2);

}

public static String  revString(String input){
    String reversed = " ";
    for(int i = input.length()-1; i>=0; i--){
        reversed += input.charAt(i);

    }
    return reversed;
}
}



