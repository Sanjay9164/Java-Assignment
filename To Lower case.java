class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ch.length; i++){
            if (ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] + ('a' - 'A'));
            }
            result.append(ch[i]);
        }
        return new String(result);
    }
}