class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();

        // Frequency of characters in s
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }

        // Check whether a palindromic permutation is possible
        char middle = 0;
        int odd = 0;

        for (int i = 0; i < 26; i++) {
            if ((cnt[i] & 1) == 1) {
                odd++;
                middle = (char) ('a' + i);
            }
        }

        if (odd > 1) {
            return "";
        }

        // Characters available for the left half
        int[] halfCnt = new int[26];
        for (int i = 0; i < 26; i++) {
            halfCnt[i] = cnt[i] / 2;
        }

        int halfLen = n / 2;
        StringBuilder left = new StringBuilder();

        /*
         * Greedily build the left half.
         *
         * For every position, try the smallest available character.
         * Keep it only if some completion can still be > target.
         */
        for (int pos = 0; pos < halfLen; pos++) {

            boolean found = false;

            for (int c = 0; c < 26; c++) {
                if (halfCnt[c] == 0) {
                    continue;
                }

                // Try taking this character
                halfCnt[c]--;
                left.append((char) ('a' + c));

                if (canMakeGreater(left, halfCnt, middle, target, halfLen)) {
                    found = true;
                    break;
                }

                // Undo
                left.deleteCharAt(left.length() - 1);
                halfCnt[c]++;
            }

            if (!found) {
                return "";
            }
        }

        String leftPart = left.toString();

        StringBuilder ans = new StringBuilder();
        ans.append(leftPart);

        if (n % 2 == 1) {
            ans.append(middle);
        }

        ans.append(new StringBuilder(leftPart).reverse());

        String result = ans.toString();

        return result.compareTo(target) > 0 ? result : "";
    }

    /*
     * Determines whether the current prefix can be completed
     * into a palindrome strictly greater than target.
     *
     * To maximize the resulting palindrome, put all remaining
     * characters in descending order in the left half.
     */
    private boolean canMakeGreater(
            StringBuilder prefix,
            int[] halfCnt,
            char middle,
            String target,
            int halfLen) {

        StringBuilder left = new StringBuilder(prefix);

        // Largest possible remaining left half
        for (int c = 25; c >= 0; c--) {
            for (int k = 0; k < halfCnt[c]; k++) {
                left.append((char) ('a' + c));
            }
        }

        String leftPart = left.toString();

        StringBuilder palindrome = new StringBuilder();
        palindrome.append(leftPart);

        if ((target.length() & 1) == 1) {
            palindrome.append(middle);
        }

        palindrome.append(new StringBuilder(leftPart).reverse());

        return palindrome.toString().compareTo(target) > 0;
    }
}

