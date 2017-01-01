package com.scannell.mark.diseases;

import java.util.List;

import com.scannell.mark.diseases.symptoms.Symptom;
import com.scannell.mark.ruleInduction.interfaces.Attribute;
import com.scannell.mark.ruleInduction.interfaces.Case;
import com.scannell.mark.ruleInduction.interfaces.Decision;

public class FluCase implements Case {
    private List<Symptom> symptoms;
    private List<Attribute> attributes;
    private Decision decision;
    
    public FluCase(List<Attribute> symptoms, Decision decision) {
        this.attributes = symptoms;
        this.decision = decision;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public Decision getDecision() {
        return decision;
    }

    @Override
    public boolean haveSaveDecision(Case datum) {
        return this.decision.equals(datum.getDecision());
    }
}
