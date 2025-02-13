package array;

public class Largestnumber {
  
    public static void main(String args[]){
int arr[] = {2,4,6,7,82,21,1,0,1};


int max = arr[0];

for(int i = 0 ; i< arr.length; i++){
    if (max < arr[i]) {
       max = arr[i]; 
    }
}

System.out.println("largest number : "+max);
    }


}
