package day07;

public class test10reversearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
/*        int[] newArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            newArr[j] = arr[i];
        }*/
/*        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }*/
    }
}
