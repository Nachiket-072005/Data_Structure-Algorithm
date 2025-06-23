class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Frequency map
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Min-heap with custom comparator
        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> {
                    int freqA = freqMap.get(a);
                    int freqB = freqMap.get(b);
                    if (freqA == freqB) {
                        return b.compareTo(a); // reverse lexicographical order
                    }
                    return freqA - freqB; // min-heap based on frequency
                });

        // Step 3: Keep only top k elements in heap
        for (String word : freqMap.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Get words from heap in reverse order
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result); // Because it's a min-heap

        return result;
    }
}
