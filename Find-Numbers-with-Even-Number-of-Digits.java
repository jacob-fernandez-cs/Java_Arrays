class Solution {
    public int findNumbers(int[] nums) {
        int EvenCount = 0;
        
         int amountOfDigits = 0;
            
         for(int i = 0; i < nums.length; i++) 
         {
                amountOfDigits = (int) (Math.log10(nums[i]) + 1); // notation found online, take log base 10 of a number and  add 1 to achieve the amount of digits in a number which is in decimal form
                if (amountOfDigits % 2 == 0)
                {
                        EvenCount++;
                }
         }
        
       return EvenCount;    
    }
}
