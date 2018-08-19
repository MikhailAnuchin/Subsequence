package subsequence;

import java.util.*;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        // TODO: Implement the logic here
        //return false;
        if (x != null && y != null)
            for (int i = 0; i < (x.size() < y.size() ? y.size() : x.size()); i++) {
                if (i < x.size() && x.get(i) == null)
                    throw new IllegalArgumentException();
                if (i < y.size() && y.get(i) == null)
                    throw new IllegalArgumentException();
            }
        else if (x == null || y == null) throw new IllegalArgumentException();

        for (int i = 0; i < x.size(); i++)
            if (!y.contains(x.get(i)))
                return false;
        int[] workArray = new int[x.size()];
        for (int i = 0; i < x.size(); i++)
            for (int j = 0; j < y.size(); j++)
                if (y.get(j).equals(x.get(i))) workArray[i] = j;
        for (int i = 1; i < x.size(); i++)
            if (workArray[i - 1] > workArray[i])
                return false;
        return true;
    }
}




