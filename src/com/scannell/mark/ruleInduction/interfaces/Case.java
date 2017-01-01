package com.scannell.mark.ruleInduction.interfaces;

import java.util.List;

public interface Case {

    public abstract List<Attribute> getAttributes();
    
    public abstract Object getDecision();
}
