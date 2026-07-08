class Solution {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        int x=0;
        for(int i : arr){
            x=x^i;
        }
        return x;
    }
}