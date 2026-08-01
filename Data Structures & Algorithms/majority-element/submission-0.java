class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ch=nums[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i:map.keySet()){
           if(map.get(i)>n/2){
            return i;
           }
        }
        return -1;
    }
}