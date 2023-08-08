package day07;

public class test3Prime{
    //判断101-200之间的质数prime number.

    public static void main(String[] args) {
        //review: determine an integer if it is the prime number.

/*        int i = 100;
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }
        */
        //判断101-200之间的质数prime number. reviewing:
        //更优化的方法：是用除数的平分根。
        int count = 0;



        for (int i = 101; i < 200; i++) {

            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i + " is a prime.");
                count++;
            } else {
                System.out.println(i + " is not a prime.");
            }
        }
        System.out.println("The totally number of prime is " + count);


       /*
        int count = 0;
        for (int i = 101; i < 200; i++) {   //outside loop

            boolean flag = true;

            for (int j = 2; j < i; j++) {  //inside loop
                if (i % j == 0) {
                    flag = false;
                    break; //跳出内循环
                }
            }
            if(flag){
                System.out.println( i + " is a prime number");
                count ++;
            }else{
                System.out.println(i + " is not a prime number");
            }

        }
        System.out.println(count);
         */

    }
}
