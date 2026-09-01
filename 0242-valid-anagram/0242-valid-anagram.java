class Solution {
    public boolean isAnagram(String s, String t) {
        // Optimization 1: Early exit if lengths don't match
        if (s.length() != t.length()) {
            return false;
        }
        
        // Optimization 2: Single frequency array
        int[] freq = new int[26];
        
        // You can do both in a single loop since they are the same length
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        // Check if any frequency is non-zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}