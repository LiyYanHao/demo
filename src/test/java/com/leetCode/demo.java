package com.leetCode;


import org.junit.jupiter.api.Test;

public class demo {

    @Test
    public void demo1() {
    }

    /**
     * 1332. 删除回文子序列
     * 给你一个字符串 s，它仅由字母 'a' 和 'b' 组成。每一次删除操作都可以从 s 中删除一个回文 子序列。
     * 返回删除给定字符串中所有字符（字符串为空）的最小删除次数。
     * 「子序列」定义：如果一个字符串可以通过删除原字符串某些字符而不改变原字符顺序得到，那么这个字符串就是原字符串的一个子序列。
     * 「回文」定义：如果一个字符串向后和向前读是一致的，那么这个字符串就是一个回文。
     * 示例 1：
     * 输入：s = "ababa"
     * 输出：1
     * 解释：字符串本身就是回文序列，只需要删除一次。
     * 示例 2：
     * 输入：s = "abb"
     * 输出：2
     * 解释："abb" -> "bb" -> "".
     * 先删除回文子序列 "a"，然后再删除 "bb"。
     * 示例 3：
     * 输入：s = "baabb"
     * 输出：2
     * 解释："baabb" -> "b" -> "".
     * 先删除回文子序列 "baab"，然后再删除 "b"。
     * 示例 4：
     * 输入：s = ""
     * 输出：0
     * 提示：
     * 0 <= s.length <= 1000
     * s 仅包含字母 'a'  和 'b'
     *
     * @param s
     * @return
     */
    public int removePalindromeSub(String s) {
        int result = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(0, i);
            String s1 = reverseStr(substring);
            if (substring.equals(s1)) {
                //是回文数
                ++result;
                index = i;
            }
        }
        return 0;
    }

    public String reverseStr(String s) {
        char[] arr = s.toCharArray();
        String tmp = "";
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr.length; j > arr.length / 2; j--) {
                arr[i] = (char) (arr[j] ^ arr[i]);
                arr[i] = (char) (arr[j] ^ arr[i]);
                arr[j] = (char) (arr[j] ^ arr[i]);
            }
        }
        String s1 = arr.toString();
        return s1;
    }

}
