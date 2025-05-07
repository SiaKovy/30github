class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count  = 0;
        for( String word : words1){
            if(countOccurences(words1, word) == 1 && countOccurences(words2, word) == 1){
                count++;
            }
        }
        return count;
    }

    private int countOccurences(String [] arr, String word){
        int count = 0;
        for( String w: arr){
            if(w.equals(word)){
                count ++;
            }
        }
         return count;
    }
}