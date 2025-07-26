package recursion.easy;

public class xPown {

   public static int calPow(int x,int n){
       if (x == 0) { //Base case 1
           return 0;
       } else if (n==1) { //Base case 2
           return x;
       }else {
          //return x*calPow(x,n-1);

           //optimized recursive version using Exponentiation by Squaring (O(log n)):***
           if (n%2==0){ //even power
               return calPow(x,n/2)*calPow(x,n/2);
           }else { //odd power
               return calPow(x,n/2)*calPow(x,n/2)*x;
           }
       }
   }
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(calPow(x,n));
    }
}
