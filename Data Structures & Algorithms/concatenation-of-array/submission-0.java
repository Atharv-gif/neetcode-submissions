class Solution {
    public int[] getConcatenation(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int x: nums){
            list.add(x);
        }

        for(int y : nums){
            list.add(y);
        }



        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    
        
    }
}