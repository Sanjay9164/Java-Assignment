class Solution {
    public boolean detectCapitalUse(String s) {
       int n = s.length();
       int count = 0;
       for (int i = 0; i < n; i++){
         if (Character.isUpperCase(s.charAt(i))){
            count++;
         }
         
        }
        if (count == n || count == 0){
          return true;
        }
        if (count == 1 && Character.isUpperCase(s.charAt(0))){
            return true;
        }
       
       return false; 
    }
}