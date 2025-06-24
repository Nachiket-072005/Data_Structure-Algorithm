class MedianFinder {
    private PriorityQueue<Double> a; // Max Heap
    private PriorityQueue<Double> b; // Min Heap

    public MedianFinder() {
        a = new PriorityQueue<>((x, y) -> Double.compare(y, x)); // MAX Heap
        b = new PriorityQueue<>(); // Default Hape in JAVA
    }

    private void moveElementFromAToB() {
        b.offer(a.poll());
    }

    private void moveElementFromBToA() {
        a.offer(b.poll());
    }

    public void addNum(int num) {
        // Ensure elements are added in correct heap
        if (b.isEmpty() || num <= b.peek()) {
            a.offer((double) num);
        } else {
            b.offer((double) num);
        }

        // Balance the heap
        if (a.size() > b.size() + 1) {
            moveElementFromAToB();
        } else if (b.size() > a.size() + 1) {
            moveElementFromBToA();
        }
    }

    public double findMedian() {
        if (a.isEmpty() && b.isEmpty()) {
            return 0.0; // Handle case when no elements are added
        }

        if (a.size() == b.size()) {
            return (a.peek() + b.peek()) / 2.0;
        }

        return (a.size() > b.size() ? a.peek() : b.peek());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */ 