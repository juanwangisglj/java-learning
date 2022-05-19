package com.guazi.recursion;

/**
 * @ClassName RecursionExercise01
 * @Description TODO 递归求斐波那契数
 * @Author gaolijun
 * @Date 23:26 2022/5/18
 * @Version 1.0
 * 斐波那契数的概念：
 * {1,1,2,3,5,8,13,21...}
 * 1. 当 n = 1 斐波那契数 是 1
 * 2. 当 n = 2 斐波那契数 是 1
 * 3. 当 n >= 3 斐波那契数 是前两个数的和
 **/
public class RecursionExercise01 {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    /**
     * 请使用递归的方式求出斐波那契数 1,1,2,3,5,8,13...给你一个整数 n，求出它的值是多
     * @param n
     * @return
     */
    public static int fibonacci(int n){
        if (n >= 1) {
            if (n == 1 || n == 2){
                return 1;
            }else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }else{
            System.out.println("要求输入的 n>=1 的整数");
            return -1;
        }
    }
}
