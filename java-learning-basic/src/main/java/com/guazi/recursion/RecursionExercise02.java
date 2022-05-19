package com.guazi.recursion;

/**
 * @ClassName RecursionExercise01
 * @Description TODO 递归求猴子吃桃子问题
 * @Author gaolijun
 * @Date 23:26 2022/5/18
 * @Version 1.0
 * 猴子吃桃子问题的概念：
 * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时
 * 想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？
 * 思路分析：
 * day=10,有一个桃子
 * day=9,有4个桃子 (1+1)*2
 * day=8,有10个桃子 （4+1）*2
 * day=7,有22个桃子 （10+1）*2
 * day=6,有46个桃子 （22+1）*2
 * day=5,有94个桃子 （46+1）*2
 * day=4,有190个桃子 （94+1）*2
 * day=3,有382个桃子 （190+1）*2
 * day=2,有766个桃子 （382+1）*2
 * day=1,有1534个桃子 （766+1）*2
 **/
public class RecursionExercise02 {
    public static void main(String[] args) {
        System.out.println(peach(1));
    }

    public static int peach(int day){
        if (day > 0) {
            if (day == 10 ){
                return 1;
            }else {
                return  2 * (peach(day+1)+1);
            }
        }else{
            System.out.println("day 在 1-10");
            return -1;
        }
    }
}
