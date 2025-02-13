 package aimrez.conditional;

public class LearningConditionals {


public static void main(String[] args) {


    // for(int i=0; i<5;i++){
    //     for(int j = 0; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
        
    // }




for(int i=0; i<5; i++){
    for(int j=0; j<5; j++){
if (i==2 || j==2) {
    System.out.print("*");
}else{System.out.print(" ");}
    }
    System.out.println();
}



/* 
int num =9;

switch (num) {
    case 1:System.out.println("one");
        
        break;
        case 2:System.out.println("two");
        break;
        case 3:System.out.println("three");
        break;

    default:System.out.println("this is not valid number");
        break;
}
/* */




/** 
//     int a = 10;
// int b = 15;
// int c= 20;

// if (a>=b) {
//     if (a>=c) {
//        System.out.println("A greater than b and c"); 
//     }else{
//         System.out.println("c grater than a nd b");
//     }
    
// }else{
//     if (b>=c) {
//         System.out.println("b greater than other ");
//     }else{
//         System.out.println("c greater than other");
//     }
// }
*/ 

int marks = 57;

/*
* >80 - A
* 70-80 - B
* 60-70 - C
* 50-60 - D
*   <50 - F
 */

if (marks >= 80) {
    System.out.println("A");
}else if (marks >= 70 && marks >=80) {
    System.out.println("B");
}else if (marks >=60 && marks <=60) {
System.out.println("C");
}else if (marks >=50 && marks <= 60) {
    System.out.println("D");
}else   {
    System.out.println("F");
}


}
    
}