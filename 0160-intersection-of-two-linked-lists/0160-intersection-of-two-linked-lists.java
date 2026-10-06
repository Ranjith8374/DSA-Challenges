/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        ListNode temp1=headB;
        int m=0;
        while(temp1!=null){
            temp1=temp1.next;
            m++;
        }
        int d=Math.abs(n-m);
        if(n>m){
             temp=headA;
            for(int i=0;i<d;i++){
               temp=temp.next;
            }
             temp1=headB;
            for(int i=d;i<n;i++){
                if(temp==temp1){
                    return temp;
                }
                temp=temp.next;
                temp1=temp1.next;
            }
        }else{
             temp=headB;
            for(int i=0;i<d;i++){
               temp=temp.next;
            }
             temp1=headA;
            for(int i=d;i<m;i++){
                if(temp==temp1){
                    return temp;
                }
                temp=temp.next;
                temp1=temp1.next;
            }
        }
        return null;
    }
}