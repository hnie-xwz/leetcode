package com.xiewz.weichuang;

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



    /**
     * Definition for singly-linked list
     */
    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 1.使用 set 装入结点的值,
     * 2.遍历链表, 如果已经有相同的值, 就删除这个结点
     */
    /*public ListNode removeDuplicateNodes(ListNode head) {
        // 用来保存结点的值
        Set<Integer> set = new HashSet<>();
        ListNode cur = head;
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
    }*/

    /**
     * 定义一个 ListNode[], 把结点的 val 看作是下标
     * 1.当前下标下数组元素为 null, 添加到数组里面
     * 2.当前下标数组元素不为 null, 就删除当前结点;
     * 相比于 set 时间空间都好很多
     * https://blog.csdn.net/weixin_44014218/article/details/111068928
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode[] nodes = new ListNode[20001];
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            if (nodes[cur.val] == null) {
                nodes[cur.val] = cur;
                prev = cur;
            } else {
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }
}

