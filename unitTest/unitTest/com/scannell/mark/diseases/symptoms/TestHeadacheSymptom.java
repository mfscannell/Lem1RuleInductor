package unitTest.com.scannell.mark.diseases.symptoms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.scannell.mark.diseases.symptoms.HeadacheSymptom;
import com.scannell.mark.diseases.symptoms.NauseaSymptom;
import com.scannell.mark.ruleInduction.interfaces.Attribute;

public class TestHeadacheSymptom {

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
    public void testEqualsTrue() {
        Attribute firstAttribute = new HeadacheSymptom(true);
        Attribute secondAttribute = new HeadacheSymptom(true);
        
        assertTrue(firstAttribute.equals(secondAttribute));
    }

    @Test
    public void testEqualsFalse() {
        Attribute firstAttribute = new HeadacheSymptom(true);
        Attribute secondAttribute = new HeadacheSymptom(false);
        
        assertFalse(firstAttribute.equals(secondAttribute));
    }
    
    @Test
    public void testEqualsDifferentSymptomsFalse() {
        Attribute firstAttribute = new HeadacheSymptom(true);
        Attribute secondAttribute = new NauseaSymptom(true);
        
        assertFalse(firstAttribute.equals(secondAttribute));
    }
}
