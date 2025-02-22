import java.util.Arrays;
import java.util.Scanner;

public class LearnArraysClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr = {1,9, 3,2, 5,6,8,7};
         // Arrays.sort() => This method is used for sort the arrays in ascending order.
          Arrays.sort(arr);
        // Arrays.toString() => This method is used for convert Arrays to  String representation.
         String array =  Arrays.toString(arr);
         System.out.println(array);
        //System.out.println(Arrays.binarySearch(array));

         String[] names = new String[5];
       // System.out.print("Enter the String values : ");
          for(int i = 0 ; i < names.length ; i++){
             //  names[i] = sc.next();
          }
          for(String n : names){
            //  System.out.print(n+" ");
          }
       // System.out.println(Arrays.toString(arr));

        // Arrays.fill() => method is used for fill the array with a specific values
          int[] num = new int[10];
          Arrays.fill(num , 1);
        System.out.println(Arrays.toString(num));

        // Arrays.equals() => this method is used for compare two array are equal or not
        int[] num1 = { 1, 3, 4};
        int[] num2 = {5,6,7 };
        if(Arrays.equals(num1, num2)){
            System.out.println(" both array are equal.");
        }
        else {
            System.out.println("both array are not equal.");
        }
    }
}
