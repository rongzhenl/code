/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead =new ListNode(0);
        ListNode cur =dummyHead;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                cur=cur.next;
                list1=list1.next;
            }else{
                cur.next=list2;
                cur=cur.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            cur=list1;
        }
        if(list2!=null){
           cur= list2;
        }
        return dummyHead.next;

    }
}
// @lc code=end

