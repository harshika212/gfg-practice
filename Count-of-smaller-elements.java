// Given an unsorted array arr. Find the count of elements less than or equal to the given element x.
// 
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int c=0;
        for(int num:arr){
            if(num<=x){
                c++;
            }
        }
        return c++;
    }
}
