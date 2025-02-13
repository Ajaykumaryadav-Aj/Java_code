package patterns;


public class Patterns {
    
public static void print1(int n){
    for(int i = 0; i<n; i++){
        for(int j = 0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

public static void print2(int n){
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println(" ");
    }
}

public static void print3(int n){
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(i);
        }
        System.out.println();
    }
}

public static void print4(int n){

    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=n-i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void print5(int n){
    for(int i = 1; i<n; i++){
        for(int j = 1; j<n-i+1; j++){
System.out.print(j);
        }
        System.out.println();
    }
}

public static void print6(int n){
for(int i = 0; i<n; i++){
   for(int j = 0; j<n-i-1; j++){
    System.out.print(" ");
   }

   for(int j = 0; j<2*i+1; j++){
    System.out.print("*");
   }
   for(int j = 0; j<n-i-1; j++){
    System.out.print("");
   }
   System.out.println();
}
}


// palindrone 

public static boolean palindronePrint(int x){
    int sum = 0 , target = x;

    while (x > 0) {
      int temp = x % 10;
      x = x / 10;
      sum = sum*10+temp;


    }
    return sum == target;
   
}

public static void main(String[] args) {
    

     int[] numbers ={1,2,3,4,5,6,7};
     for(int i = 0; i< numbers.length; i++){
        System.out.println("index "+i + ":"+numbers[i]);
     }
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// print1(n);

 print2(5);
// print3(5);
// print4(5);
// print5(6);
// print6(5);
System.out.println(palindronePrint(151));
}

}
