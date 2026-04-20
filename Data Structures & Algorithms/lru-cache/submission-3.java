class LRUCache {
    Map<Integer,Integer> keyValue;
    int capacity;
    public LRUCache(int capacity) {
        this.keyValue = new LinkedHashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (keyValue.containsKey(key)) {
            int value = keyValue.get(key);

            // to make it top of the map
            keyValue.remove(key);
            keyValue.put(key, value);

            return value;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if (keyValue.containsKey(key)) {
            keyValue.remove(key);
            keyValue.put(key, value);
            return;
        }

        if (keyValue.size() >= capacity) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer,Integer>) keyValue.entrySet().toArray()[0];
            keyValue.remove(entry.getKey());
        }

        keyValue.put(key, value);
        return;
    }
}
