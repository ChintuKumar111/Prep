package Array;

public class SortingArrayElements {
    static void main() {
        int arr [] = {12,45,47,4,12,32,49,56,12,32,34};

        // performing sorting operation

        for(int i = 0 ; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }

      for(int num :arr){
          System.out.print(num+" ");
      }


    }
}
