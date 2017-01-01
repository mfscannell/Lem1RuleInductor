package com.scannell.mark.ruleInduction.interfaces;

public interface Decision {
    public abstract String getName();
    
    public abstract Object getDiscretizedValue();
    
    public abstract boolean equals(Decision decision);
}
