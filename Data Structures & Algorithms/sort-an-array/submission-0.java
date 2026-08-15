class Solution {
    public int[] sortArray(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int x : nums){
            list.add(x);
        }

        Collections.sort(list);

        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            arr[i] = list.get(i);
        }


        return arr;
        
    }
}