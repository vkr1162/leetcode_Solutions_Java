class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     Set<Integer> ans = new HashSet<Integer>();
   List<Integer> answer = new ArrayList<Integer>();
   for(int i=0;i<nums.length;i++) {
	   if(ans.add(nums[i])==false) {
		   answer.add(nums[i]);
	   }
                 }
	return answer;   
    }
}