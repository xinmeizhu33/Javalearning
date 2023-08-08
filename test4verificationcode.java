package day07;

import java.util.Random;

public class test4verificationcode {
    /*需求：验证码
    * 定义方法实现随机产生一个5位数的验证码
    * 格式：长度为5，前四位是大写或小写的英文字母，最后一位是数字。
    * */

    //方法：
    //要在一堆没有什么规律的数据中随机抽取，可以先把这些数据放到数组当中，在随机抽取一个索引。
    //分析：
    //1.大写字母和小写字母都放到数组当中
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25){
                //添加小写字母
                //a----97
                chs[i] = (char)(97+i);  //ASCII码97+i: a~z;65+i:A~Z
            }else{
                //添加大写字母
                //A---65
                chs[i] = (char)(65 + i - 26);//此时i是从26开始。
            }

        }
/*        //bianli
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }*/

        //随机抽取四次
        //随机抽取数组中的索引

        Random r = new Random(); //定义一个随机数对象
        String result = ""; //定义一个空字符串

        for (int i = 0; i < 4; i++) {
             //利用随机索引，获取对应的元素。
            int randomIndex = r.nextInt(chs.length);
//            System.out.println(chs[randomIndex]); //换行打印出单个被抽取的字符
            //拼接四个英文字母
            result += chs[randomIndex];

        }

        //利用随机索引，获取对应的0~9的10个数字元素
        int num = r.nextInt(10);
        //把数字放到字符串的末尾
        result += num;
        System.out.println(result);


/*  错误的思路： 不要用array去存这个一位数字。
      //int arrIndex = r2.nextInt(arr.length);
        for (int i = 0; i < 10; i++) {
            int arrIndex = r.nextInt(arr.length);
            System.out.println(arr[arrIndex]);


        //0~51
/*
        int randomIndex= r.nextInt(chs.length);
        //利用随机索引，获取对应的元素。
        System.out.println(chs[randomIndex]);
*/

    }
}
