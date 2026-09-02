class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            int r=((sum%k)+k)%k;
            if(map.containsKey(r)){
                count+=map.get(r);
            }
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
    }
}