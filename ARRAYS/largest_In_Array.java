package ARRAYS;

public class largest_In_Array {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE; // -Infinity
         int smallest = Integer.MAX_VALUE; // +Infinity
 
        for(int i=0;i<numbers.length;i++){
         if(Largest<numbers[i]){
             Largest = numbers[i];
         }
         if(smallest>numbers[i]){
             smallest = numbers[i];
         }
        }
        System.out.println("Smallest Value is = " + smallest);
        return Largest;
     }
     public static void main(String args[]){
         int numbers[] = {1, 2, 6, 3, 5};
         System.out.println("Largest Value is = " + getLargest(numbers));
     }
}
