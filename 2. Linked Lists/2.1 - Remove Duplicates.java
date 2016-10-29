public class LinkNode {
    LinkNode next = null;
    int data;
    LinkNode(int data){
        this.data = data;
        this.next = null;
    }

}

import java.util.HashSet;

/**
 * Created by Ankit on 22-Oct-16.
 */
public class LinkedList {
    LinkNode head;
    public static void main(String[] args){
        LinkNode n = new LinkNode(10);
        LinkedList list = new LinkedList();
        list.insertAtEnd(n);
        list.insertAtEnd(new LinkNode(3));
        list.insertAtEnd(new LinkNode(5));
        list.insertAtEnd(new LinkNode(7));
        list.insertAtEnd(new LinkNode(22));
        list.insertAtEnd(new LinkNode(5));
        list.insertAtEnd(new LinkNode(3));
        LinkNode n1 = new LinkNode(54);
        list.insertAtEnd(n1);
        list.printLinkedList(n);
        //System.out.println();
        //n = list.deleteLinkNode(n, 10);
        //list.printLinkedList(n);
        //System.out.println();
        //n = list.deleteLinkNode(n, 7);
        //list.printLinkedList(n);
        //n = list.reverseLinkedList(n);
        //list.removeDuplicates(n);
        list.usingRunner(n);
        System.out.println();
        list.printLinkedList(n);
    }
    public void insertAtEnd(LinkNode n){
        if(head == null){
            head = n;
        }
        else{
            LinkNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    /*public LinkNode deleteLinkNode(LinkNode head, int data){
        LinkNode temp = head;
        LinkNode first;
        first = head;
        if(temp.data == data){
            return first.next;
        }
        while(temp.next != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return first;
    }*/
    public void printLinkedList(LinkNode head){
        LinkNode temp;
        temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public void removeDuplicates(LinkNode head){
        HashSet<Integer> set = new HashSet<>();
        LinkNode temp = head;
        if(temp != null) {
            set.add(temp.data);
            while (temp.next != null) {
                if (!set.contains(temp.next.data)) {
                    set.add(temp.next.data);
                    temp = temp.next;
                }
                else {
                    temp.next = temp.next.next;
                }
            }
        }
    }
    public void usingRunner(LinkNode head){
        LinkNode temp = head;
        while(temp != null){
            LinkNode runner = temp;
            while(runner.next != null){
                if(runner.next.data == temp.data){
                    runner.next = runner.next.next;
                }
                else{
                    runner = runner.next;
                }
            }
            temp = temp.next;
        }
    }
}