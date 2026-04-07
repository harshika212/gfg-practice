// You are given two integer variables x and y. You need to perform the following operations:

// p = x + y : Addition
// q = x - y : Subtraction
// r = x * y :Multiplication
// s = x / y : Division
// t = x % y : Modulo

class Solution {
    public int[] computeOperations(int x, int y) {
        // code here
        int p = (x+y);
        int q = (x-y);
        int r =(x*y);
        int s = (x/y);
        int t =  (x%y);
        return new int[]{p,q,r,s,t};
    }
}
