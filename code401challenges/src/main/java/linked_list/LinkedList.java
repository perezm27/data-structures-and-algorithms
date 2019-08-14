package linked_list;

public class LinkedList {
     Node head;

//  Constructor creates an empty list
    public LinkedList() {
        this.head = null;
    }

//  Set head
    public void setHead(int value){
//  creates new node
        head = new Node(value);
    }

//  Adds new node at the beginning of the Linked list
    public void insert(Node newNode){
        if(head == null){
            head = newNode;
        } else {
           newNode.next = head;
           head = newNode;
        }

    }
//  Checks to see if a value exists in our linked list
    public Boolean includes(Node node){
        Node current = head;
        //iterates through linked list
        while(current != null){
            if(current.value == node.value){
                return true;
            }
//  Resets current to point to the next node in the next iteration
            current = current.next;
        }

        return false;
    }

//  Adds node to the end of the linked List
    public void append(int value){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
            Node newNode = new Node(value);
            current.next = newNode;
    }

//  Inserts new node before a given value
    public void insertBefore(int value, int newVal){
        Node current = head;
        while(current != null){
            if(current.next.value == value){
                Node newNode = new Node(newVal);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

// Inserts new node after a given value
    public void insertAfter(int value, int newVal){
        Node current = head;
        while(current != null){
            if(current.value == value){
                Node newNode = new Node(newVal);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

    }

//  Returns node in k-th value from the end of a linked list.
    public int insertK(int k){
        int length = 0;
//  exception to deal with null pointer values
        int exception = -1;

        Node current = head;
//  Captures length of linked list
        while (current != null){
            current = current.next;
            length++;
        }
//  sets klength
        current = head;
        for (int i = 0; i < length - k - 1; i++) {
            if (i == k){
                return current.value;
            }
            current = current.next;
        }
      return exception;

    }

//  Returns a string representing all the values in the Linked List.
    public String toString(){
        StringBuilder output = new StringBuilder("Linked List: ");
        Node node = head;

        while(node != null){
            if(node.next != null){
                output = output.append(node.value + ", ");

            }else {
                output = output.append(node.value );
            }

//  Points to the next node
            node = node.next;
        }

        return output.toString();
    }

}
