import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTable<T> {
    int tableLength = 10;
    List<T>[] hashTable = (List<T>[])new ArrayList[tableLength];

    public HashTable() {
        for(int i = 0; i < hashTable.length; i++){
            hashTable[i] = new ArrayList<T>();
        }

    }

    public void add(T object) {
        int hash = hashObject(object);
        hashTable[hash].add(object);
    }

    public int hashObject(T object){
        return Math.abs(object.hashCode()) % tableLength;
    }

    

    public void print() {
        for (int i = 0; i < hashTable.length; i++) {
            List<T> hashTableEntries = hashTable[i];
            System.out.println("Hash entry for index " + i);
            for(int j = 0; j < hashTableEntries.size(); j++){
                System.out.println(" " + hashTableEntries.get(j));
            }
        }
    }

	public boolean contains(T object) {
		int hash = hashObject(object);
        return hashTable[hash].contains(object);
	}

}
