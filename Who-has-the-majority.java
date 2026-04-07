// Given an array arr[] and two elements x and y, return the element that occurs more frequently. If both elements have the same frequency, return the smaller one.
// Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5], x = 4, y = 5
// Output: 4
// Explanation: frequency of 4 is 4.frequency of 5 is 1.Since 4>1 so return 4

class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int fx=0;
        int fy=0;
        for(int num:arr){
            if(num==x){
                fx++;
            }
            if(num==y){
                fy++;
            }
        }
        if(fx>fy){
            return x;
        }
        if(fy>fx){
            return y;
        }
        else{
            return Math.min(x,y);
        }
    }
}g
