package com.scannell.mark.diseases;

import java.util.ArrayList;
import java.util.List;

import com.scannell.mark.diseases.symptoms.HeadacheSymptom;
import com.scannell.mark.diseases.symptoms.NauseaSymptom;
import com.scannell.mark.diseases.symptoms.Symptom;
import com.scannell.mark.diseases.symptoms.TemperatureSymptom;
import com.scannell.mark.diseases.symptoms.WeaknessSymptom;
import com.scannell.mark.ruleInduction.interfaces.Attribute;
import com.scannell.mark.ruleInduction.interfaces.Case;
import com.scannell.mark.ruleInduction.interfaces.Decision;

public class FluCase implements Case {
    private List<Symptom> symptoms;
    
    private static List<String> attributeNames = new ArrayList<String>();
    private List<Attribute> attributes;
    private Decision decision;
    
    /**
     * Constructor.
     * @param symptoms  A list of symptoms, each symptom is a specific type and has a value
     * (high, low, true, false, etc.)
     * @param decision  The decision of the case.  Whether or not the case has the flu or not.
     */
    public FluCase(List<Attribute> symptoms, Decision decision) {
        if (attributeNames.isEmpty()) {
            attributeNames.add(HeadacheSymptom.NAME);
            attributeNames.add(NauseaSymptom.NAME);
            attributeNames.add(TemperatureSymptom.NAME);
            attributeNames.add(WeaknessSymptom.NAME);
        }
        
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
    public boolean haveSameDecision(Case datum) {
        return this.decision.equals(datum.getDecision());
    }

    @Override
    public List<String> getAttributeNames() {
        return attributeNames;
    }

    @Override
    public boolean haveSameAttributeValues(Case datum, List<String> attributeNames) {
        boolean sameValues = true;
        
        for (String attributeName : attributeNames) {
            Object thisDiscreteValue = getAttributeDiscretizedValue(attributeName);
            Object datumDiscreteValue = datum.getAttributeDiscretizedValue(attributeName);
            if (!thisDiscreteValue.equals(datumDiscreteValue)) {
                sameValues = false;
                break;
            }
        }
        
        return sameValues;
    }

    @Override
    public Object getAttributeDiscretizedValue(String attributeName) {
        Object discretizedValue = null;
        
        for (Attribute attribute : attributes) {
            if (attributeName.equals(attribute.getName())) {
                discretizedValue = attribute.getDiscretizedValue();
            }
        }
        
        return discretizedValue;
    }
}
