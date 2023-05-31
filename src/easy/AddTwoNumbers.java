package easy;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class AddTwoNumbers {



//        public static void main(String[] args) {
//            AddTwoNumbers at = new AddTwoNumbers();
//            at.addTwoNumbers(68, 78);
//
//        }
//        int carry = 0;
//
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            if(l1 == null && l2 == null && carry == 0) {
//                return null;
//            }
//            int val1 = l1 == null ? 0 : l1.val;
//            int val2 = l2 == null ? 0 : l2.val;
//
//            int sum = val1 + val2 + carry;
//            carry = sum/10;
//
//            l1 = l1 == null ? null : l1.next;
//            l2 = l2 == null ? null : l2.next;
//
//            ListNode ans = new ListNode(sum%10, addTwoNumbers(l1, l2));
//
//            return ans;
//        }

}
