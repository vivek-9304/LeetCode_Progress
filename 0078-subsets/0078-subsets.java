class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<(1<<n); i++){
            List<Integer> a = new ArrayList<>();
            for(int j=0; j<n; j++){
                if((i>>j)%2==1)
                    a.add(nums[j]);
            }
            arr.add(a);
        }
        return arr;
    }
}