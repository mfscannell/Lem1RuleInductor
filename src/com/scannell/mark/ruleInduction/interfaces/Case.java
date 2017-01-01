package com.scannell.mark.ruleInduction.interfaces;

import java.util.List;

public interface Case {

    public abstract List<Attribute> getAttributes();
    
    public abstract Decision getDecision();
    
    /**
     * Checks if the two cases have the same decision.
     * @param datum  A case to see if they have the same decision.
     * @return  True if the two cases have the same decision.
     */
    public abstract boolean haveSaveDecision(Case datum);
}
