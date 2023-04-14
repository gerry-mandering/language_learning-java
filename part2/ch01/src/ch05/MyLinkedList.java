package ch05;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode;
        if (head == null) {
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {

    }
}
