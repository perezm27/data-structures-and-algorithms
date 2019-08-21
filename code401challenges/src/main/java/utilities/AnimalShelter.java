package utilities;

public class AnimalShelter {
    Queue dogQueue = new Queue();
    Queue catQueue = new Queue();

    //  Adds value to the end of the Queue
    public void enQueue(String animal) {
        if (animal.equals("dog")){
            dogQueue.enqueue(animal);
        } else if(animal.equals("cat")){
            catQueue.enqueue(animal);
        }

    }

    public String deQueue(String preference){
        if (preference.equals("dog") && dogQueue.peek() != null){
             return dogQueue.dequeue();
        } else if (preference.equals("cat") && catQueue.peek() != null){
            return catQueue.dequeue();
        } else{
            return null;
        }
    }
}