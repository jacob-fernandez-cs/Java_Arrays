class Solution {

    /**
     * Duplicates each occurrence of zero in the array `arr` while maintaining the array's original size.
     * When a zero is encountered, it is duplicated, shifting subsequent elements to the right.
     * The function uses a queue to handle the shifting of elements while preserving the order.
     *
     * @param arr the input array of integers, where zeros will be duplicated in place.
     *            The array's length remains unchanged after modification.
     */
    public void duplicateZeros(int[] arr) {
        // Initialize a queue to facilitate element shifting as we iterate through the array.
        Queue<Integer> q = new LinkedList<>();
        
        // Traverse the array while keeping its original length intact.
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the queue.
            q.add(arr[i]);

            // If the current element is zero, duplicate the zero by adding another zero to the queue.
            if (arr[i] == 0) {
                q.add(0);
            }
            
            // Remove the first element from the queue and assign it to the current position in the array.
            arr[i] = q.remove();
        }
    }
}

