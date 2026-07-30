class Solution {
    public int maxArea(int[] h) {
        int i=0;
        int j=h.length-1;
        int max =Integer.MIN_VALUE;
        while(i<j){
        int ht =Math.min(h[i],h[j]);
        int w=j-i;
        int area =ht*w;
         max=Math.max(area,max);
        if(h[i]<h[j]){
            i++;
        }else if(h[i]>h[j]){
            j--;
        }else{
            i++;j--;
        }
      
        }
        return max;
    }
}
