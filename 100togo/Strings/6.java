class Solution {
    public int myAtoi(String s) {
        
        int sign = 1;
        int i=0;
        long res = 0;

        s = s.trim();

        if(s.length() == 0) return 0;

        if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        } else if(s.charAt(i) == '+') {
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){

            res = res*10+ (s.charAt(i)-'0'); 
            i++;

            if(res*sign < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
            } 
            if(res*sign>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
            } 

        }


        return (int)(res*sign);
    }
}