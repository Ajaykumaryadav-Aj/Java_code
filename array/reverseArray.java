package array;

// public class reverseArray {
    


// public static void reverse(int[] ar){

// int i= 0, j= ar.length-1;
// while (i < j) {
//     int t = ar[i];
//     ar[i] = ar[j];
//     ar[j] = t;
//     i++;
//     j--;
    
// }

// }


// public static void main(String[] args) {
    
// int ar []= {1,2,3,4,5,6,7};
// reverse(ar);
// System.out.println(ar);



// }

// }


// Basic Java program that reverses an array 

public class reverseArray { 

	// function that reverses array and stores it 
	// in another array 
	static void reverse(int a[], int n) 
	{ 
		int[] b = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++) { 
			b[j - 1] = a[i]; 
			j = j - 1; 
		} 

		// printing the reversed array 
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(b[k]); 
		} 


	} 


//  Sum of all elements of array
	public static void sumAll(){

        int [] arr = {1,2,3,4,5};
		int sum =0;
		for(int i = 0; i < arr.length; i++){
			sum = sum+i;
		}
		System.out.println("sum of all elements :"+sum);
	}



	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 

		sumAll();


	} 
} 
