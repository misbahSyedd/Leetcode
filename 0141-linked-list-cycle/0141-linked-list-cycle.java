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
    public boolean hasCycle(ListNode head) {
        ListNode slowpointer = head, fastpointer = head;
        while(fastpointer != null && fastpointer.next != null)
        {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
            if(slowpointer == fastpointer)
            {
                          System.gc();

                return true;
            }
        }
                  System.gc();

        return false;


        
    }
}