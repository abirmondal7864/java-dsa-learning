package strings;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //take input
//        System.out.println("Enter a sentence: ");
//        String input= sc.nextLine(); //take input whole line as a string
//        //output
//        System.out.println(input);


        //SOME OPERATIONS ON STRINGS

//        //Concatenation
//        System.out.println("Enter firstName: ");
//        String firstName= sc.nextLine();
//        System.out.println("Enter surName: ");
//        String surName= sc.nextLine();
//        String fullName=firstName+" "+surName;
//        System.out.println("Full name is: "+ fullName);
//        System.out.println("Length of full name is: "+fullName.length());
//
//
//        //charAt
//        for(int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));  //dont forget fullname.charAt(i)
//        }


        //compare

//        //compareTo
//        String name1 ="Tony";
//        String name2="Tony";
//    //NOTE: name1==name2 fails in some test cases,so its use name1.compareTo(name2)
//        //if s1>s2 : +ve
//        //if s1<s2 : -ve
//        //if s1=s2 : 0
//
//        //hello < wello
//        //aahello> aabello
//        if(name1.compareTo(name2)==0){
//            System.out.println("strings.Strings are equal");
//        }else {
//            System.out.println("strings.Strings are not equal");
//        };


        //Substring
//        String sentence="My name is Tony";
//      //   substring(beg index,end index)
//        String name1=sentence.substring(11,sentence.length());
//        System.out.println(name); //Tony
//
//        String sentence2="TonyStark";
//        String name2=sentence2.substring(0,4);//beg and end index
//        System.out.println(name2); //Tony
//
//        String name3=sentence2.substring(5); //beg index
//        System.out.println(name3);//Stark

        //Note: strings.Strings are immutable


        //String Builder

        //       StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//        //char at index 0
//        System.out.println(sb.charAt(0));
//
//        //set char at index 0
//        sb.setCharAt(0,'P');
//        System.out.println(sb);
//
//        //insert a char at index 0
//        sb.insert(0,'S');
//        System.out.println(sb);
//
//        // insert a char at index 3
//        sb.insert(3,'n');
//        System.out.println(sb);
//
//        //delete the extra 'n'
//        sb.delete(3,4); //end index not inclusive**
//        System.out.println(sb);


//        //Append

//        StringBuilder sb= new StringBuilder("H"); //must be " " not ' ' for strings.Strings
//        sb.append('e'); // ' ' for chars
//        sb.append('l');
//        sb.append('l');
//        sb.append('o');
//        System.out.println(sb);


//        // Reverse a string
//        StringBuilder sb = new StringBuilder("hello");
//        for (int i = 0; i < sb.length() / 2; i++) {      //until half of string length
//            int front = i;
//            int back = sb.length() - 1 - i; //Imp*** //5-1-0=4
//
//            char frontChar = sb.setCharAt(front);
//            char backChar = sb.setCharAt(back);
//        //Reverse
//            sb.setCharAt(front, backChar);
//            sb.setCharAt(back, frontChar);
//        }
//        System.out.println(sb);


    }
}

