class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> mapping = new HashMap<Integer, Integer>();
     
     for(int i=0;i<nums.length;i++) {
    	 int x = target - nums[i];
    	 if(mapping.containsKey(x)) {
    		 return new int[] {mapping.get(x), i};
    	 }
    	 mapping.put(nums[i],i);
     }
     return null;
    }
}