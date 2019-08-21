package utilities;

public class Animal {
    protected String preference;
    protected Animal next;

    public Animal(String preference) {
        this.preference = preference;
        this.next = null;
    }

    public String getPreference(){
        return this.preference;
    }
}
