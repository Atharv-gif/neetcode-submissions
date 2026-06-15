class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        ArrayList<Integer> list = Arrays.stream(nums)
                .distinct()
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        int longest = 1;
        int length = 1;

        Collections.sort(list); // sort kar lo pehle

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) == list.get(i) + 1) {
                length++;                          // agla consecutive hai, badha do
                longest = Math.max(longest, length);
            } else {
                length = 1;                        // sequence toot gayi, reset
            }
        }

        return longest;
    }
}