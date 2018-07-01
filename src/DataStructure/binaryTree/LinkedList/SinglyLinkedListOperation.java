package DataStructure.binaryTree.LinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class SinglyLinkedListOperation {
    Node insetNewNodeAtRear(Node head, int newvalue) {
        if (head == null) {
            head = new Node(newvalue);
            return head;
        } else {
            Node lastNode = listTraversal(head);
            Node newNode = new Node(newvalue);
            lastNode.next = newNode;
            return head;
        }
    }

    Node insertNodeAtHead(Node head, int newvalue) {
        if (head == null) {
            head = new Node(newvalue);
            return head;
        } else {
            Node tempNode = new Node(newvalue);
            tempNode.next = head;
            return tempNode;
        }
    }

    Node listTraversal(Node head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

    void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            System.out.print(" ");
            head = head.next;
        }
    }

    Node deleteNode(Node head, int deleteValue) {
        Node prev = null;
        if (head != null && head.data == deleteValue) {
            head = head.next;
            return head;
        }
        while (head != null && head.data != deleteValue) {
            prev = head;
            head = head.next;
        }
        if (head == null)
            return head;
        prev.next = head.next;

        return head;

    }

    Node deleteNodeAtPos(Node head, int pos) {
        Node temp = head;
        if (temp == null) {
            return head;
        }
        if (pos == 0) {
            return temp.next;
        }
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null)
            return temp;
        Node next = temp.next.next;
        temp.next = next;
        return head;
    }

    Node reverseLinkedList(Node head) {
        Node prev = null;
        Node next = null;
        Node current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    Node reverseLinkedListWithRecursion(Node curr, Node prev) {
        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }
        Node next = curr.next;
        curr.next = prev;
        return reverseLinkedListWithRecursion(next, curr);

    }

    Node segregateEvenOddNode(Node head) {
        if (head == null)
            return head;
        else {
            Node even = null;
            Node odd = null;
            while (head != null) {
                if (head.data % 2 == 0) {
                    if (even == null) {
                        even = head;
                    } else {

                        even.next = head;
                        even = even.next;
                        even.next = null;
                    }
                } else {
                    if (odd == null) {
                        odd = head;
                    } else {
                        odd.next = head;
                        odd = odd.next;
                        odd.next = null;
                    }
                }
                head = head.next;
            }
            if (even != null && odd != null) {
                even.next = odd;
                return even;
            } else if (even == null) {
                return odd;
            } else {
                return even;
            }
        }
    }

    boolean detectLoopHashSet(Node head) {
        HashSet<Node> uniqueSet = new HashSet<>();
        while (head != null) {
            if (uniqueSet.contains(head))
                return true;

            uniqueSet.add(head);
            head = head.next;
        }
        return false;
    }

    Node createLoop(Node head) {
        Node temp = head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = temp;
        return head;
    }
    boolean detectLoopFloydCycle(Node head){
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                System.out.println("loop found");
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = null;
        SinglyLinkedListOperation singlyOpe = new SinglyLinkedListOperation();
        boolean flag = true;
        while (flag) {
            System.out.println("Please select your choice");
            System.out.println("1 For insert new node in last");
            System.out.println("2 For Printing");
            System.out.println("3 For insert new node in front");
            System.out.println("4 For delete a node in List");
            System.out.println("5 Delete element by position");
            System.out.println("6 For reverse the LinkedList");
            System.out.println("7 For reverse the LinkedList throw recursion ");
            System.out.println("8 For Segregate even and odd nodes in a LinkedList");
            System.out.println("9 For detecting loop by HashSet");
            System.out.println("10 For creating loop");
            System.out.println("11 For detecting loop by Floyd's cycle detection");
            Scanner scnInt = new Scanner(System.in);
            int choice = scnInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Insert the value ");
                    int newvalue = scnInt.nextInt();
                    head = singlyOpe.insetNewNodeAtRear(head, newvalue);
                    break;
                case 2:
                    singlyOpe.printLinkedList(head);
                    break;
                case 3:
                    System.out.println("Insert the value");
                    int newHead = scnInt.nextInt();
                    head = singlyOpe.insertNodeAtHead(head, newHead);
                    break;
                case 4:
                    System.out.println("Insert the value whitch we want to delete");
                    int deletedNode = scnInt.nextInt();
                    head = singlyOpe.deleteNode(head, deletedNode);
                    break;
                case 5:
                    System.out.println("Insert Position to delete");
                    int delPos = scnInt.nextInt();
                    head = singlyOpe.deleteNodeAtPos(head, delPos);
                    break;
                case 6:
                    head = singlyOpe.reverseLinkedList(head);
                    break;

                case 7:
                    head = singlyOpe.reverseLinkedListWithRecursion(head, null);
                    break;
                case 8:
                    head = singlyOpe.segregateEvenOddNode(head);
                    break;
                case 9:
                    if (singlyOpe.detectLoopHashSet(head)) {
                        System.out.println("loop detected");
                    } else
                        System.out.println("loop not detected");
                    break;
                case 10:
                    head = singlyOpe.createLoop(head);
                    break;
                case 11:
                    if (singlyOpe.detectLoopFloydCycle(head)) {
                        System.out.println("loop detected");
                    } else
                        System.out.println("loop not detected");
                    break;
                default:
                    flag = false;
                    break;
            }

        }
    }
}
