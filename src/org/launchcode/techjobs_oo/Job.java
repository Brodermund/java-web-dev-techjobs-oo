package org.launchcode.techjobs_oo;

import java.util.*;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer,Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    public String toString(Job job){
        int idValue = job.getId();
        String idField = (idValue + " ");
        String noData = "Data not available";
        String idKey = ("ID: ");
        String nameValue = job.getName();
        String nameKey = ("Name: ");
        String employerValue = job.getEmployer().toString();
        String employerKey = ("Employer: ");
        String locationValue = job.getLocation().toString();
        String locationKey = ("Location: ");
        String positionTypeValue = job.getPositionType().toString();
        String positionTypeKey = ("Position Type: ");
        String coreCompetencyValue =job.getCoreCompetency().toString();
        String coreCompetencyKey = ("Core Competency: ");
        String newLine = System.lineSeparator();
        String[] keyArray ={
                idKey,
                nameKey,
                employerKey,
                locationKey,
                positionTypeKey,
                coreCompetencyKey
        };
        String[] valueArray = {
          idField,
          nameValue,
          employerValue,
          locationValue,
          positionTypeValue,
          coreCompetencyValue
        };
        StringBuilder finalS = new StringBuilder();
        finalS.append(newLine);
        for (int i = 0; i < 5; i++){
            finalS.append(newLine);
            finalS.append(keyArray[i]).append(valueArray[i]);

        }
        finalS.append(newLine);
        String finalString = finalS.toString();




        return finalString;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
