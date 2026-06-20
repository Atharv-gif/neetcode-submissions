class Solution {
    public int trap(int[] height) {

        ArrayList<Integer> list = new ArrayList<>();

        int water = 0;

        for(int x : height){
            list.add(x);
        }


        for(int i = 0 ; i < list.size() ; i++){


            int lMax = Integer.MIN_VALUE;


            for(int j = 0 ; j <= i ; j++){
                lMax = Math.max(lMax,list.get(j));
            }

            
            int rMax = Integer.MIN_VALUE;

            for(int j = i ; j < list.size() ; j++){
                rMax = Math.max(rMax,list.get(j));
            }

            int trapped = Math.min(lMax , rMax) - list.get(i);
            water += trapped ;
        }
        
        return water;
    }
}
