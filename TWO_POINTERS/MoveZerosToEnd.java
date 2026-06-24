package TWO_POINTERS;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {12,0,8,0,6,4,6,33,0};
        int n = arr.length;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;

            }
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
