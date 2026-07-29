class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a =nums[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for( int i:map.values()){
            if(i>=2){
                return true;
            }
        }
        return false;
    }
}