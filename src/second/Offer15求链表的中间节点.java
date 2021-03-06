package second;

import utils.NodeUtil;
import utils.myObject.Node;

/**
 * created by memory
 * on 2019/6/3 下午4:22
 * 求一个无环链表的中间节点
 */
public class Offer15求链表的中间节点 {
    public static void main(String[] args) {
        Node head = NodeUtil.createListWithHead(new char[]{'a', 'b', 'c', 'd', 'e'});
        NodeUtil.traverseListWithHead(head);
        System.out.println(getMiddle(head).info);

    }

    public static Node getMiddle(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }
        }
        return slow;

    }
}
