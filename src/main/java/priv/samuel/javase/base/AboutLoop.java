package priv.samuel.javase.base;

import java.util.Scanner;

/**
 * @author: BEMuil
 * @project: JavaSELearning
 * @package： priv.samuel.javase.base.loop
 * @creat_time： 2021-09-29 22:58
 * @description： 循环结构相关的代码
 */

public class AboutLoop {
    public static void main(String[] args) {
//        new AboutLoop().countDays();

//        int[] arr=new AboutLoop().bubbleAsc(new int[]{1, 2, 5, 6, 9, 0, 29, 38, 22, 353, 343, 626, 4534, 54, 2, 04, 55, 7568, 29, 347, 99, 10});
//        for (int i : arr) {
//            System.out.print(i+" ");
//        }


    }

    /**
     * 控制台输出菱形
     * 要点：
     * 一个循环负责行数
     * 一个循环负责每行打印的内容
     * 每行都是由 " "和"*"组成的
     * 每行的"*"都是按照1，3，5，7，...的规律打印的
     */
    public void diamond01() {
        //菱形上半部分
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//
                System.out.print("*");
            }
            System.out.println();
        }
        //菱形下半部分
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 18 - (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 另一种菱形输出方法
     * 要点：
     * 找出每一行需要输出"*"的位置，其他位置输出" "
     * 每行输出"*"的位置要和行号建立关系
     */
    public void diamond02() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (6 - i == j || i + 4 == j || 14 - i == j || i - 4 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 统计输入日期距2000年1月1日的天数
     * 要点：
     *  结合for和if实现在遍历并筛选的功能
     *  循环遍历2000年到当前年份之间的所有年份
     *  如果是闰年天数累加366
     *  如果是平年天数累加365
     *  循环遍历1月到当前月份之间的所有月份
     *  如果是4，6，9，11月，天数累加30
     *  如果是2月，闰年天数累加29，平年累加28
     *  如果是其他月份，天数累加31
     */
    public void countDays() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        System.out.print("请输入日期：");
        int day = input.nextInt();
        int days = day;//初始化总天数为日期
        //循环年份，累加天数
        for (int i = 2000; i < year; i++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }
        //循环月份，累加天数
        for (int i = 1; i < month; i++) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                days += 30;
            } else if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += 31;
            }
        }
        System.out.println(year + "年" + month + "月" + day + "日，距离2000年1月1日有：" + days + "天");
    }
    /**
     * 冒泡排序
     * 要点：
     *  第一层循环负责确定进行两两交换的趟数
     *  第二层循环负责将每一趟的相邻元素两两比较并交换，将最大元素交换至该趟相关元素的尾部
     */
    public int[] bubbleAsc(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
