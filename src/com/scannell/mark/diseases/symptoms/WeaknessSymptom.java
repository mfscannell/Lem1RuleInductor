package com.scannell.mark.diseases.symptoms;

import com.scannell.mark.ruleInduction.interfaces.Attribute;

public class WeaknessSymptom extends Symptom {
    public static final String NAME = "Weakness";
    
    public WeaknessSymptom(boolean discretizedValue) {
        this.discretizedValue = discretizedValue;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Object getDiscretizedValue() {
        return discretizedValue;
    }

    @Override
    public boolean equals(Attribute attribute) {
        return getName().equals(attribute.getName()) && 
               discretizedValue.equals(attribute.getDiscretizedValue());
    }
}
