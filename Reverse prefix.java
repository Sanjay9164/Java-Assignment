class Solution {
    public String reversePrefix(String s, char ch) {
       int right = s.indexOf(ch);
       if (right == -1){
        return s;
       }
       char[] chars = s.toCharArray();
       int left = 0;
       while (left < right){
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
       }
       return new String(chars);
    }
}