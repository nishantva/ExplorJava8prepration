import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    // Doubly Linked List Node
    class Node {
        int key;      // store key (needed to remove from map when evicting)
        int value;    // actual value
        Node prev;    // pointer to previous node
        Node next;    // pointer to next node

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> map;  // HashMap for O(1) lookup
    private int capacity;            // Maximum cache size
    private Node head;               // Dummy head (Most Recently Used side)
    private Node tail;               // Dummy tail (Least Recently Used side)

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        // Create dummy head and tail nodes
        // Dummy nodes help avoid null checks while inserting/removing
        head = new Node(0, 0);
        tail = new Node(0, 0);

        // Initially head <-> tail
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        // If key not present → return -1
        if (!map.containsKey(key))
            return -1;

        // Get the node from map in O(1)
        Node node = map.get(key);

        // Since key is accessed, it becomes Most Recently Used
        // So remove it from current position
        remove(node);

        // Insert it right after head
        insertToFront(node);

        // Return value
        return node.value;
    }

    public void put(int key, int value) {

        // Case 1: Key already exists
        if (map.containsKey(key)) {

            // Get existing node
            Node node = map.get(key);

            // Update value
            node.value = value;

            // Move it to front (most recently used)
            remove(node);
            insertToFront(node);

        } else {

            // Case 2: New key

            // If cache is full → remove Least Recently Used (LRU)
            if (map.size() == capacity) {

                // LRU node is just before tail
                Node lru = tail.prev;

                // Remove from linked list
                remove(lru);

                // Remove from HashMap using stored key
                map.remove(lru.key);
            }

            // Create new node
            Node newNode = new Node(key, value);

            // Put into HashMap
            map.put(key, newNode);

            // Insert into linked list at front (MRU position)
            insertToFront(newNode);
        }
    }

    // Removes a node from the doubly linked list
    private void remove(Node node) {

        // Connect previous node to next node
        node.prev.next = node.next;

        // Connect next node back to previous
        node.next.prev = node.prev;

        // No need to nullify pointers (optional)
    }

    // Inserts node right after head (Most Recently Used position)
    private void insertToFront(Node node) {

        // Step 1: Point new node to current first real node
        node.next = head.next;

        // Step 2: Set new node's previous to head
        node.prev = head;

        // Step 3: Update old first node's prev to new node
        head.next.prev = node;

        // Step 4: Make head point to new node
        head.next = node;
    }
}
