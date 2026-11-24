class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        int cnt = 0; int j=0;int max_count=0;
        
        for(int i=0;i<s.length();i++){

            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(j));
                j++;
                
            }
            hs.add(s.charAt(i));
            cnt=i-j+1;

            max_count = Math.max(max_count,cnt);
        }

        return max_count;
    }
}