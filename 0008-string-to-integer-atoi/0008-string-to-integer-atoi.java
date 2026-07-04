class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long ans = 0;
        if(s.length()==0) return 0;
        if(s.charAt(0)=='-'){
            for(int i=1; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    if(ans*10+(s.charAt(i)-'0')>Integer.MAX_VALUE) return Integer.MIN_VALUE;
                    else ans = ans*10 + (s.charAt(i)-'0');
                }
                else break;
            }
            return (int)-ans;
        }else if(s.charAt(0)=='+'){
            for(int i=1; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i))) {
                    if(ans*10+(s.charAt(i)-'0')>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    else ans = ans*10 + (s.charAt(i)-'0');
                }
                else break;
            }
            return (int)ans;
        }else{
            for(int i=0; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i))) {
                    if(ans*10+(s.charAt(i)-'0')>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    else ans = ans*10 + (s.charAt(i)-'0');
                }
                else break;
            }
        }
        return (int)ans;
    }
}