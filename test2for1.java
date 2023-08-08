package day07;

import java.util.Scanner;

public class test2for1 {
    /*
    机票价格按照淡旺季，头等舱和经济舱收费，输入机票原价，月份和头等舱或经济舱
    规则：旺季（5-10月）头等舱9折，经济舱8.5折；淡季（11 -4月）头等舱7折，经济舱6.5折
     */

    //分析：
    //1.键盘录入机票原价、月份、头等舱或经济舱
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the flight ticket's original price: ");
        int ticket = sc.nextInt();
        //Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the month: ");
        int month = sc.nextInt();
        System.out.println("Please choose the type of seat: 0: Economic seat, 1: First classic");
        int seat = sc.nextInt();

        int price = 0;
        //2.先判断月份是旺季还是淡季
        //ctrl + alt + M 自动快捷键抽取方法
        if (month >= 5 && month <= 10) {
            //3. 判断舱位,判断当前机票是经济舱还是头等舱
            //旺季
//            ticket = getPrice(ticket, seat, 0.9, 0.85);
            price = getPrice(seat, price, ticket, 0.9, 0.85);
        }
        //else {
//            System.out.println("Sorry, we don't have this month.");

        else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
//            ticket = getPrice(ticket, seat, 0.7, 0.65);
            price = getPrice(seat, price, ticket, 0.7, 0.65);
        } else {
            System.out.println("Sorry, we don't have this month.");
        }
        System.out.print("Your ticket price is " + price);

    }

    private static int getPrice(int seat, int price, int ticket, double x, double x1) {
        if (seat == 1) {
            price = (int) (ticket * x);
        } else if (seat == 0) {
            price = (int) (ticket * x1);
        } else {
            System.out.println("Sorry, we don't have this seat.");
        }
        return price;
    }
    //判断舱位的部分，有重复。所以，可以抽取写成方法。
    //1.我要干嘛？决定了方法的方法体  根据舱位和折扣来计算最终的票价

    //2.干这件事，需要什么才能完成？ 决定了方法的形参 需要：原价、具体舱位、折扣

    //3.方法的调用处是否需要继续使用这个结果。决定了是否要返回值和它的类型   需要
//    public static int getPrice(int ticket, int seat, double v0, double v1) {
//        if (seat == 1) {
//            //4.根据实际情况计算出对应的价格
//            price = (int) (ticket * v0);
//        } else if (seat == 0) {
//            price = (int) (ticket * v1);
//        } else {
//            System.out.println("Sorry, we don't have this seat.");
//        }
//    }

}





