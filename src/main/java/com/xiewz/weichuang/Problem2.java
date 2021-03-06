package com.xiewz.weichuang;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目二：统计数据
 * 给你一数组arr，请你帮忙统计数组中每个数的出现次数。
 * 示例
 * 输入：arr = [9,7,7,9,9,3]
 * 输出：在该数组中，9出现了3次，7出现了2次，3只出现了1次
 * 请用熟悉的语言编写代码
 */
public class Problem2 {

    public static void main(String[] args) {
        int[] arr = {9,7,7,9,9,3};
        new Problem2().statistics(arr);
    }

    public void statistics(int[] arr) {

        // 1. 使用map存储结果 key为数组中的值，value为出现的次数
        Map<Integer, Integer> resultMap = new HashMap<>();
        // 2. 遍历存入，每次存入时取出当前值出现次数进行+1
        for (int elem : arr)
            resultMap.put(elem, resultMap.getOrDefault(elem, 0) + 1);
        // 3. 打印结果
        printResult(resultMap);


    }

    private void printResult(Map<Integer, Integer> resultMap) {
        // 打印结果
        System.out.print("在该数组中");
        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            System.out.print(String.format("，%s出现了%s次",entry.getKey(),entry.getValue()));
        }
        System.out.println();
    }
}
