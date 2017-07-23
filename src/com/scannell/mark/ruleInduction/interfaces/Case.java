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
    public abstract boolean haveSameDecision(Case datum);
    
    /**
     * Get the discretized value of the attribute with the corresponding name.
     * @param attributeName  The attribute name to get the discretized value for.
     * @return  The discretized value of the attribute.
     */
    public abstract Object getAttributeDiscretizedValue(String attributeName);
    
    /**
     * Checks to see if the two cases have the same attribute values for each of the specified 
     * attribute names.  All attributes whose names are not supplied in the list of attribute names 
     * are ignored in the comparison.  
     * @param datum  A second case.
     * @param attributeName  A list of attribute names.
     * @return
     */
    public abstract boolean haveSameAttributeValues(Case datum, List<String> attributeNames);
}
