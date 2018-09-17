package com.xwz.leetcode.t2;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null; // 返回结果 也就是第一个节点
        ListNode next = null;
        int cnt = 0;    // 记录第一次循环

        int stepWay = 0;// 进位数
        while (!(l1 == null && l2 == null)) {
            // 第一次循环
            if (cnt == 0) {
                // 当前第一个节点的值
                int i = l1.val + l2.val;

                if (i >= 10) {
                    stepWay = 1; // 进位+1
                    i -= 10;
                }
                result = new ListNode(i);
                next = result;
                cnt = 1;
            }

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if (l1 == null && l2 == null) {
                break;
            }
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;


            int val = val1 + val2 + stepWay; // 计算节点值
            stepWay = 0;
            if (val >= 10) {
                stepWay = 1;
                val -= 10;
            }
            ListNode nextT = new ListNode(val);
            next.next = nextT;
            next = nextT;

        }
        if (stepWay != 0) {
            ListNode newNode = new ListNode(stepWay);
            next.next = newNode;
        }

        return result;

    }
}
