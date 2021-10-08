package priv.samuel.javase.base;

import java.util.Scanner;

/**
 * @author: BEMuil
 * @project: JavaSELearning
 * @package： priv.samuel.javase.base
 * @creat_time： 2021-09-30 13:55
 * @description： 分支结构相关的代码
 */

public class AboutBranch {
    public static void main(String[] args) {
        new AboutBranch().scoreSwitch();
    }

    /**
     * 使用switch实现分数归类
     *  要点：
     *      对于分数类的归类，基本只需要关注十位或百位即可
     *      同时运用case穿透技巧实现分数的范围划分操作
     *      这样能大大减少枚举的数量
     */
    public void scoreSwitch(){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入有效成绩：");
        int score=input.nextInt();
        String str="";
        if(score<=100 && score >=0){
            switch(score/10){
                case 10:
                case 9:
                    str="优秀";
                    break;
                case 8:
                case 7:
                    str="良好";
                    break;
                case 6:
                    str="及格";
                    break;
                default:
                    str="不及格";
                    break;
            }
            System.out.println("您输入的成绩属于"+str+"范围");
        }else{
            System.out.println("分数输入有误！");
        }
    }
}
