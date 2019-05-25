import java.util.*;

public class Tester {

    public static boolean mystery(String str) {
        String temp = "";

        for (int k = str.length(); k>0; k--) {
            temp = temp + str.substring(k-1, k);
        }

        System.out.println("temp: " + temp);
        System.out.println("str: " + str);

        return temp.equals(str);
    }

    public static void main(String[] args) {
//        System.out.print(mystery("no"));
        String s1 = "My name is GFG";

        List<Integer> l = new List<Integer>();

        // prints true
        System.out.println(s1.contains("GFG"));
    }
}
