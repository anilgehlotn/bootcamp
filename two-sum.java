class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0 , j = i+1;
        int[] array = new int[2];
        while (i < nums.length){
        while ( j < nums.length  ){
            if (nums[i] + nums[j] == target){
                array[0] = i;
                array[1] = j;
                return array;
            }
            else {
                j++;
            }

        }
        i++;
        j = i+1;
        
        }  
        return array;
    }
}
