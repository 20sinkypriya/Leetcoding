class Solution {
    public double myPow(double x, int n) {
         return(Math.pow(x,n));
     }
     public static void main(String args[]){
         Solution obj = new Solution();
         System.out.println(obj.myPow(2.0,4));
     }
 }