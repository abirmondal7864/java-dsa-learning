import java.util.*;

public class Basics {

    public static void main(String[] args) {

// TAKING INPUT IN JAVA

            // Create a Scanner object to interact with the console.

            // TO INPUT AN INTEGER .nextInt()
//               Scanner sc = new Scanner(System.in);
//               int a = sc.nextInt();
//               int b = sc.nextInt();
//               int sum= a+b;
//               System.out.println(sum);
//               sc.close();

            // TO INPUT A STRING .nextLine()
            // System.out.println("name:");
            // Scanner input = new Scanner(System.in);
            // String name = input.nextLine();
            // System.out.println("Hello " + name);
            // input.close();

// CONDITIONS

            // Scanner sc=new Scanner(System.in);
            // int age =sc.nextInt();
            // if (age>=18){
            // System.out.println("Adult");
            // } else {
            // System.out.println("notAdult");
            // }

            // Scanner sc= new Scanner(System.in);
            // int button=sc.nextInt();
            // switch (button){
            // case 1: System.out.println("Hola");
            // break;
            // case 2: System.out.println("Namaste");
            // break;
            // case 3: System.out.println("Bonjour");
            // break;
            // default: System.out.println("Hello");
            // }

// LOOPS

            // System.out.println("Enter no.");
            // Scanner sc= new Scanner(System.in);
            // int n= sc.nextInt();
            // for(int i=1;i<11;i++){
            // System.out.println(n*i);
            // }

            // int i =1;
            // while (i<11){
            // System.out.println(n*i);
            // i++;
            // }

            // int i=1;
            // do{
            // System.out.println(n*i);
            // i++;
            // } while (i<11);

// PATTERN QUESTIONS

            // int n=4;
            // int m=5;
            // for(int i=1;i<=n;i++){
            // for(int j=1;j<=m;j++){
            // System.out.print("*");
            // }
            // System.out.println();
            // }

            // int n = 4;
            // int m = 5;
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= m; j++) {
            // if (i == 1 || j == 1 || i == n || j == m) {
            // System.out.print("*");
            // } else {
            // System.out.print(" ");
            // }
            // }
            // System.out.println();
            // }

            // int n = 3;
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
            // }

            // int n = 4;
            // for (int i = n; i >= 1; i--) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
            // }

            // int n = 5;
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= n - i; j++) {
            // System.out.print(" ");
            // }
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
            // }

            // int n = 5;
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print(j + " ");
            // }
            // System.out.println();
            // }

            // int n = 5;
            // for (int i = n; i >= 1; i--) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print(j + " ");
            // }
            // System.out.println();
            // }

            // // impQ**
            // int n = 5;
            // int number = 1;
            // //i= no. of rows
            // for (int i = 1; i <= n; i++) {
            // // j= No. of values printed in a row
            // for (int j = 1; j <= i; j++) {
            // System.out.print(number + " ");
            // number++;
            // }
            // System.out.println();
            // }

            // // impQ***
            // int n = 5;
            // // i= no. of rows
            // for (int i = 1; i <= n; i++) {
            // // j= No. of values printed in a row
            // for (int j = 1; j <= i; j++) {
            // int sum = i + j;
            // if (sum % 2 == 0) {
            // System.out.print("1");
            // } else {
            // System.out.print("0");
            // }

            // }
            // System.out.println();
            // }

// ADVANCED PATTERN QUESTIONS

            // BUTTERFLY PATTERN

            // int n=4;
            // //first half
            // for (int i = 1; i <=n; i++) {
            // //1st part
            // for (int j = 1; j <=i; j++) {
            // System.out.print("*");
            // }
            // //spaces
            // int spaces=2*(n-i); //(n-i) NOT (n-1)**
            // for (int j = 1; j <=spaces; j++) {
            // System.out.print(" ");
            // }
            // //2nd part
            // for (int j = 1; j <=i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
            // }

            // //second half
            // for (int i = n; i>=1; i--) {
            // //1st part
            // for (int j = 1; j <=i; j++) {
            // System.out.print("*");
            // }
            // //spaces
            // int spaces=2*(n-i); //(n-i) NOT (n-1)**
            // for (int j = 1; j <=spaces; j++) {
            // System.out.print(" ");
            // }
            // //2nd part
            // for (int j = 1; j <=i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
            // }

// SOLID RHOMBUS

            // //for left aligned
            // int n=5;

            // for(int i=1;i<=n;i++){
            //     //spaces
            //     for (int j = 1; j <=i; j++) {    //i not (n-1)
            //         System.out.print(" ");
            //     }
            //     //stars
            //     for (int j = 1; j <=n; j++){
            //         System.out.print("*");
            //     }
            //    System.out.println();

            //     }
            // }


            // //for right aligned
            // int n=5;
            // for (int i = 1; i <=n; i++) {
            //     //spaces
            //     for (int j = 1; j <=n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     //stars
            //     for (int j = 1; j <=n; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


            //Q.12 PRINT THE NO. PYRAMID***

            //   int n=5;
            //  for (int i = 1; i <= n; i++) { //i=n

            //      //spaces
            //      for (int j = 1; j <=n-i; j++){
            //          System.out.print(" ");
            //     }
            //     //no.
            //  for (int  j= 1;j<=i; j++) {
            //         System.out.print(i+" ");  //space added after no.
            //     }

            //       System.out.println();
            //  }



            //PALLINDROMIC PYRAMID***

            //   int n=5;
            //    for (int i = 1; i <=n; i++) {
            //  //spaces
            //      for (int  j = 1;   j <=n-i;   j++) { //n-i spaces
            //            System.out.print(" ");
            //        }
            //   //1st part no.s
            //      for (int j = i; j >=1; j--) {    //backwards loop
            //      System.out.print(j);            //j, not i
            //      }
            //  //2nd part no.s
            //      for (int j = 2; j <=i; j++) {  //forwards loop(starts from 2)
            //      System.out.print(j);          //j, not i
            //      }
            //     System.out.println();
            //  }

//           //Diamond Pattern
//
//            int n=4;
//            //upper half
//            for (int i = 1; i <=n; i++) {
//                //spaces
//                for (int j = 1; j <=n-i; j++) {
//                    System.out.print(" ");
//                }
//                //stars
//                for (int j = 1; j <=2*i-1; j++) { //(2*i-1) AS ODD NO.S***
//                    System.out.print("*"); //space added after *s
//                }
//                System.out.println();
//            }
//            //lower half
//            for (int i = n-1; i >=1; i--) {  //observe
//                //spaces
//                for (int j = 1; j <=n-i; j++) { //observe
//                    System.out.print(" ");
//                }
//                //stars
//                for (int j = 1; j <=2*i-1; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

        }

}
