package day07;

public class test9decrypt {
    public static void main(String[] args) {
        //把整数上的每一位都添加到数组当中。当整数的位数不知道的时候，怎么破解?
        //规则如下：每位数加上5，再对10取余，最后将所有数字反转，得到一串新数字。
        //按照以上规则解密： 比如1983加密后变成8346，解密后变成1983.

        //思路：
        //需要运用反向推导：
        //把整数上的每一位都添加到数组当中
        // -->定义数组
        // --> 因为不知道整数的位数，必须定义成:动态初始化
        // --》需要计算出数组的长度
        // --》定义一个变量用于统计长度
        // --》不知道长度，所有必须用while loop。
        //实现的过程从反向推导的最后一步往第一步进行。
        //1.定义数组记录揭秘之后的结果
        int[] arr = {8,3,4,6,1,2,4,5,6,9};
        //反转数组方法1
/*        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        */

        //反转数组方法2：
        int[] newArr = new int[arr.length];
        for (int i = 0,k = arr.length -1; i <arr.length; i++, k--) {  //在这里不限定i<k,仅限定i<arr.length,反而可以完成反转。
            newArr[k] = arr[i];
                //为什么反转的结果是0038，不是6438？当for (int i = 0,k = arr.length -1; i < k; i++, k--),结果只反转一半数组。
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(newArr[i]);
        }
        // 3.由于加密是通过对10取余的方式进行获取的
        //所以再解密是就需要判断，0~4之间+10，5~9数字不变
        /*for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] <=4){
                arr[i] = arr[i] + 10;
            }
        }
        //Every digit must be reduce 5.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] -5;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number*10 + arr[i];
        }
        System.out.println(number);*/


    }
}
