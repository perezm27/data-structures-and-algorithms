package utilities;

public class Queue {

    protected Animal front;
    protected Animal rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

//  Adds value to the end of the Queue
    public void enqueue(String preference){
        Animal newNode = new Animal (preference);
        if (this.front == null){
//  If Queue is empty the front and rear node are the same node.
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

//  Removes an item from the front of the Queue
    public String dequeue(){
        String preference = this.front.getPreference();
        if (this.front == null){
            throw new NullPointerException("top is null");
        } else {
            Animal temp;
            temp = this.front;
            this.front = this.front.next;
            temp.next = null;
        }
        return preference;
    }

//  Checks the value in the front of the Queue without removing that node.
    public String peek(){
        if (this.front == null){
            throw new NullPointerException("front is null");
        }
        return this.front.preference;
    }

//  ToString Method
    public String toString(){
        StringBuilder output = new StringBuilder("Queue: ");
        Animal node = this.front;

        while(node != null){
            if(node.next != null){
                output = output.append(node.preference + ", ");

            }else {
                output = output.append(node.preference );
            }
//  Points to the next node
            node = node.next;
        }
        return output.toString();
    }
}
