package com.xwz.leetcode.climbStairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbStairsTest {

    @Test
    public void ans() {
        ClimbStairs stairs = new ClimbStairs();
        int n = 565956959;
        n=46;
        long start = System.currentTimeMillis();
        for(int i=0;i<=n;i++){
        long result = stairs.answer2(i);
//        long result = stairs.climbStairs(i);
        System.out.println(i+"最终结果："+result);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"ms");
    }
}