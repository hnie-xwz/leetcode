package com.xwz.leetcode.t2;

import java.util.List;

public class SolutionTest {
    ListNode listNode10;
    ListNode listNode20;

    @org.junit.Before
    public void setUp() throws Exception {
        listNode10 = new ListNode(0);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(6);
//        listNode10.next = listNode11;
//        listNode11.next = listNode12;

        listNode20 = new ListNode(0);
        ListNode listNode21 = new ListNode(6);
        ListNode listNode22 = new ListNode(4);
//        listNode20.next = listNode21;
//        listNode21.next = listNode22;
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addTwoNumbers() {


        printNode(listNode10);
        printNode(listNode20);

        Solution solution = new Solution();
        ListNode listNode30 = solution.addTwoNumbers(listNode10, listNode20);

        printNode(listNode30);


    }

    public void printNode(ListNode listNode) {
        if (listNode != null) {
            String printRes = "";
            printRes += listNode.val;
            while (listNode.next != null) {
                listNode = listNode.next;
                printRes += "->" + listNode.val;
            }
            System.out.println(printRes);
        } else {
            System.out.println("无数据");
        }
    }
}