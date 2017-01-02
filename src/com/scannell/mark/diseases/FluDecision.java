package com.scannell.mark.diseases;

import com.scannell.mark.ruleInduction.interfaces.Decision;

public class FluDecision implements Decision {
    public static final String NAME = "Flu";
    private Object discretizedValue;

    public FluDecision(Object discretizedValue) {
        this.discretizedValue = discretizedValue;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Object getDiscretizedValue() {
        return discretizedValue;
    }
    
    @Override
    public boolean equals(Decision decision) {
        return NAME.equals(decision.getName()) && 
                discretizedValue.equals(decision.getDiscretizedValue());
    }
}
