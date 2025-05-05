public class HitCounter {
    Queue<Integer> q;

    public HitCounter() {
        q = new LinkedList<>();
    }

    /**
     * @param timestamp: the timestamp
     * @return: nothing
     */
    public void hit(int timestamp) {
        q.add(timestamp);
    }

    /**
     * @param timestamp: the timestamp
     * @return: the count of hits in recent 300 seconds
     */
    public int getHits(int timestamp) {
        while (q.size() > 0 && q.peek() <= (timestamp - 300)) {
            q.remove();
        }

        return (int) q.size();
    }
}