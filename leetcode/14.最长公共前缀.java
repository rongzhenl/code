/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String str=strs[0];
        for (String string : strs) {
            while(!string.startsWith(str)){
                if(str.length()==0){
                    return "";
                }
                str=str.substring(0, str.length()-1);
            }
        }

        return str;

    }
}
// @lc code=end

