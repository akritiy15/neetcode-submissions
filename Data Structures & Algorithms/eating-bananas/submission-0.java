class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=0;
        for(int pile:piles){
            maxPile=Math.max(maxPile,pile);

        }
        int s=1;
        int e=maxPile;
        int ans=maxPile;
        while(s<=e){
            int mid=s+(e-s)/2;
            long hours=0;
            for(int pile:piles){
                hours+=(pile+mid-1)/mid;
            }
            if(hours<=h){
                ans=mid;
                e=mid-1;

            }else{
                s=mid+1;
            }
        }
        return ans;


        
    }
}
