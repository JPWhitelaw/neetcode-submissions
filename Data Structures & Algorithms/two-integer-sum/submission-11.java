class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> findDiff = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            int smallest = 0;
            int second = 0;
            int difference = target - nums[i];

            if (findDiff.containsKey(difference)){
                if (findDiff.get(difference) > i){
                    smallest = i;
                    second = findDiff.get(difference);

                } else{
                    smallest = findDiff.get(difference);
                    second = i;
                }

                return new int[] {smallest, second};

            } else {
                findDiff.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
