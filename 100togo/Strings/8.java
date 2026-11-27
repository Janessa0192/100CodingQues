class Solution {
    public String decodeString(String s) {

        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        
        String curr = "";
        int k=0;

        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                k= k*10 + (ch-'0');
            } else if(Character.isLetter(ch)){
                curr+=ch;
            } else if(ch=='['){
                num.push(k);
                str.push(curr);

                k=0;curr="";
            } else {   // ']'
               int repeat = num.pop();
               String prev = str.pop();
          
               curr = prev + curr.repeat(repeat);
            }
        }

        return curr;
    }
}