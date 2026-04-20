class LRUCache {
    Map<Integer, Node> map;
    int capacity;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public void add(Node node) {
        Node nextNode = head.next;

        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }

    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        add(node);

        return node.val;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;

            remove(node);
            add(node);

            return;
        }

        if (map.size() == capacity) {
            Node lru = tail.prev;

            remove(lru);
            map.remove(lru.key);
        }

        Node node = new Node(key, value);
        add(node);
        map.put(key, node);
    }
}

class Node {
    int val;
    int key;
    Node next;
    Node prev;

    Node (int key, int value) {
        this.key = key;
        this.val = value;
    }
}
