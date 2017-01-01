package com.scannell.mark.diseases.symptoms;

import com.scannell.mark.ruleInduction.interfaces.Attribute;

public abstract class Symptom implements Attribute {
    protected Object value;
    protected Object discretizedValue;
}
