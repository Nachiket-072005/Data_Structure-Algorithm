class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[256];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char currChar = s.charAt(i);
            int val = currChar;
            freq[val]++;
        }

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                ArrayList<Integer> currRow = new ArrayList<>();
                currRow.add(i);
                currRow.add(freq[i]);

                arr.add(new ArrayList<>(currRow));
            }
        }

        Collections.sort(arr, (x, y) -> Integer.compare(x.get(1), y.get(1)));
        Collections.reverse(arr);

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.size(); i++) {
            int fre = arr.get(i).get(1);
            char ch = (char) (int) (arr.get(i).get(0));

            while (fre > 0) {
                str.append(ch);
                fre--;
            }
        }

        return str.toString();
    }
}
