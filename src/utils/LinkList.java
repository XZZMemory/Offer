package utils;

public class LinkList {
    //带头节点
    public static Node creatListwithHead() {
        char[] string = "abde".toCharArray();
        Node p = new Node();
        Node head = p;
        Node q;
        for (int i = 0; i < string.length; i++) {
            q = new Node();
            q.info = string[i];
            q.next = null;
            p.next = q;
            p = q;
        }
        return head;
    }

    public static Node creatListwithOutHead() {
        char[] string = "abde".toCharArray();
        Node p = new Node();
        Node head = p;
        head.info = string[0];
        Node q;
        for (int i = 1; i < string.length; i++) {
            q = new Node();
            q.info = string[i];
            q.next = null;
            p.next = q;
            p = q;
        }
        return head;
    }

    public static Node creatListwithHead(char[] data) {
        Node p = new Node();
        Node head = p;
        Node q;
        for (int i = 0; i < data.length; i++) {
            q = new Node();
            q.info = data[i];
            q.next = null;
            p.next = q;
            p = q;
        }
        return head;
    }

    public static Node creatListCircle() {
        char[] string = "abcde".toCharArray();
        Node p = new Node();
        Node head = p;
        Node q;
        for (int i = 0; i < string.length; i++) {
            q = new Node();
            q.info = string[i];
            q.next = null;
            p.next = q;
            p = q;
        }
        p.next = head;
        return head;
    }

    //创建的是带头结点的链表，链表数据是int型数据
    public static NodeInt creatLinklistWithIntData(int[] number) {
        NodeInt p = new NodeInt();
        NodeInt q;
        NodeInt head = p;
        for (int i = 0; i < number.length; i++) {
            q = new NodeInt();
            q.info = number[i];
            q.next = null;
            p.next = q;
            p = q;
        }
        return head;
    }

    public static void traversalOfLinklistWithHeadWithIntData(NodeInt head) {
        if ((head == null) || (head.next == null)) {
            System.out.println("链表为空！");
            return;
        }
        NodeInt p = head.next;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }

    public static void traversalOfLinklistWithHead(Node head) {
        if (head == null) {
            System.out.println("链表为空！");
            return;
        }
        Node p = head.next;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }

    public static void traversalofLinklistWithoutHead(Node head) {
        if (head == null) {
            System.out.println("链表为空!");
            return;
        }
        Node p = head;
        while (p != null) {
            System.out.print(p.info+" ");
            p = p.next;
        }
        System.out.println();
    }

    public static void traversalOfLinkListWithHead(Node head) {
        Node p = head.next;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }
}
