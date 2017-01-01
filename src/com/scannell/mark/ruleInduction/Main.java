package com.scannell.mark.ruleInduction;

import java.util.ArrayList;
import java.util.List;

import com.scannell.mark.diseases.FluCase;
import com.scannell.mark.diseases.FluDecision;
import com.scannell.mark.diseases.symptoms.HeadacheSymptom;
import com.scannell.mark.diseases.symptoms.NauseaSymptom;
import com.scannell.mark.diseases.symptoms.Symptom;
import com.scannell.mark.diseases.symptoms.TemperatureSymptom;
import com.scannell.mark.diseases.symptoms.WeaknessSymptom;
import com.scannell.mark.ruleInduction.interfaces.Attribute;
import com.scannell.mark.ruleInduction.interfaces.Case;
import com.scannell.mark.ruleInduction.interfaces.Decision;

public class Main {
    public static void main(String[] args) {
        Attribute attribute11 = new TemperatureSymptom("very_high");
        Attribute attribute12 = new HeadacheSymptom(true);
        Attribute attribute13 = new WeaknessSymptom(true);
        Attribute attribute14 = new NauseaSymptom(false);
        List<Attribute> attributes1 = new ArrayList<Attribute>();
        attributes1.add(attribute11);
        attributes1.add(attribute12);
        attributes1.add(attribute13);
        attributes1.add(attribute14);
        Decision decision1 = new FluDecision(true);
        Case case1 = new FluCase(attributes1, decision1);
        
        Attribute attribute21 = new TemperatureSymptom("high");
        Attribute attribute22 = new HeadacheSymptom(true);
        Attribute attribute23 = new WeaknessSymptom(false);
        Attribute attribute24 = new NauseaSymptom(true);
        List<Attribute> attributes2 = new ArrayList<Attribute>();
        attributes2.add(attribute21);
        attributes2.add(attribute22);
        attributes2.add(attribute23);
        attributes2.add(attribute24);
        Decision decision2 = new FluDecision(true);
        Case case2 = new FluCase(attributes2, decision2);
        
        Attribute attribute31 = new TemperatureSymptom("normal");
        Attribute attribute32 = new HeadacheSymptom(false);
        Attribute attribute33 = new WeaknessSymptom(false);
        Attribute attribute34 = new NauseaSymptom(false);
        List<Attribute> attributes3 = new ArrayList<Attribute>();
        attributes3.add(attribute31);
        attributes3.add(attribute32);
        attributes3.add(attribute33);
        attributes3.add(attribute34);
        Decision decision3 = new FluDecision(false);
        Case case3 = new FluCase(attributes3, decision3);
        
        Attribute attribute41 = new TemperatureSymptom("normal");
        Attribute attribute42 = new HeadacheSymptom(true);
        Attribute attribute43 = new WeaknessSymptom(true);
        Attribute attribute44 = new NauseaSymptom(true);
        List<Attribute> attributes4 = new ArrayList<Attribute>();
        attributes4.add(attribute41);
        attributes4.add(attribute42);
        attributes4.add(attribute43);
        attributes4.add(attribute44);
        Decision decision4 = new FluDecision(true);
        Case case4 = new FluCase(attributes4, decision4);
        
        Attribute attribute51 = new TemperatureSymptom("high");
        Attribute attribute52 = new HeadacheSymptom(false);
        Attribute attribute53 = new WeaknessSymptom(true);
        Attribute attribute54 = new NauseaSymptom(false);
        List<Attribute> attributes5 = new ArrayList<Attribute>();
        attributes5.add(attribute51);
        attributes5.add(attribute52);
        attributes5.add(attribute53);
        attributes5.add(attribute54);
        Decision decision5 = new FluDecision(true);
        Case case5 = new FluCase(attributes5, decision5);
        
        Attribute attribute61 = new TemperatureSymptom("high");
        Attribute attribute62 = new HeadacheSymptom(false);
        Attribute attribute63 = new WeaknessSymptom(false);
        Attribute attribute64 = new NauseaSymptom(false);
        List<Attribute> attributes6 = new ArrayList<Attribute>();
        attributes6.add(attribute61);
        attributes6.add(attribute62);
        attributes6.add(attribute63);
        attributes6.add(attribute64);
        Decision decision6 = new FluDecision(false);
        Case case6 = new FluCase(attributes6, decision6);
        
        Attribute attribute71 = new TemperatureSymptom("normal");
        Attribute attribute72 = new HeadacheSymptom(false);
        Attribute attribute73 = new WeaknessSymptom(true);
        Attribute attribute74 = new NauseaSymptom(false);
        List<Attribute> attributes7 = new ArrayList<Attribute>();
        attributes7.add(attribute71);
        attributes7.add(attribute72);
        attributes7.add(attribute73);
        attributes7.add(attribute74);
        Decision decision7 = new FluDecision(false);
        Case case7 = new FluCase(attributes7, decision7);
        
        List<Case> cases = new ArrayList<Case>();
        cases.add(case1);
        cases.add(case2);
        cases.add(case3);
        cases.add(case4);
        cases.add(case5);
        cases.add(case6);
        cases.add(case7);
    }
}
