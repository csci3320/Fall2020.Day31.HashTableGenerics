import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
  public static void main(String[] args) {
    new Main();
  }

 
  public Main() {
    // 1-123-456-7890
    // 1,234,567,890
    /// int[] array = new int[1_234_567_890];
    // System.out.println(array.length);
    HashTable<String> hashTable = new HashTable<String>();
    
    String[] strings = { "Happy", "Veterans", "Day", "computer", "science", "csci", "3320", "data", "structures" };
    for (int i = 0; i < strings.length; i++) {
      String string = strings[i];
      hashTable.add(string);
    }

    // Print hash table
    hashTable.print();

    System.out.println(hashTable.contains("Happy"));
    System.out.println(hashTable.contains("Sad"));
  }

  
}
