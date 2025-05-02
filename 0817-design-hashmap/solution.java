class MyHashMap extends HashMap<Integer, Integer> {
    public int get(int val) {
        return super.getOrDefault(val, -1);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
