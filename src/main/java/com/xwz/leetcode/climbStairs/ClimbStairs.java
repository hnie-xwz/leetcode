package com.xwz.leetcode.climbStairs;


import com.sun.javafx.css.Combinator;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * </p>
 * <p>
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class ClimbStairs {

    /**
     * 答案 错误的已经不能用
     *
     * @param n
     * @return
     */
    @Deprecated
    public long answer(int n) {
        /**
         * - 第0位 ：1+0  1+0*（n-0）
         *
         * - 第1位：1+1 加了n-1-1次  1+1*（n-2）
         *
         * - 第2位：1+2 加了n-3-1次1+2*（n-4）
         *
         * - 第3位：1+3 加了n-6   次 1+3*（n-6）
         * 循环
         * ...
         */

        Long result = 0L;
        for (int i = 0; ; i++) {

            long calNum = i * (n - i * 2);

            if (calNum < 0) {
                break;
            }
            calNum += 1;
            System.out.println(calNum);

            result += calNum;
        }
        return result.intValue();
    }

    /**
     * 自己写的 答案
     *
     * @param n
     * @return
     */
    public int answer2(int n) {
        Long result = 0L;
        int m = -1;//上标
        while (true) {
            m++;//上标+1
            int index = n - m;//下标
            if (index < m) {
                break;
            }
            long comb = combination(index, m);
//            System.out.println("$$\n C_{" + index + "}^{" + m + "} = " + c+ " \n$$");
            result += comb;
        }
        return result.intValue();
    }


    /**
     * 组合C_n^m =\frac{n!}{m!(n-m)!}
     *
     * @param index 下标
     * @param m 上标
     * @return
     */
    public Long combination(int index, int m) {
        if (m >= index / 2 + 1) {
            m = index - m;
        }

        long comb = 1; // 这里把结果先看成 分子

        for (int i = index - m + 1; i <= index; i++) {// 循环m-1次
            comb *= i;
            comb /= i-index+m;

        }

        return comb;
    }


    /**
     * 更快的标准答案
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1 || n == 0)
            return 1;
        n = n - 1;
        int result = 0;
        int zero = 1;
        int first = 1;
        while (n > 0) {
            result = zero + first;
            zero = first;
            first = result;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        // C_{40}^5 = 658008
//        Long aLong = new ClimbStairs().combination(40, 5);
//        System.out.println(aLong);

    }

}
