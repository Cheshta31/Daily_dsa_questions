https://leetcode.com/problems/design-hashmap/description/?envType=daily-question&envId=2023-10-04

class MyHashMap {
    private static final int SIZE = 1000;
    private LinkedList<Entry>[] buckets;
    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<Entry>();
        }
    }

    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value; 
                return;
            }
        }
        bucket.add(new Entry(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value; 
            }
        }
        
        return -1;
    }
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        for (Entry entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
    }
    private int hash(int key) {
        return key % SIZE;
    }
    private class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
