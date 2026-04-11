package Array;

public class LargestInArray {

    static void main() {

        int arr [] = new int[5];
        int max = 0;
        int Smax= 0;

    // also we can search for third max

       arr = new int[]{11,12,5,34,5};
       arr[0] = max;

       for(int i = 1 ;i<arr.length;i++){
          if(arr[i]>max){
              Smax = max;
              max = arr[i];
          }
          else if(arr[i]>Smax && arr[i]!=max){
              Smax = arr[i];
          }
       }
        System.out.println(max);
        System.out.println(Smax);
    }
}
