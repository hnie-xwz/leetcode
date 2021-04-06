package com.xiewz.weichuang;

/**
 * 题目三：删除重复的分数
 * 删除重复的分数 有一组学生成绩，你直接在成绩单上删除重复出现的分数，使得每个分数只出现一次，返回删除后的分数总个数。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 示例 1:
 * 给定分数列表 scores = [1,1,2],
 * 函数应该返回新的分数个数 2, 并且原数组 scores 的前两个分数被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 scores = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的分数个数 5, 并且原数组 scores 的前五个分数被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 请用熟悉的语言编写代码
 */
public class Problem3 {

    public static void main(String[] args) {
        Integer[] scores = new Integer[]{1, 1, 2};
        scores = new Integer[]{0,0,1,1,1,2,2,3,3,4};
        int result = new Problem3().statisticsScores(scores);
        System.out.println(result);
        print(scores);
    }

    public static void print(Integer[] scores) {
        System.out.print("[" + scores[0]);
        if (scores.length > 1)
            for (int i = 1; i < scores.length; i++) {
                System.out.print(", " + scores[i]);
            }
        System.out.println("]");
    }

    public int statisticsScores(Integer[] scores) {
        // 参数校验
        if (scores == null) {
            return 0;
        }
        if (scores.length < 2) {
            return 1;
        }

        // 1. 遍历数组，重复分数设置为空
        // 两层遍历 保证空间复杂度为O1
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == null)
                continue;
            // 从下一个下标开始遍历
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] != null && scores[i].equals(scores[j])) {
                    scores[j] = null;
                }
            }
        }
        // 2. 整理数组，将分数转移到数组前面
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == null)
                return i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] != null) {
                    scores[i + 1] = scores[j];
                    scores[j] = null;
                    break;
                }
            }
        }
        return 0;
    }

}
