package com.xwz.leetcode.climbStairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbStairsTest {

    @Test
    public void ans() {
        int n = 565956959;
        n=6;
        long start = System.currentTimeMillis();
        long result = new ClimbStairs().answer(n);
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"ms");
        System.out.println("最终结果："+result);
    }
}