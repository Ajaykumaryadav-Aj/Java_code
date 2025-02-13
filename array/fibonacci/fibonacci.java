package array.fibonacci;


public class fibonacci {
   
    public static void main(String[] args) {
      int N = 2;
       fib(N); 

    }

 static void fib(int N) {
   

int a = 0 , b = 1 ;
for(int i = 0 ; i < N; i++){
System.out.println(a + " ");
}
// swap 
int c = b + a;
a = b;
b = c;

 

   }

}
