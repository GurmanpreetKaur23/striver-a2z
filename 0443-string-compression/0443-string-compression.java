class Solution {
    public int compress(char[] chars) {
        String result = "";
        int count = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                result += chars[i - 1]; // add character
                if (count > 1) {
                    result += count; // add count
                }
                count = 1; // reset
            }
        }

        // Copy back to original array
        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();
    }
}
