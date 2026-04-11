package Array;

public class ReverseArray {
    static void main() {
        int arr [] = {11,12,45,41};

        for(int i = 0 ; i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int num :arr){
            System.out.print("["+num+"]");
        }
    }

}
