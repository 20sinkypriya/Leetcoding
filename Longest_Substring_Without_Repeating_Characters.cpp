#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<int> lastIndex(256, -1); // to store last seen index of every character
        int n = s.size();
        int left = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {
            char c = s[right];
            // If the character was seen before, move left pointer
            if (lastIndex[c] >= left) {
                left = lastIndex[c] + 1;
            }
            lastIndex[c] = right; // update last seen index
            maxLen = max(maxLen, right - left + 1);
        }
        return maxLen;
    }
};

int main() {
    Solution sol;
    cout << sol.lengthOfLongestSubstring("abcabcbb") << endl; // Output: 3
    cout << sol.lengthOfLongestSubstring("bbbbb") << endl;    // Output: 1
    cout << sol.lengthOfLongestSubstring("pwwkew") << endl;   // Output: 3
    return 0;
}
