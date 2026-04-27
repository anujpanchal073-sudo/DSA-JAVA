//Plateform - LeetCode
//QuestionId - 215

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_Array {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i: nums){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        
        return pq.peek();
    }

}