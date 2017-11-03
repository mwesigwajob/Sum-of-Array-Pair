/*
 * Take in an integer K and an array and find two values in an array
 * whose some is K. it returns the number of pairs with a sum of k.
 * condition, no number repeats 
 * @author Job Mwesigwa
 * */

import java.util.Arrays;

public class Logic{

  int[] nums; //the array
  int k; //the sum
  int counter =0; //marking off the second half
  int numSums=0; // the number of sums
  int index = 0; // marks the begining of the numbers greater than the half of K
  
  /*
   * @param sum the desired sum
   * @param numbers the array of numbers
   * */
  
  public int findSum(int sum, int[] numbers){
    nums = numbers;
    k= sum;
    
    //sorting the array, assuming it is in nlogn run time
    Arrays.sort(nums);
    
    //loop to get numbers greater than half of the desired array.
    for (int i =0; i<nums.length;i++)
    {
      if (nums[i]>k/2)
      {
        counter ++;
        
        //marks off the begining of the greater than half
        if (counter ==1)
          index = nums[i];
        
        //loop to cater for the numbers less than half of the array
        for (int j= 0; j<index;j++)
        {
          if (nums[i]+nums[j]==k)
            numSums++;
        }
      }
    }
    return numSums;
  }
  
}