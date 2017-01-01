package com.scannell.mark.ruleInduction.interfaces;

public interface Decision {
    public abstract String getName();
    
    public abstract Object getDiscretizedValue();
    
    /**
     * Checks if the decision has the same decision as the one provided.  The decisions are equal if
     * the name and the value of the decision are equal.
     * @param decision  A decision to see if the case has the same decision as.
     * @return  True if the case has the decision.
     */
    public abstract boolean equals(Decision decision);
}
