class Node {
    int key;
    int val;

    Node next;
    Node prev;

    Node() {
    }

    Node(int k, int v) {
        this.key = k;
        this.val = v;

        next = null;
        prev = null;
    }
}

class LRUCache {
    Node head;
    Node tail;
    int cap;
    HashMap<Integer, Node> m;

    public LRUCache(int capacity) {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;

        cap = capacity;

        m = new HashMap<>();
    }

    public void delete(int key, Node current) {
        Node previous = current.prev;
        Node nexxt = current.next;

        previous.next = nexxt;
        nexxt.prev = previous;

        m.remove(key);
    }

    public void update(int key, int val) {
        Node nexxt = head.next;

        Node newNode = new Node(key, val);

        // head <--> newNode
        head.next = newNode;
        newNode.prev = head;

        // newNode <--> nexxt
        newNode.next = nexxt;
        nexxt.prev = newNode;

        m.put(key, newNode);
    }

    public int get(int key) {
        if (m.containsKey(key) == true) {
            Node curr = m.get(key);
            delete(key, curr);
            update(key, curr.val);

            return curr.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (m.containsKey(key) == true) {
            delete(key, m.get(key));
            update(key, value);
        } else {
            if (cap == 0) {
                delete(tail.prev.key, tail.prev);
                cap++;
            }
            update(key, value);
            cap--;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */