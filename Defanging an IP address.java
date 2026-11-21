class Solution {
    public String defangIPaddr(String address) {
        char[] ch = address.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ch.length; i++){
            if (ch[i] == '.'){
                result.append("[.]");
            }
            else{
                result.append(ch[i]);
            }
        }
        return new String(result);
    }
}