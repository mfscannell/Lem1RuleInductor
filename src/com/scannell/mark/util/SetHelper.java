package com.scannell.mark.util;

import java.util.Set;

public class SetHelper {
    /**
     * Checks if the candidate subset is a subset of the second set.  The candidate subset is a subset
     * of the second set if the second set contains all elements in the candidate subset.
     * @param subset  The candidate subset.
     * @param set  The set to see if the candidate subset is a subset of.
     * @return  True if the candidate subset is a subset.
     */
    public static boolean isSubset(Set<?> subset, Set<?> set) {
        boolean subsetIsSubset = set.containsAll(subset);
        
        return subsetIsSubset;
    }
}
