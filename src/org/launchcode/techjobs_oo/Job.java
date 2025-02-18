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

    @Override
    public String toString(){
        String[] keyArray ={
                "ID",
                "Name",
                "Employer",
                "Location",
                "Position Type",
                "Core Competency"
        };
        String[] valueArray = {
                String.valueOf(id),
                name,
                String.valueOf(employer),
                String.valueOf(location),
                String.valueOf(positionType),
                String.valueOf(coreCompetency),
        };
        StringBuilder finalS = new StringBuilder();
        finalS.append(System.lineSeparator());
        if (    name.isBlank() &&
                String.valueOf(employer).isBlank() &&
                String.valueOf(location).isBlank() &&
                String.valueOf(positionType).isBlank() &&
                String.valueOf(coreCompetency).isBlank()
            )
        {
            finalS.append("OOPS! This job does not seem to exist.").append(System.lineSeparator());
        }
        else {
            for (int i = 0; i < valueArray.length; i++) {
                if (valueArray[i] == null || valueArray[i].isBlank()) {
                    finalS.append(keyArray[i]).append(": ").append("Data not available");
                }
                else {
                    finalS.append(keyArray[i]).append(": ").append(valueArray[i]);
                }

                finalS.append(System.lineSeparator());
            }
        }
        return finalS.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }


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
