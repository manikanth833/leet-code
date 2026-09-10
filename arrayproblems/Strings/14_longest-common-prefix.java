class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String res = strs[0];

        for (int i = 1; i < strs.length; i++) {
            
            int j = 0;

            while (j < res.length() &&
                   j < strs[i].length() &&
                   res.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            res = res.substring(0, j);

            if (res.length() == 0) {
                return "";
            }
        }

        return res;
    }
}