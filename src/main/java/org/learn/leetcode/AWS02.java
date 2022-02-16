package org.learn.leetcode;

// https://leetcode-cn.com/problems/add-two-numbers/

import java.util.HashMap;
import java.util.Map;

public class AWS02 {
    public static void main(String[] args){
        AWS02 test = new AWS02();

//        test.test(new int[]{2,4,3}, new int[]{5,6,4});

        System.out.println("******************************");
//        test.test(new int[]{2,4,9}, new int[]{5,6,4,9});
        test.test(new int[]{9}, new int[]{1,9,9,9,9,9,9,9,9});

        System.out.println("******************************");
        test.test(new int[]{9}, new int[]{1,9,9,9,9,9,9,9,9,9});

    }
    public void test(int[] arr1, int[] arr2){

        ListNode l1 = initListName(arr1);
        ListNode l2 = initListName(arr2);

        print(l1);
        print(l2);

        ListNode result = addTwoNumbers( l1,  l2);
        print(result);
    }

    public void print(ListNode node){

        while(node.next!=null){
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println(node.val);
    }

    public ListNode initListName(int[] arr){
        ListNode node = new ListNode(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            ListNode next = new ListNode(node.val, node.next);
            node = new ListNode(arr[i], next);
        }

        return node;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long sum1 = getSum(l1);
        long sum2 = getSum(l2);
        long sum = sum1 + sum2;
        System.out.println("Sum:\t" + sum);
        return getNode(sum);
    }

    public long getSum(ListNode node){

        if(node.next == null) return (long)node.val;

        return (long)node.val + 10*getSum(node.next);
    }

    public ListNode getNode(long sum){
        if(sum < 10) {
            System.out.println(sum);
            return new ListNode((int)sum);
        }


        return new ListNode((int)sum%10, getNode(sum/10));
    }
}


