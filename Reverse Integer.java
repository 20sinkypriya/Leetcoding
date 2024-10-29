class Solution {
    public int reverse(int x) {
 
         int t1=x;long r=0;
         do{
             r=(r*10)+(t1%10);
             t1/=10;
         }while(t1!=0);
         
         if((r>=(-(Math.pow(2,31)))) && (r<=(Math.pow(2,31)-1)))
             return (int)r;
         else
             return 0;    
     }
     public static void main(String args[]){
         Solution obj = new Solution();
         System.out.println(obj.reverse(1234));
     }
 }