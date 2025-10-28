import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    /**
     * @param s
     * @param words
     * @return
     */
    public List<Integer> findSubstring(final String s, final String[] words) {
        final List<Integer> ans = new ArrayList<>();
        final int n = s.length();
        final int m = words.length;
        final int w = words[0].length();

        final HashMap<String,Integer> map = new HashMap<>();
        for(final String x : words)
        map.put(x, map.getOrDefault(x,0)+1);

        for(int i=0; i<w; i++){
            final HashMap<String,Integer> temp = new HashMap<>();
            int count = 0;
            for(int j=i,k=i; j+w <= n; j=j+w){
                final String word = s.substring(j,j+w);
                temp.put(word,temp.getOrDefault(word,0)+1);
                count++;
                
                if(count==m){
                    if(map.equals(temp)){
                        ans.add(k);
                    }
                    final String remove = s.substring(k,k+w);
                    temp.computeIfPresent(remove, (a, b) -> (b > 1) ? b - 1 : null);
                    count--;
                    k=k+w;
                }
            }
        }
        return ans;
    }
}
