class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sizeOfNum = nums.length;
        int count = 0;
        
        for (int i = 0; i < sizeOfNum; i++)
        {
            if (nums[i] == 1)
            {
                count++;
                if (count > max)
                    max = count;
            }
            else
            {
                count = 0;
                if (count > max)
                    max = count++;
            }
        }
        return max;
    }
}
