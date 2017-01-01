package com.scannell.mark.ruleInduction.interfaces;

public interface Attribute {
    public abstract String getName();
    
    public abstract Object getValue();
    
    public abstract Object getDiscretizedValue();
    
    public abstract boolean equals(Attribute attribute);
}
