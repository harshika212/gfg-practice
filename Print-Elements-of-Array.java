// Given an array arr[], print all its elements space-separated.

// Note: You don't need to move to the next line after printing all elements of the array (space-separated)

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: 1 2 3 4 5

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
