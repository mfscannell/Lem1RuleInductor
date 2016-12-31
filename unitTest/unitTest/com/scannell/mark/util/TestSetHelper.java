package unitTest.com.scannell.mark.util;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.scannell.mark.sampleCase.Case;
import com.scannell.mark.util.SetHelper;

public class TestSetHelper {

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
    public void testSubsetBothEmpty() {
        Set<String> firstSet = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertTrue(result);
    }
    
    @Test
    public void testSubsetEmptyAndNonEmpty() {
        String firstString = "1";
        String secondString = "2";
        
        Set<String> firstSet = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        
        secondSet.add(secondString);
        secondSet.add(firstString);
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertTrue(result);
    }

    @Test
    public void testSubsetSameNonEmpty() {
        String firstString = "1";
        String secondString = "2";
        
        Set<String> firstSet = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        
        firstSet.add(firstString);
        firstSet.add(secondString);
        
        secondSet.add(secondString);
        secondSet.add(firstString);
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertTrue(result);
    }
    
    @Test
    public void testSubsetSub() {
        String firstString = "1";
        String secondString = "2";
        
        Set<String> firstSet = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        
        firstSet.add(firstString);
        
        secondSet.add(secondString);
        secondSet.add(firstString);
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertTrue(result);
    }
    
    @Test
    public void testSubsetFalse() {
        String firstString = "1";
        String secondString = "2";
        
        Set<String> firstSet = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        
        firstSet.add(firstString);
        firstSet.add(secondString);
        
        secondSet.add(secondString);
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertFalse(result);
    }

    @Test
    public void testSubsetSameButDifferent() {
        String firstString = "1";
        String secondString = "2";
        String secondStringCopy = "2";
        
        Set<String> firstSet = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        
        firstSet.add(firstString);
        firstSet.add(secondString);
        
        secondSet.add(secondStringCopy);
        secondSet.add(firstString);
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertTrue(result);
    }
    
    @Test
    public void testSubsetSimilarObjects() {
        Case firstCase = new Case(null, "1");
        Case firstCaseCopy = new Case(null, "1");
        
        Set<Case> firstSet = new HashSet<Case>();
        Set<Case> secondSet = new HashSet<Case>();
        
        firstSet.add(firstCase);
        secondSet.add(firstCaseCopy);
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertFalse(result);
    }
    
    @Test
    public void testSubsetSameObject() {
        Case firstCase = new Case(null, "1");
        
        Set<Case> firstSet = new HashSet<Case>();
        Set<Case> secondSet = new HashSet<Case>();
        
        firstSet.add(firstCase);
        secondSet.add(firstCase);
        
        boolean result = SetHelper.isSubset(firstSet, secondSet);
        
        assertTrue(result);
    }
}
