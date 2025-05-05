class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder(); //mutable
        for(char c : s.toCharArray()){
            sb.append(c - 'a' + 1);
        }

        String numStr = sb.toString();
        while (k-- > 0){
         int sum = 0;
            for(char ch: numStr.toCharArray()){
            sum += ch - '0'; //digit
            }
            numStr = String.valueOf(sum);
        }
        return Integer.parseInt(numStr);        
        }
    }