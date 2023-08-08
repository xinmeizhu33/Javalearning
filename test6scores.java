package day07;

import java.util.Scanner;

public class test6scores {
    public static void main(String[] args) {
        //比赛中，有6位评委给选手打分，分数范围是0~100之间的整数
        //选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分
        //分析：
        //1.定义一个数组，用来存储6名评委的打分
        //2.求出数组中的最大值
        //3.求出数组中的最小值
        //4.求出数组中6个分数的总和
        //5.（总和 - 最大值 - 最小值）/ 4
        //思路：用方法来做。
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i] + " ");
        }
        System.out.println();

        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSUm(scoreArr);

        int average = 0;
        average = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("The player last score is " + average);


    }

    //思路：用方法来做。
    //1.我要干嘛？定义一个数组，用来存储6名评委的打分（0~100）
    //2. 完成这件事，我需要什么数据？不需要，靠keyboard输入的数据
    //3.完成了，是否需要返回调用处？需要
    public static int[] getScores() {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
//        int scores = 0;
        for (int i = 0; i < arr.length; ) {
            System.out.println("Please enter the score between 0 and 100 from the judges: ");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("Please enter the score between 0 and 100 from the judges: ");
            }

        }
        return arr; //返回值给调用处

    }

    public static int getSUm(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }
        return max;
    }


    //定义一个方法，求最小值
    //变量的批量修改 shift + F6, 可以在这个方法内修改同一个变量名字。
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (min > scoreArr[i]) {
                min = scoreArr[i];
            }
        }
        return min;
    }


/*原始思路：
    public static void main(String[] args) {
        //比赛中，有6位评委给选手打分，分数范围是0~100之间的整数
        //选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分

        //分析：
        //1.定义一个数组，用来存储6名评委的打分

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the scores from the judges: ");
//        int score = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + " judge' score is : ");
//            int score = sc.nextInt();
//            arr[i] = score;
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //2.求出数组中的最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        //3.求出数组中的最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);

        //4.求出数组中6个分数的总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        //5.（总和 - 最大值 - 最小值）/ 4
        int average = 0;
        average = (sum - max -min)/4;
        System.out.println("This candidate the last score is " + average);

    }
    */
}
