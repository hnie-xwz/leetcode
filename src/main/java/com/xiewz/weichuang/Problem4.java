package com.xiewz.weichuang;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目四：设计一个学生成绩存储类
 * 请设计一个学生成绩内存存储类，这个类有三个方法
 * 1. 保存最新批改的学生成绩（参数：成绩 返回：无）
 * 2. 删除最新批改的学生成绩（参数：无 返回：成绩）
 * 3. 获取最低学生成绩（参数：无 返回：最低成绩）
 * 要求：每个方法的时间复杂度为O(1)
 * 请用熟悉的语言编写代码
 */
public class Problem4 {

    List<Double> scroes = new ArrayList();

    // 1. 保存最新批改的学生成绩（参数：成绩 返回：无）
    public void save(double score) {
        scroes.add(score);
    }

    // 2. 删除最新批改的学生成绩（参数：无 返回：成绩）
    public double delete() {
        return scroes.remove(scroes.size() - 1);
    }

    // 3. 获取最低学生成绩（参数：无 返回：最低成绩）
    public double getLowest() {
        if(scroes.size()<1)
            return 0;
        double result = scroes.get(0);
        for (Double scroe : scroes) {
            if (scroe < result) {
                result = scroe;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem4 problem = new  Problem4();
        problem.save(20);
        problem.save(55);
        problem.save(23);
        double delete = problem.delete();
        System.out.println("删除分数："+delete);
        double lowest = problem.getLowest();
        System.out.println("最低分数："+lowest);
    }

}
