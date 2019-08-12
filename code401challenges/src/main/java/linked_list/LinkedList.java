package linked_list;

public class LinkedList {
     Node head;

//  Constructor creates an empty list
    public LinkedList() {
        this.head = null;
    }

//  Set head
    public void setHead(int value){
//      creates new node
        head = new Node(value);
    }

    //Define a method called insert
    public void insert(Node newNode){
        if(head == null){
            head = newNode;
        } else {
           newNode.next = head;
           head = newNode;
        }

    }
// Checks to see if a value exists in our linked list
    public Boolean includes(Node node){
        Node current = head;
        //iterates through linked list
        while(current != null){
            if(current.value == node.value){
                return true;
            }
            //Resets current
            current = current.next;
        }

        return false;
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

            //points to the next node
            node = node.next;
        }

        return output.toString();
    }

}
