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
        if(head == null){
            head = new Node(value);
            return;
        }
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
        Node current = head;

//  Captures length of linked list
        while (current != null){
            current = current.next;
            length++;
        }
//  Handles exception
        if(k > length || k < 0){
            throw new IllegalArgumentException();
        }
//  sets klength
        current = head;

        for (int i = 0; i < length - k - 1; i++) {
            if (i == k){
                return current.value;
            }
            current = current.next;
        }
      return current.value;

    }

//  Merge's 2 linked lists
    public static LinkedList mergeLists(LinkedList llOne, LinkedList llTwo){
//  Handles our Exceptions
        if(llOne.head != null && llTwo.head == null){
            return llOne;
        } else if(llOne.head == null && llTwo.head != null){
            return llTwo;
        } else if(llOne.head == null && llTwo.head == null){
            throw new NullPointerException();
        }

//  Sets head & current for both Linked lists
        Node currentLLOne = llOne.head;
        Node currentLLTwo = llTwo.head;
        Node runner1 = currentLLOne.next;
        Node runner2 = currentLLTwo.next;

//  Iterates through both Linked lists as long as there is data in them
        while(runner1 != null && runner2 != null){
//  Alternates between the two lists
            currentLLOne.next = currentLLTwo;
            currentLLOne = currentLLOne.next;
            currentLLTwo = currentLLTwo.next;
            currentLLOne.next = runner1;
            currentLLOne = currentLLOne.next;
            runner1 = currentLLOne.next;
            runner2 = currentLLTwo.next;
        }

//  If first list is longer
        if(runner1 != null && runner2 == null){
            currentLLOne.next = currentLLTwo;
            currentLLOne = currentLLOne.next;
            currentLLOne.next = runner1;

//  If second List is longer
        } else {
            currentLLOne.next = currentLLTwo;
        }
        return llOne;
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
