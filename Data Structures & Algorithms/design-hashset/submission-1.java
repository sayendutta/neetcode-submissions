class MyHashSet {
    List<Integer> hashSet;
    public MyHashSet() {
        hashSet = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
            hashSet.add(key);
    }
    
    public void remove(int key) {
        hashSet.remove(Integer.valueOf(key));//force it to remove the value instead of index
    }
    
    public boolean contains(int key) {
        if(hashSet.isEmpty())
            return false;
        for(int ele : hashSet) {
            if(ele == key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */