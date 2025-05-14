public class leetcode_160 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);
        ListNode intersection = new ListNode(8);
        headA.next = new ListNode(1);
        headA.next.next = intersection;
        headB.next = intersection;
        headB.next.next = new ListNode(4);

        ListNode result = getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        if (headA == null || headB == null) return null;

        
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            
        
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

    return pointerA;
}}
