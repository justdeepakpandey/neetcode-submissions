class Solution {
    public int missingNumber(int[] nums) {
         int sum=0;
        int n = nums.length;
        int m=nums.length+1;
       
        int p=n*m/2;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return p-sum;
    }
}
