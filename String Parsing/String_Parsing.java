import java.util.Scanner;

public class String_Parsing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Pick a number between 1,000 and 999,999 (leave the comma!): ");
        String num = in.next();
        int index = num.length();
        String sub = num.substring(index-3,index);
        int index2 = num.indexOf(",");
        String sub2 = num.substring(0,index2);
        System.out.println(sub2+sub);
    }
}