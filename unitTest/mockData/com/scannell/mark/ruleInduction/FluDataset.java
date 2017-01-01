package mockData.com.scannell.mark.ruleInduction;

import java.util.ArrayList;
import java.util.List;

import com.scannell.mark.diseases.FluCase;
import com.scannell.mark.diseases.FluDecision;
import com.scannell.mark.diseases.symptoms.HeadacheSymptom;
import com.scannell.mark.diseases.symptoms.NauseaSymptom;
import com.scannell.mark.diseases.symptoms.TemperatureSymptom;
import com.scannell.mark.diseases.symptoms.WeaknessSymptom;
import com.scannell.mark.ruleInduction.interfaces.Attribute;
import com.scannell.mark.ruleInduction.interfaces.Case;
import com.scannell.mark.ruleInduction.interfaces.Decision;

public class FluDataset {
    private static Attribute attribute11 = new TemperatureSymptom("very_high");
    private static Attribute attribute12 = new HeadacheSymptom(true);
    private static Attribute attribute13 = new WeaknessSymptom(true);
    private static Attribute attribute14 = new NauseaSymptom(false);
    private static List<Attribute> attributes1 = new ArrayList<Attribute>();
    private static Decision decision1 = new FluDecision(true);
    private static Case case1;
    
    private static Attribute attribute21 = new TemperatureSymptom("high");
    private static Attribute attribute22 = new HeadacheSymptom(true);
    private static Attribute attribute23 = new WeaknessSymptom(false);
    private static Attribute attribute24 = new NauseaSymptom(true);
    private static List<Attribute> attributes2 = new ArrayList<Attribute>();
    private static Decision decision2 = new FluDecision(true);
    private static Case case2;
    
    private static Attribute attribute31 = new TemperatureSymptom("normal");
    private static Attribute attribute32 = new HeadacheSymptom(false);
    private static Attribute attribute33 = new WeaknessSymptom(false);
    private static Attribute attribute34 = new NauseaSymptom(false);
    private static List<Attribute> attributes3 = new ArrayList<Attribute>();
    private static Decision decision3 = new FluDecision(false);
    private static Case case3;
    
    private static Attribute attribute41 = new TemperatureSymptom("normal");
    private static Attribute attribute42 = new HeadacheSymptom(true);
    private static Attribute attribute43 = new WeaknessSymptom(true);
    private static Attribute attribute44 = new NauseaSymptom(true);
    private static List<Attribute> attributes4 = new ArrayList<Attribute>();
    private static Decision decision4 = new FluDecision(true);
    private static Case case4;
    
    private static Attribute attribute51 = new TemperatureSymptom("high");
    private static Attribute attribute52 = new HeadacheSymptom(false);
    private static Attribute attribute53 = new WeaknessSymptom(true);
    private static Attribute attribute54 = new NauseaSymptom(false);
    private static List<Attribute> attributes5 = new ArrayList<Attribute>();
    private static Decision decision5 = new FluDecision(true);
    private static Case case5;
    
    private static Attribute attribute61 = new TemperatureSymptom("high");
    private static Attribute attribute62 = new HeadacheSymptom(false);
    private static Attribute attribute63 = new WeaknessSymptom(false);
    private static Attribute attribute64 = new NauseaSymptom(false);
    private static List<Attribute> attributes6 = new ArrayList<Attribute>();
    private static Decision decision6 = new FluDecision(false);
    private static Case case6;
    
    private static Attribute attribute71 = new TemperatureSymptom("normal");
    private static Attribute attribute72 = new HeadacheSymptom(false);
    private static Attribute attribute73 = new WeaknessSymptom(true);
    private static Attribute attribute74 = new NauseaSymptom(false);
    private static List<Attribute> attributes7 = new ArrayList<Attribute>();
    private static Decision decision7 = new FluDecision(false);
    private static Case case7;
    
    private static List<Case> cases = new ArrayList<Case>();
    
    public static List<Case> getDataset() {
        if (attributes1.isEmpty()) {
            attributes1.add(attribute11);
            attributes1.add(attribute12);
            attributes1.add(attribute13);
            attributes1.add(attribute14);
        }
        
        if (case1 == null) {
            case1 = new FluCase(attributes1, decision1);
        }
        
        if (attributes2.isEmpty()) {
            attributes2.add(attribute21);
            attributes2.add(attribute22);
            attributes2.add(attribute23);
            attributes2.add(attribute24);
        }
        
        if (case2 == null) {
            case2 = new FluCase(attributes2, decision2);
        }
        
        if (attributes3.isEmpty()) {
            attributes3.add(attribute31);
            attributes3.add(attribute32);
            attributes3.add(attribute33);
            attributes3.add(attribute34);
        }
        
        if (case3 == null) {
            case3 = new FluCase(attributes3, decision3);
        }
        
        if (attributes4.isEmpty()) {
            attributes4.add(attribute41);
            attributes4.add(attribute42);
            attributes4.add(attribute43);
            attributes4.add(attribute44);
        }
        
        if (case4 == null) {
            case4 = new FluCase(attributes4, decision4);
        }
        
        if (attributes5.isEmpty()) {
            attributes5.add(attribute51);
            attributes5.add(attribute52);
            attributes5.add(attribute53);
            attributes5.add(attribute54);
        }
        
        if (case5 == null) {
            case5 = new FluCase(attributes5, decision5);
        }
        
        if (attributes6.isEmpty()) {
            attributes6.add(attribute61);
            attributes6.add(attribute62);
            attributes6.add(attribute63);
            attributes6.add(attribute64);
        }
        
        if (case6 == null) {
            case6 = new FluCase(attributes6, decision6);
        }
        
        if (attributes7.isEmpty()) {
            attributes7.add(attribute71);
            attributes7.add(attribute72);
            attributes7.add(attribute73);
            attributes7.add(attribute74);
        }
        
        if (case7 == null) {
            case7 = new FluCase(attributes7, decision7);
        }
        
        if (cases.isEmpty()) {
            cases.add(case1);
            cases.add(case2);
            cases.add(case3);
            cases.add(case4);
            cases.add(case5);
            cases.add(case6);
            cases.add(case7);
        }
        
        return cases;
    }
}
