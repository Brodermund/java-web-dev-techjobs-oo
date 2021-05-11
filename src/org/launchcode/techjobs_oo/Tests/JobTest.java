package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        int id1 = job1.getId();
        int id2 = job2.getId();
        assertFalse((id1 == id2));
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().getValue(),"ACME");
        assertEquals(testJob.getLocation().getValue(),"Desert");
        assertEquals(testJob.getPositionType().getValue(),"Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");

    }
    @Test
    public void testJobsForEquality(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int id1 = testJob.getId();
        int id2 = testJob2.getId();
        assertEquals(testJob.getName(), testJob2.getName());
        assertEquals(testJob.getEmployer().getValue(),testJob2.getEmployer().getValue());
        assertEquals(testJob.getLocation().getValue(),testJob2.getLocation().getValue());
        assertEquals(testJob.getPositionType().getValue(),testJob2.getPositionType().getValue());
        assertEquals(testJob.getCoreCompetency().getValue(),testJob2.getCoreCompetency().getValue());
        assertFalse((id1 == id2));
    }
    @Test
    public void testToString1(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().startsWith("_"));
        assertTrue(testJob.toString().endsWith("_"));

    }
    @Test
    public void testToString2(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().startsWith("_"));
        assertTrue(testJob.toString().endsWith("_"));

    }
    @Test
    public void testToString5(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job();
        System.out.println(testJob.toString(testJob2));

    }




}

