class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        if(p.length()>s.length()) return new ArrayList<>();
        int[] fixed = new int[26];
        for(int i=0;i<p.length();i++){
            fixed[p.charAt(i)-'a']++;
        }

        int[] sliding = new int[26];
        for(int i=0;i<p.length();i++){
            sliding[s.charAt(i)-'a']++;
        }
        
        List<Integer> ls = new ArrayList<>();

        if(Arrays.equals(fixed,sliding)){
            ls.add(0);
        }

        // ab sare pe krege
        int sn = s.length(); int pn = p.length();int j=0;

        for(int i=1;i<sn-pn+1;i++){
            sliding[s.charAt(j)-'a']--;
            sliding[s.charAt(i+pn-1)-'a']++;
            j++;

            if(Arrays.equals(fixed,sliding)){
                ls.add(i);
            }
        }
        return ls;
    }
}