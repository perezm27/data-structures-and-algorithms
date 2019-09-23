package GraphExercises;

public class Vertex<T> {

    public T value;

    public Vertex(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String toString(){
        return "" + this.value;
    }

}
