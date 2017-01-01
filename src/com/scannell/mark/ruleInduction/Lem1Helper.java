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
    
    public Set<Set<Case>> getDStar() {
        return dStar;
    }
    
    /**
     * Partition out the cases into subsets such that all cases in each subset have the same decision.
     */
    private void createDStar() {
        dStar = new HashSet<Set<Case>>();
        
        for (Case unexaminedCase : cases) {
            if (dStar.isEmpty()) {
                Set<Case> newSubSet = new HashSet<Case>();
                newSubSet.add(unexaminedCase);
                dStar.add(newSubSet);
            } else {
                boolean decisionFound = false;
                
                for (Set<Case> existingSubset : dStar) {
                    Case caseFromExistingSubset = existingSubset.iterator().next();
                    
                    if (caseFromExistingSubset.haveSaveDecision(unexaminedCase)) {
                        existingSubset.add(unexaminedCase);
                        decisionFound = true;
                    }
                }
                
                if (!decisionFound) {
                    Set<Case> newSubSet = new HashSet<Case>();
                    newSubSet.add(unexaminedCase);
                    dStar.add(newSubSet);
                }
            }
        }
    }
}
