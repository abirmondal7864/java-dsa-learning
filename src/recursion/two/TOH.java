package recursion.two;

public class TOH {
    public static void solveTOH(int n,String source,String  auxiliary,String destination){
        if (n == 1) {
            System.out.println("Move Disk 1 from "+source+" to "+destination);
            return;//Imp***
        }
        solveTOH(n-1,source,destination,auxiliary);//Step 1
        System.out.println("Move disk "+ n+" from "+ source+ " to "+destination);//Step 2
        solveTOH(n-1,auxiliary,source,destination);//Step 3
    }
    public static void main(String[] args) {
        int n=4;
        solveTOH(n,"A","B","C");
    }
}
