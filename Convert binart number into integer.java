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
        int result = 0;
        
        while (head != null) {
            // Left shift by 1 (multiply by 2) and add current bit using bitwise OR
            result = (result << 1) | head.val;
            head = head.next;
        }
        
        return result;
    }
}
