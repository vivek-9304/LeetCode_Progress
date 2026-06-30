class Solution {
    public String longestPalindrome(String s) {
        String str = "";
        for(int i=0; i<=s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String ans = s.substring(i,j);
                if(palindrome(ans)){
                    if(str.length() < ans.length()){
                        str = ans;
                    }
                }
            }   
        }
        return str;
    }
    public boolean palindrome(String ans){
        int start=0, end=ans.length()-1;
        while(end>start){
            if(ans.charAt(start)!=ans.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}