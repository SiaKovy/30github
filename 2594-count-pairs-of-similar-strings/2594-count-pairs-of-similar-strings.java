class Solution {
    public int similarPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for(String word: words){
            boolean[] seen  = new boolean[26];
            for( char c: word.toCharArray()){
                seen[c - 'a'] = true;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for(int i = 0; i < 26; i++){
                if(seen[i]){
                    keyBuilder.append('a' + i);
                }
            }
            String key = keyBuilder.toString();
            count += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) +1);

        }
        return count;
    }
}