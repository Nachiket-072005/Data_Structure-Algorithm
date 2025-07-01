class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);

        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> q = new LinkedList<>();

        q.add(beginWord);

        Map<String, Integer> distance = new HashMap<>();
        distance.put(beginWord, 1);

        while (!q.isEmpty()) {
            String currWord = q.poll();
            int currDis = distance.get(currWord);

            if (currWord.equals(endWord)) {
                return currDis;
            }

            char[] wordArray = currWord.toCharArray();

            for (int i = 0; i < wordArray.length; i++) {
                char originalChar = wordArray[i];

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (ch != originalChar) {
                        wordArray[i] = ch;
                        String newWord = new String(wordArray);

                        if (wordSet.contains(newWord) && !distance.containsKey(newWord)) {
                            q.add(newWord);
                            distance.put(newWord, currDis + 1);
                        }
                    }
                }

                wordArray[i] = originalChar;
            }
        }
        return 0;
    }
}