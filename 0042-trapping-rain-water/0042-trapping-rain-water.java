class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int start = 0, end = n-1;
        int Lmax = 0, Rmax = 0;
        int water = 0;
        while(start<end){
            Lmax = Math.max(Lmax, height[start]);
            Rmax = Math.max(Rmax, height[end]);
            if(Rmax>Lmax){
                water += Lmax - height[start];
                start++;
            }else{
                water += Rmax - height[end];
                end--;
            }
        }
        return water;
    }
}