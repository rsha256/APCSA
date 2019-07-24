import java.util.*;

public class Delimiters {
    /**
     * The open and close delimiters.
     */
    private String openDel;
    private String closeDel;

    /**
     * Constructs a Delimiters object where open is the open delimiter and close is the
     * close delimiter.
     * Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /**
     * Returns an ArrayList of delimiters from the array tokens, as described in part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String> x = new ArrayList<String>();
        for (String s : tokens)
            if (s.equals(openDel) || s.equals(closeDel))
                x.add(s);

        return x;
    }

    /**
     * Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        /* to be implemented in part (b) */
        int clCount = 0;
        int opCount = 0;
        for (String delimiter : delimiters) {
            if (delimiter.equals(openDel)) {
                opCount++;
            } else {
                clCount++;
            }
            if (clCount > opCount) {
                return false;
            }
        }
        return opCount == clCount;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}