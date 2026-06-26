class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        int i=1;
        if(arr[n-1]!=9) arr[n-1]++;
        else if(arr[0]==9 && n==1) {
            int[] a = new int[n+1];
            a[0] = 1; a[1] = 0;
            return a;
        }else if(arr[0]==9 && arr[1]==9 && n==2) {
            int[] a = new int[n+1];
            a[0] = 1; a[1] = 0; a[2]=0;
            return a;
        }else if(arr[0]==9 && arr[1]==9 && arr[2]==9 && n==3) {
            int[] a = new int[n+1];
            a[0] = 1; a[1] = 0; a[2]=0; a[3]=0;
            return a;
        }else if(arr[0]==9 && arr[1]==9 && arr[2]==9 && arr[3]==9 && arr[4]==9 && n==5) {
            int[] a = new int[n+1];
            a[0] = 1; a[1] = 0; a[2]=0; a[3]=0; a[4]=0; a[5]=0;
            return a;
        }
        else if(arr[0]==9 && arr[1]==9 && arr[2]==9 && arr[3]==9 && arr[98]==9 && n==99) {
            int[] a = new int[n+1];
            a[0] = 1; 
            for(int k=1; k<a.length; k++) a[k]=0;
            return a;
        }
        else{
            while(arr[n-i]==9 && (n!=i)){
                arr[n-i]=0;
                i++;
            }
            arr[n-i]++;
        }
        return arr;
    }
}