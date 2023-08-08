package day07;

import java.util.Scanner;

public class test7encrypt {
    public static void main(String[] args) {
        //需求：加密。如：1983，

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


        //实现：
        //1.需要计算出数组的长度
        //用Scanner接受一个正整数

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int number = sc.nextInt();

        //2.定义一个变量进行统计
        //定义一个变量保存接受到的整数，因为number需要参与统计位数而改变。
        int tempNum = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
        System.out.println(tempNum);
        //定义数组动态初始化
        int[] arr = new int[count];
        //3..将每一位的数字存进数组
//        int index = 0;
        //这样的index为0位，就是把整数的个位数存放在数组index为0的位置，这样会反转数字。
        //所以，这里index必须从length-1数组末位开始存放。
        int index = arr.length-1;
        while (tempNum != 0) {
            //获取tempNum里面的每一位数组
            int digit = tempNum % 10;
            //再去掉最右边的那位数字。
            tempNum = tempNum/10;
            //把当前获取到的个位添加到数组当中。
            arr[index] = digit;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        //4.加密：
        // 每一位数字先+5，然后%10取余.
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] + 5;
            temp[i] = temp[i] % 10;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
        }
        // 最后将数组反转。
        int[] newArr = new int[count];
        for (int i = 0, j = temp.length - 1; i < temp.length; i++, j--) {
            newArr[j] = temp[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        //5. 将所有数字拼接，变成加密之后的结果
        int num = 0;
        for (int i = 0; i < newArr.length; ) {
            num = num * 10 + newArr[i];
            i++;
        }
        System.out.println(num);

/*
        //分析：最简单、原始思路
        //1.将每一位的数字存进数组
        int[] arr = {1,9,8,3};

        //2.加密：
        // 每一位数字先+5，然后%10取余.
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] + 5;
            temp[i] = temp[i] % 10;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        // 最后将数组反转。
        int[] newArr = new int[4];
        for (int i = 0, j = temp.length-1; i < temp.length; i++, j--) {
            newArr[j]= temp[i];

        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();


        //3. 将所有数字拼接，变成加密之后的结果
        int num = 0;
        for (int i = 0; i < newArr.length;) {
            num = num*10 + newArr[i];
            i++;
        }
        System.out.println(num);

*/

    }
}
