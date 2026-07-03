class Solution {
    public int strStr(String hay, String needle) {
        int s = needle.length();
        for(int i=0; i<hay.length(); i++){
            String x = "";
            if(i+s<=hay.length()) {
                x = hay.substring(i,i+s);
                if(x.equals(needle)) return i;
            }
        }
        return -1;
    }
}