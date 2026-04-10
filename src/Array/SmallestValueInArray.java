package Array;

public class SmallestValueInArray {
    static void main() {

        int arr [] = {10,12,18,8,47,9,4,2,74};
        int smallestValue = arr[0];

        for (int i = 1 ; i<arr.length;i++){

            if(arr[i]<smallestValue){
                smallestValue = arr[i];


            }
        }
        System.out.println("the smallest value is :" + smallestValue);
    }
}
