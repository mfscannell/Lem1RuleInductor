package unitTest.com.scannell.mark.ruleInduction;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.scannell.mark.diseases.symptoms.HeadacheSymptom;
import com.scannell.mark.diseases.symptoms.NauseaSymptom;
import com.scannell.mark.diseases.symptoms.TemperatureSymptom;
import com.scannell.mark.diseases.symptoms.WeaknessSymptom;
import com.scannell.mark.ruleInduction.Lem1Helper;
import com.scannell.mark.ruleInduction.interfaces.Case;

import mockData.com.scannell.mark.ruleInduction.MockFluDataset;

public class TestLem1Helper {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDecisionDependsOn1_2_3_4_5_6_7() {
        List<Case> fluDataset = MockFluDataset.getDataset();
        Set<Set<Case>> aStar = new HashSet<Set<Case>>();
        
        for (Case datum : fluDataset) {
            Set<Case> subset = new HashSet<Case>();
            subset.add(datum);
            aStar.add(subset);
        }
        
        Lem1Helper lem1Helper  = new Lem1Helper(fluDataset);
        
        boolean result = lem1Helper.decisionDependsOn(aStar);
        
        assertTrue(result);
    }

    @Test
    public void testDecisionDependsOn1_2_36_4_57() {
        List<Case> fluDataset = MockFluDataset.getDataset();
        Set<Set<Case>> aStar = new HashSet<Set<Case>>();
        
        Set<Case> subset1 = new HashSet<Case>();
        subset1.add(fluDataset.get(0));
        
        Set<Case> subset2 = new HashSet<Case>();
        subset2.add(fluDataset.get(1));
        
        Set<Case> subset36 = new HashSet<Case>();
        subset36.add(fluDataset.get(2));
        subset36.add(fluDataset.get(5));
        
        Set<Case> subset4 = new HashSet<Case>();
        subset4.add(fluDataset.get(3));
        
        Set<Case> subset57 = new HashSet<Case>();
        subset57.add(fluDataset.get(6));
        subset57.add(fluDataset.get(4));
        
        aStar.add(subset57);
        aStar.add(subset36);
        aStar.add(subset1);
        aStar.add(subset2);
        aStar.add(subset4);
        
        Lem1Helper lem1Helper  = new Lem1Helper(fluDataset);
        
        boolean result = lem1Helper.decisionDependsOn(aStar);
        
        assertFalse(result);
    }
    
    @Test
    public void testDecisionDependsOn1_2_37_4_56() {
        List<Case> fluDataset = MockFluDataset.getDataset();
        Set<Set<Case>> aStar = new HashSet<Set<Case>>();
        
        Set<Case> subset1 = new HashSet<Case>();
        subset1.add(fluDataset.get(0));
        
        Set<Case> subset2 = new HashSet<Case>();
        subset2.add(fluDataset.get(1));
        
        Set<Case> subset37 = new HashSet<Case>();
        subset37.add(fluDataset.get(2));
        subset37.add(fluDataset.get(6));
        
        Set<Case> subset4 = new HashSet<Case>();
        subset4.add(fluDataset.get(3));
        
        Set<Case> subset56 = new HashSet<Case>();
        subset56.add(fluDataset.get(4));
        subset56.add(fluDataset.get(5));
        
        aStar.add(subset1);
        aStar.add(subset2);
        aStar.add(subset37);
        aStar.add(subset4);
        aStar.add(subset56);
        
        Lem1Helper lem1Helper  = new Lem1Helper(fluDataset);
        
        boolean result = lem1Helper.decisionDependsOn(aStar);
        
        assertFalse(result);
    }
    
    @Test
    public void testPartitionCasesOnCommonAttributes_TemperatureHeadacheWeaknessNauses() {
        List<Case> fluDataset = MockFluDataset.getDataset();
        Lem1Helper lem1Helper = new Lem1Helper(fluDataset);
        List<String> attributeNames = new ArrayList<String>();
        attributeNames.add(TemperatureSymptom.NAME);
        attributeNames.add(HeadacheSymptom.NAME);
        attributeNames.add(WeaknessSymptom.NAME);
        attributeNames.add(NauseaSymptom.NAME);
        
        Set<Set<Case>> result = lem1Helper.partitionCasesOnCommonAttributes(attributeNames);
        
        Iterator<Set<Case>> iterator = result.iterator();
        
        assertSame(7, result.size());
        
        Set<Case> subset = iterator.next();
        assertSame(1, subset.size());
        assertSame(fluDataset.get(6), subset.iterator().next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        assertSame(fluDataset.get(1), subset.iterator().next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        assertSame(fluDataset.get(0), subset.iterator().next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        assertSame(fluDataset.get(4), subset.iterator().next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        assertSame(fluDataset.get(2), subset.iterator().next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        assertSame(fluDataset.get(3), subset.iterator().next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        assertSame(fluDataset.get(5), subset.iterator().next());
        
        assertFalse(iterator.hasNext());
    }
    
    @Test
    public void testPartitionCasesOnCommonAttributes_HeadacheWeaknessNauses() {
        List<Case> fluDataset = MockFluDataset.getDataset();
        Lem1Helper lem1Helper = new Lem1Helper(fluDataset);
        List<String> attributeNames = new ArrayList<String>();
        attributeNames.add(HeadacheSymptom.NAME);
        attributeNames.add(WeaknessSymptom.NAME);
        attributeNames.add(NauseaSymptom.NAME);
        
        Set<Set<Case>> result = lem1Helper.partitionCasesOnCommonAttributes(attributeNames);
        
        Iterator<Set<Case>> iterator = result.iterator();
        
        assertSame(5, result.size());
        
        Set<Case> subset = iterator.next();
        assertSame(1, subset.size());
        Iterator<Case> subsetIterator = subset.iterator();
        assertSame(fluDataset.get(1), subsetIterator.next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        subsetIterator = subset.iterator();
        assertSame(fluDataset.get(0), subsetIterator.next());
        
        subset = iterator.next();
        assertSame(2, subset.size());
        subsetIterator = subset.iterator();
        assertSame(fluDataset.get(6), subsetIterator.next());
        assertSame(fluDataset.get(4), subsetIterator.next());
        
        subset = iterator.next();
        assertSame(2, subset.size());
        subsetIterator = subset.iterator();
        assertSame(fluDataset.get(2), subsetIterator.next());
        assertSame(fluDataset.get(5), subsetIterator.next());
        
        subset = iterator.next();
        assertSame(1, subset.size());
        subsetIterator = subset.iterator();
        assertSame(fluDataset.get(3), subsetIterator.next());
        
        assertFalse(iterator.hasNext());
    }
}
