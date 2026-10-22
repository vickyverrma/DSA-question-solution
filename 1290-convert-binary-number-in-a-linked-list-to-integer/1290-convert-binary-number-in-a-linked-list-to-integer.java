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
    public int getDecimalValue(ListNode head) {
        int res = 0;
        return num(head,res);
    }
    static int num(ListNode head, int res)
    {
        ListNode temp = head;
        if(temp == null) return res;
        res = res*2+temp.val;
        temp = temp.next;
        return num(temp,res);

    }
}