class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j;

        for(i = 0; i < nums.length; i++){
            for(j = i + 1; j < nums.length; j++ ){
                int soma = nums[i] + nums[j];

                if(soma == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}