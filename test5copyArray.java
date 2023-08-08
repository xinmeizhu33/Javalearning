package day07;

public class test5copyArray {
    public static void main(String[] args) {
        //需求：复制一个老数组到新数组中

        //分析：
        // 1.定义一个老数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // 2. 定义一个新数组，长度必须和老数组一样
        int[] newArr = new int[arr.length];
//        int i, j = 0;

        // 3.遍历老数组，将老数组的每一个元素依次复制到新数组中。
        for (int i = 0; i < arr.length; i++) { //
//            for (j = 0; j < newArr.length ; j++) {
            newArr[i] = arr[i];
//                System.out.print(newArr[j] + ",");
//            }
//            System.out.print(arr[i] + " ");


        }
        //遍历老数组，打印出所有元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //打印一行为换行
        //遍历新数组，打印出所有元素，
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }
    }
}
