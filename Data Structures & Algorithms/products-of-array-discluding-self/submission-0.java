class Solution {
    public int[] productExceptSelf(int[] nums) {

        ArrayList<Integer> output = new ArrayList<>();
        int product = 1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (i == j) {
                    continue;
                } else {
                    product = product * nums[j];
                }
            }

            output.add(product);
            product = 1;
        }

        int[] ans = new int[output.size()];

        for (int i = 0; i < output.size(); i++) {
            ans[i] = output.get(i);
        }

        return ans;
    }
}