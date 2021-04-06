package com.xiewz.weichuang;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目一：移除重复数
 * 编写代码，移除链表中的重复节点
 * 示例1:
 * 输入：[10, 20, 30, 30, 20, 10]
 * 输出：[10, 20, 30]
 * 示例2:
 * 输入：[10, 10, 10, 10, 20]
 * 输出：[10, 20]
 * 请用熟悉的语言编写代码
 */
public class Problem1 {


    public static void main(String[] args) {
        // 1. 初始化链表节点
        ListNode head = new ListNode(10);
        head.add(new ListNode(20))
                .add(new ListNode(30))
                .add(new ListNode(30))
                .add(new ListNode(20))
                .add(new ListNode(10));

        // 2. 执行测试
        ListNode result = new Problem1().remove(head);
        // 3. 打印结果
        print(result);

    }


    public ListNode remove(ListNode head) {
        // 1. 使用 set 来保存结点的值
        Set<Integer> set = new HashSet<>();
        ListNode cur = head;
        // 2.遍历链表, 如果已经有相同的值, 就删除这个结点
        // 当前结点 cur 的前驱结点. 以便删除
        ListNode prev = null;
        while (cur != null) {
            if (!set.contains(cur.val)) {
                prev = cur;
                set.add(cur.val);
            }else {
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void print(ListNode listNode){
        System.out.print("["+listNode.val);
        ListNode cur = listNode.next;
        while (cur != null){
            System.out.print(", "+cur.val);
            cur = cur.next;
        }
        System.out.println("]");
    }
}

/**
 * 定义链表节点
 */
class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode add(ListNode addNode){
        this.next = addNode;
        return addNode;
    }
}

