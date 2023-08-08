package day07;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        //把整数上的每一位都添加到数组当中。当整数的位数不知道的时候，怎么破解?
        //进阶的思路：
        //需要运用反向推导：
        //把整数上的每一位都添加到数组当中
        // -->定义数组
        // --> 因为不知道整数的位数，必须定义成:动态初始化
        // --》需要计算出数组的长度
        // --》定义一个变量用于统计长度
        // --》不知道长度，所有必须用while loop。
        //实现的过程从反向推导的最后一步往第一步进行。

        //Enter a positive integer.
        Scanner sc = new Scanner(System.in);

        //reminder
        System.out.println("Please enter a positive integer: ");
        int number = sc.nextInt();
        int tempNum = number;

        //Use a array to save any digits as elements.
        int count = 0;
        int[] arr = new int[count];
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);

        int index = arr.length - 1;
        while (tempNum != 0) {
            int digit = tempNum % 10;
            tempNum = tempNum / 10;
            arr[index] = digit;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println(arr[i]);

        //encrypt process. +5 %10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        //reverse the array
        int[] newArr = new int[count];
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            newArr[j] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
        //change the array to integer.
        int num = 0;
        for (int i = 0; i < newArr.length; i++) {
            num = num * 10 + newArr[i];

        }
        System.out.println(num);


/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);

        //dingyi 一个array。
        int[] arr = new int[count];
        //Put the digits in array
        int index = arr.length - 1;

        while (temp != 0) {
            int digit = temp % 10;
            temp = temp / 10;
            arr[index] = digit;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        //对每一位数+5然后%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5)%10;
        }

        //前后index次序反转
        int[] newArr = new int[arr.length];
        for (int i = 0, j = arr.length-1; i < j; i++,j--) {
            newArr[j] = arr[i];
        }

        //拼接成数字返回
        int num = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            num = num* 10 + arr[i];
        }
        System.out.println(num);*/

    }
}
