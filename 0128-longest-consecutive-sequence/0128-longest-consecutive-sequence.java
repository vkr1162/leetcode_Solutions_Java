class Solution {
   
    public int longestConsecutive(int[] nums) {
        
	    		   int maxLength = 0;
	   
	   HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
	   for(int i=0;i<nums.length;i++) {
		   hashMap.put(nums[i], false);
	   }
	   for(int i=0;i<nums.length;i++) {
		   int currentLength = 1;
		   int currentNo = nums[i]+1;
		   while(hashMap.containsKey(currentNo) && hashMap.get(currentNo)==false) {
			   currentLength++;
			   hashMap.put(currentNo, true);
			   currentNo++;
		   }
		   int prevNo = nums[i]-1;
		   while(hashMap.containsKey(prevNo) && hashMap.get(prevNo)==false) {
			   currentLength++;
			   hashMap.put(prevNo, true);
			   prevNo--;
		   }
		   if(currentLength>=maxLength) {
			   maxLength=currentLength;
		   }
	   }
	  
		 
	return maxLength;
    }
}