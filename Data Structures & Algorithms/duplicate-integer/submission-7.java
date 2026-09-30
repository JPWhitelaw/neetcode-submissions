class Solution {
    public boolean hasDuplicate(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++){
            pos = nums[i];
            for (int j = 0; j < nums.length; j++ ){
                if (i != j && pos == nums[j] ){
                    return true;
                }
            }
        }
        return false;
    }
}