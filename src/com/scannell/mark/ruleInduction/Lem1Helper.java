package com.scannell.mark.ruleInduction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.scannell.mark.ruleInduction.interfaces.Case;
import com.scannell.mark.ruleInduction.interfaces.Decision;
import com.scannell.mark.util.SetHelper;

public class Lem1Helper {
    private List<Case> cases;
    private Set<Set<Case>> dStar;
    
    public Lem1Helper(List<Case> cases) {
        this.cases = cases;
        
        createDStar();
    }
    
    /**
     * Checks if the segregated collection of decisions depends upon the supplied collection of
     * cases segregated upon their common attributes.
     * @param bStar  A set of subsets of cases who all have the same attributes.
     * @return  True if the decision depends upon the subsets of cases.
     */
    public boolean decisionDependsOn(Set<Set<Case>> bStar) {
        boolean dDependsOnB = true;
        
        for (Set<Case> bSubset : bStar) {
            boolean bSubsetFound = false;
            
            for (Set<Case> dSubset : dStar) {
                if (SetHelper.isSubset(bSubset, dSubset)) {
                    bSubsetFound = true;
                    break;
                }
            }
            
            if (!bSubsetFound) {
                dDependsOnB = false;
                break;
            }
        }
        
        return dDependsOnB;
    }
    
    public Set<Set<Case>> partitionCasesOnCommonAttributes(List<String> attributeNames) {
        Set<Set<Case>> partitionedCases = new HashSet<Set<Case>>();
        
        for (Case unexaminedCase : cases) {
            if (partitionedCases.isEmpty()) {
                Set<Case> newSubset = new HashSet<Case>();
                newSubset.add(unexaminedCase);
                partitionedCases.add(newSubset);
            } else {
                boolean caseWithSameAttributesFound = false;
                
                for (Set<Case> existingSubset : partitionedCases) {
                    Case caseFromExistingSubset = existingSubset.iterator().next();
                    
                    //TODO mfs finish out
                    if (caseFromExistingSubset.haveSameAttributeValues(unexaminedCase, attributeNames)) {
                        existingSubset.add(unexaminedCase);
                        caseWithSameAttributesFound = true;
                        break;
                    }
                }
                
                if (!caseWithSameAttributesFound) {
                    Set<Case> newSubset = new HashSet<Case>();
                    newSubset.add(unexaminedCase);
                    partitionedCases.add(newSubset);
                }
            }
        }
        
        return partitionedCases;
    }
    
    public Set<Set<Case>> getDStar() {
        return dStar;
    }
    
    /**
     * Partition out the cases into subsets such that all cases in each subset have the same decision value.
     */
    private void createDStar() {
        dStar = new HashSet<Set<Case>>();
        
        for (Case unexaminedCase : cases) {
            if (dStar.isEmpty()) {
                Set<Case> newSubset = new HashSet<Case>();
                newSubset.add(unexaminedCase);
                dStar.add(newSubset);
            } else {
                boolean caseWithSameDecisionFound = false;
                
                for (Set<Case> existingSubset : dStar) {
                    Case caseFromExistingSubset = existingSubset.iterator().next();
                    
                    if (caseFromExistingSubset.haveSameDecision(unexaminedCase)) {
                        existingSubset.add(unexaminedCase);
                        caseWithSameDecisionFound = true;
                        break;
                    }
                }
                
                if (!caseWithSameDecisionFound) {
                    Set<Case> newSubset = new HashSet<Case>();
                    newSubset.add(unexaminedCase);
                    dStar.add(newSubset);
                }
            }
        }
    }
}
