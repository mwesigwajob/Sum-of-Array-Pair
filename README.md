# Sum-of-Array-Pair
Takes in an array and an integer, K and finds the number of pairs in an array whose some is K

The findSum method takes in an array and an integer K. The goal is to find the number of 
pairs in the array whose sum is K. This algorthm considers an array with each value appearing once.

Logic

The sum of two numbers can be achieved by adding a number less than its half with one 
greater than its half. it can also be achieved by adding its half twice(this case is ignored for this algorithm)

On sorting the array, we can easily determin the section of the array with numbers greater than the half and those 
less than the half.

I have a loop going through the array to finf the starting point of the greater than section after which the loop continues 
till the end (O(n))

After finfing the greater than half, another loop is started from index zero to the end of the less than half checking for 
a number in the less than half which when added to a number in the greater than half gives the desired sum K
