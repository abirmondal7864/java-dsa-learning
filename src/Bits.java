import java.util.Scanner;

public class Bits {
    public static void main(String[]args){
        //get bit

//        //BitMask: 1<<i //Operation: AND
//        int n =5; //0101
//        int pos =2;
//        int bitMask=1<<pos;
//
//        if((bitMask & n) == 0){  //AND operation
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }


       //set bit

//        //BitMask: 1<<i //Operation: OR
//        int n=5;
//        int pos=1;
//        int bitMask=1<<pos;
//
//        int newNum =bitMask | n; //OR operation
//        System.out.println(newNum);



       //clear bit
//
//        //BitMask: 1<<i //Operation: AND with NOT BM
//        int n=5;
//        int pos=2;
//        int bitMask=1<<pos;
//        int notBitMask= ~(bitMask);
//
//        int newNum =notBitMask & n;
//        System.out.println(newNum);



        //update bit

        //two cases:

//        //A) For 0: (CLEAR)***
//        //BitMask: 1<<i //Operation: AND with NOT BM
//        int n=5;
//        int pos =2;
//        int bitMask=1<<2;
//        int notBitMask=~(bitMask);
//
//        int newNum= notBitMask & n;
//        System.out.println(newNum);

//        //B) For 1: (SET)***
//        //BitMask= 1<<i //Operation: OR
//
//        int n=5;
//        int pos=2;
//        int bitMask= 1<<2;
//
//        int newNum = bitMask|n;
//        System.out.println(newNum);

        //lets do this together taking operation bit as input
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter for 0(clear) or 1(set) : ");
//        int oper =sc.nextInt();
//        int n=5;
//        int pos=2;
//        int bitMask=1<<2;
//        if(oper==0){
//            int notBitmask = ~(bitMask);
//            int newNum= notBitmask & n;
//            System.out.println(newNum);
//        }else {
//            int newNum= bitMask|n;
//            System.out.println(newNum);
//        }




    }
}
