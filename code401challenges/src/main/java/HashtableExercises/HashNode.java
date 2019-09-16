package HashtableExercises;

public class HashNode {

    public String key;
    public String value;
    public HashNode next;

    public HashNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

//  Getters & Setters

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }


}
