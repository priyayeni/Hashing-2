class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int c = sum - k;
            
            if(map.containsKey(c)){
                 count+= map.get(c);
            }
            if(!map.containsKey(sum)){
                map.put(sum,0);
            }
            map.put(sum, map.get(sum)+1);
        
        }

        return count;
        
    }
}