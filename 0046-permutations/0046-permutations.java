class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		tracking(list, tempList, nums);
		
		
		return list;
	}
	public void tracking(List<List<Integer>> list, List<Integer> temp, int[] nums) {
		if(temp.size()==nums.length) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}
		
		for(int num:nums) {
			if(temp.contains(num)) {
				continue;
			}
			temp.add(num);
			tracking(list, temp, nums);
			temp.remove(temp.size()-1);
		}
    }
}