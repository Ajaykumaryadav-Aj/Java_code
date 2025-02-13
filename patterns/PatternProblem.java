package patterns;

public class PatternProblem {
   
    
public static void main(String[] args) {
 
for(int i =0; i<4; i++){
    for(int j =0; j<4; j++){
        if (i+j>=3) {
           System.out.print("*"); 
        }else{
            System.out.print(" ");
        }
        
    }
    System.out.println();
   
}







    /*
     1
     1 2
     1 2 3
     1 2 3 4
     */

    // for(int i = 0; i<5; i++){
    //     // int count = 1;
    //     for(int j = 1; j<=i; j++){
    //         System.out.print(j + " ");
    //         // count++;
    //     }
    //     System.out.println();
    // }


/*
1
2 2
3 3 3
4 4 4 4  
 */

// for(int i = 1; i<=4; i++){
//     for(int j = 1; j<=i; j++){
//         System.out.print(i + " ");
//     }
//     System.err.println(" ");
// }


/*
1
2 3
4 5 6
7 8 9 10
*/

// int count = 1;
// for(int i =0; i<4; i++){
//     for(int j = 0; j<=i; j++){
//         System.out.print(count+ " ");
//         count++;
//     }
//     System.out.println();
// }




}
}

