import java.util.Arrays;

public class swap{

    public static void main(String[] args){

        int[] arr = {1 , 3, 23, 9, 18};

        swapElements(arr, 0 ,  4);

        System.out.println(Arrays.toString(arr));


        


    }

    
    static void swapElements(int[] arr, int index1, int index2) {

        int temp = arr[index1];

        arr[index1] = arr[index2];

        arr[index2] = temp;

    }
}