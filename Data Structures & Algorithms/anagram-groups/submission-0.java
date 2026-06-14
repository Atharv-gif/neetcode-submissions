class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        boolean[] visited = new boolean[strs.length];

        for(int i = 0 ; i < strs.length ; i++){
            if(visited[i]){
                continue;
            }

            ArrayList<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for(int j = i + 1 ; j < strs.length ; j++){

                if(visited[j]){
                    continue;
                }

                String s = strs[i];
                String t = strs[j];

                HashMap<Character, Integer> map1 = new HashMap<>();
                for (int k = 0; k < s.length(); k++) {
                    char ch = s.charAt(k);
                    map1.put(ch, map1.getOrDefault(ch, 0) + 1);
                }


                HashMap<Character, Integer> map2 = new HashMap<>();
                for (int k = 0; k < t.length(); k++) {
                    char ch = t.charAt(k);
                    map2.put(ch, map2.getOrDefault(ch, 0) + 1);
                }

                if(map1.equals(map2)){
                    group.add(t);
                    visited[j] = true;
                }
            }
            ans.add(group);
        }

        return ans;
        
    }
}
