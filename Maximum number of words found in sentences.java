class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            int currentWords = 1; 
            
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    currentWords++;
                }
            }
            
            maxWords = Math.max(maxWords, currentWords);
        }
        
        return maxWords;
    }
}
