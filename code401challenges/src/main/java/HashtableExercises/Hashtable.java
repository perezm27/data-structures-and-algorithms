package HashtableExercises;


public class Hashtable {
    public HashNode[] map;

    public Hashtable(int size){
        map = new HashNode[size];
    }

//  Hash: takes in an arbitrary key and returns an index in the collection.
    public int hash(String key){
        int hashValue = 0;
        char[] indexes = key.toCharArray();
        for(int i = 0; i < indexes.length; i++){
            hashValue += indexes[i];
        }
//  Gives us the size or range of our HashTable.
        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }


//add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    public void add(String key, String value){
        int hashKey = hash(key);

        if(this.map[hashKey] == null){
            map[hashKey] = new HashNode(key, value);
        } else{
            HashNode temp = map[hashKey];
            map[hashKey] = new HashNode(key,value);
            map[hashKey].setNext(temp);
        }
    }


//get: takes in the key and returns the value from the table.
    public String get(String key){
        int hashKey = hash(key);

        HashNode current = map[hashKey];

        while(current != null){
            if(current.getKey().equals(key)){
                return current.getValue();
            }
            current = current.getNext();
        }

        return "The value does not exist in the HashTable";
    }

//contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public Boolean contains(String key){
        int hashKey = hash(key);

        HashNode current = map[hashKey];

        while(current != null){
            if(current.getKey().equals(key)){
                return true;
            }
            current = current.getNext();
        }

        return false;
    }
}
