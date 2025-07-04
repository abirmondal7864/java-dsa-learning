import java.util.*;

public class Functions {

// PRINT USING FUNCTION

//       public static void printName(String name){
//           System.out.println("Your name is: "+name);
//       }
//       public static void main(String[] args){
//           System.out.println("Enter your name: ");
//           Scanner sc= new Scanner(System.in);
//           String name= sc.next();
//           printName(name);
    //   sc.close();
//       }

// SUM USING FUNCTION

//        public static int calculateSum(int a,int b){
//            return a+b;
//        }
//        public static void main(String[] args){
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter a no.: ");
//            int a=sc.nextInt();
//            System.out.println("Enter another no.: ");
//            int b=sc.nextInt();
//           int sum=  calculateSum(a,b);
//            System.out.println("The sum is: "+sum);
    //          sc.close();
//    }

// FUNCTION TO MULTIPLY TWO INPUTED NO.S //in short(without storing the product in a variable)

//        public static int multiply(int a,int b){
//            return a*b;
//        }
//        public static void main(String[] args){
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter a no.: ");
//            int a=sc.nextInt();
//            System.out.println("Enter another no.: ");
//            int b=sc.nextInt();
//           int product= multiply(a,b);
//            System.out.println("The product is: "+product);
    //        sc.close();
//    }


// FUNCTION TO PRINT FACTORIAL

//      // Recursive Approach
//        public  static long factorialRecursive(int n){
//            if (n==0 || n==1) {
//                return 1;
//            }else
//                return n * findFactorial(n - 1); //recursion
//        }
//        public static void main(String[] args){
//            System.out.println("Enter a no.: ");
//            Scanner sc= new Scanner(System.in);
//            int n=sc.nextInt();
//            if (n<0){
//                System.out.println("Invalid input! Factorial is not defined for negative no.s");
//            }else {
//                System.out.println("The factorial of " + n + " is: " + factorialRecursive(n));
//            }
//                sc.close();
//        }

//    // OR (Iterative approach)
//    public static long factorialIterative(int num){
//        long fact= 1;
//        if(num==0||num==1){
//            return 1;
//        }else{
//            for(int i=1;i<=num;i++){
//                fact *= i;
//            }
//            return fact;
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter a no.: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n < 0) {
//            System.out.println("Invalid input! Factorial is not defined for negative no.s");
//        } else {
//            System.out.println("The factorial of " + n + " is: " + factorialIterative(n));
//        }
//        sc.close();
//    }

}
