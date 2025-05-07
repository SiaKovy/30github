class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        int val = 0;
        for( String s: strs){
            if(s.matches("\\d+")){
                val = Integer.parseInt(s);
            }else{
                val = s.length();
            }
            if(val > maxVal){
                maxVal = val;
            }
        }
        return maxVal;
    }
}