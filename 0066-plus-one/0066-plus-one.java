class Solution {
    public int[] plusOne(int[] digits) {
        // int n = arr.length;
        // for(int i=n-1; i>=0; i++){
        //     if(arr[n-1]!=9) {
        //         arr[n-1]++;
        //         return arr;
        //     }
        //     arr[i]=0;
        // }
        // int[] a = new int[n+1];
        // a[0] = 1;
        // return a;

        int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
    }
}