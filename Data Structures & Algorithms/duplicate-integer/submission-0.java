class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numMap = new HashSet<>();
        for(int i =0; i< nums.length; i++){
            int key = nums[i];
            if(numMap.contains(key)){
                return true;
            }
            numMap.add(nums[i]);
        }
        return false;
    }
}