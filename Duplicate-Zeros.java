class Solution {
    public void duplicateZeros(int[] arr) {
            
            //[1,0,2,3,0,4,5,0]
        
    Queue<Integer> q = new LinkedList<>(); //create Queue to look ahead into array
    
    for(int i=0; i<arr.length; i++){ //keeping the orginal array size
        q.add(arr[i]); // add the current index to the Queue
        
        if(arr[i] == 0) // if the current index is 0 w need to duplicate the zero, add an extra zero to the Queue
            q.add(0); 
            
        arr[i] = q.remove(); // set the current index of the array to the first element of the q, the remove() returns the first element and then removes it from the q,
            
        //System.out.println(Arrays.toString(arr));
          
    }
}
}
