// Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements in the array.

// Note: Return two elements where the first one in the count of odd & second one is the count of even.

class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            if(arr[i]%2!=0){
                odd++;
            }
        }return new int[]{odd,even};
    }
}
