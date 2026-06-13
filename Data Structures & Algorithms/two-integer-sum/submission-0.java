class Solution {
    public int[] twoSum(int[] nums, int target) {

        int current = 0;
        int needed = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            current = nums[i];
            needed = target - current;
            if(map.containsKey(needed)){
                return new int[]{map.get(needed) , i};
            }
            map.put(current,i);
        }
        return new int[0];
    }
}
