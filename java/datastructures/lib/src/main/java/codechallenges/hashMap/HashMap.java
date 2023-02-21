package codechallenges.hashMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// NOTE: Does NOT preserve insertion order!
// WARNING: Don't make K an Object or Character!
public class HashMap<K, V> {
  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;

  public HashMap(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("HashMap size must be 1 or greater!");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
    for (int i = 0; i < this.size; i++) {
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  // Make sure to replace if the key is a dupe!
  public void set(K key, V value) {
    // TODO: implement me
    int setHM = hash(key);
    HashMapPair<K, V> newPair = new HashMapPair<>(key, value);
    LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(setHM);
    list.add(newPair);
  }

  public V get(K key) {
    // TODO: implement me

    return null;
  }

  public boolean contains(K key) {
    // TODO: implement me
    return false;
  }

  public List<K> keys() {
    // TODO: implement me
    return null;
  }

  // Sometimes hashCode in Java can be negative! So we need to do absolute value
  // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
  // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
  // If you do this, things that should collide, won't, because Object.hashCode() is not good
  // Protip: Testing collisions is easy with Integer, because Integer hashes to its own value
  public int hash(K key) {
    return Math.abs(key.hashCode()) % size;
  }


  public String repeatedWord(String str) {
    String key[] = str.split;
    HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
    for (int i = 0; i < strArray.length; i++) {
      if (wordsMap.containsKey(token[i]))
        wordsMap.put(token[i], wordsMap.get(token[i]) + 1);
      else {
        wordsMap.put(token[i] + 1);
      }
      for (int i = 0; i < token.length; i++) {
        int count = wordsMap.get(token[i]);
        if (count > 1) {
          return token[i];
        }

      }
      return "No Repeated Words";
    }
  }
}

