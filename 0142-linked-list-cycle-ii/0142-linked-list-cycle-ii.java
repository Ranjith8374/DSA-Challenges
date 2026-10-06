/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        if(s==f){
            ListNode t1=s;
            ListNode h2=s.next;
            s.next=null;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        ListNode temp1=h2;
        int m=0;
        while(temp1!=null){
            temp1=temp1.next;
            m++;
        }
        int d=Math.abs(n-m);
        if(n>m){
             temp=head;
            for(int i=0;i<d;i++){
               temp=temp.next;
            }
             temp1=h2;
            for(int i=d;i<n;i++){
                if(temp==temp1){
                    return temp;
                }
                temp=temp.next;
                temp1=temp1.next;
            }
        }else{
             temp=h2;
            for(int i=0;i<d;i++){
               temp=temp.next;
            }
             temp1=head;
            for(int i=d;i<m;i++){
                if(temp==temp1){
                    return temp;
                }
                temp=temp.next;
                temp1=temp1.next;
            }
        }
        }

    }
    return null;
    }
}