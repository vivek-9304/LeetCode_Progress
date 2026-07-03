class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        int min = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
            if(strs[i].length()<min) min = strs[i].length();
        }
        if(strs.length==1 && strs[0].length()==1) return strs[0];
        for(int i=0; i<min; i++){
            int x = 0;
            for(int j=0; j<strs.length-1; j++){
                if(strs[0].charAt(i)==strs[j+1].charAt(i)) x++;
            }
            if(x==strs.length-1){
                pre = pre + strs[0].charAt(i);
            }else{
                break;
            }
        }
        return pre;
    }
}