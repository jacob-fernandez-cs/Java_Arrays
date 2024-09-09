class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int a = nums.length;
        int [] squares = new int[a];
            
        //for (int i = 0; i < nums.length; i++)
        //{
       //         squares[i] = (nums[i] * nums[i]);
      //  }
            
      //  Arrays.sort(squares);

        //return squares;
            
        //above is the trivial solution, below is a two pointer variation aiming to reach o(n)
            
        //create left and rights pointers
            
        int left = 0;
        int right = a -1;
        // loop backwards through the array, the given array is already sorted in increasing order
        for (int i = a - 1; i >= 0; i--)
        {
                int square; // the square we are storing in the squares result array
                
                if(Math.abs(nums[left]) < Math.abs(nums[right])) //if the left pointer < the right, then set square to the right pointer and move the right pointer left, else the square is the left pointer then move the left pointer right, set the current I to whichever square number was determined to be larger
                {
                        square = nums[right];
                        right--;
                }
                else
                {
                        square = nums[left];
                        left++;
                }
                squares[i]= square * square;
        }
    return squares;

    }
}
