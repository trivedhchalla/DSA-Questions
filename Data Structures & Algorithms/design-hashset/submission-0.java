class MyHashSet {
    Map<Integer,Integer> set;
    public MyHashSet() {
        set = new HashMap<>();
    }
    
    public void add(int key) {
        set.put(key,set.getOrDefault(key,0) + 1);
    }
    
    public void remove(int key) {
        set.remove(key);
    }
    
    public boolean contains(int key) {
        return set.containsKey(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */