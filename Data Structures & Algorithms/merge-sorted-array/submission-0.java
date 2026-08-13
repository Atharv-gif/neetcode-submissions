class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Take first m elements from nums1
        for (int i = 0; i < m; i++) {
            list1.add(nums1[i]);
        }

        // Take n elements from nums2
        for (int i = 0; i < n; i++) {
            list2.add(nums2[i]);
        }

        // Merge both lists
        list1.addAll(list2);

        // Sort
        Collections.sort(list1);

        // Put result back into nums1
        for (int i = 0; i < list1.size(); i++) {
            nums1[i] = list1.get(i);
        }
    }
}