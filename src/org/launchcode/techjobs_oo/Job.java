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
        HashMap<String, String> jobMap = new HashMap<>();
        ArrayList<String> endList = new ArrayList<>();
        String id = String.valueOf(getId());
        jobMap.put("Core Competency:",job.getCoreCompetency().getValue());
        jobMap .put("Position Type:",job.getPositionType().getValue());
        jobMap.put("Location:",job.getLocation().getValue());
        jobMap.put("Employer:",job.getEmployer().getValue());
        jobMap.put("Name:", job.getName());
        jobMap.put("ID:",id);


//        String name = ("Name: _" + job.getName() + "_");
//        String employer =("Employer: _" + job.getEmployer().getValue() + "_");
//        String location =("Location: _" + job.getLocation().getValue() + "_");
//        String positionType =("Position Type: _" + job.getPositionType().getValue() + "_");
//        String coreCompetency =("Core Competency: _" + job.getCoreCompetency().getValue() + "_");
        for (Map.Entry<String, String> entry : jobMap.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            if (value.length() == 0 || value.isBlank()){
                endList.add(key + "_Data not available_");
            }
            else{
                endList.add(key + "_"+value+"_");


            }
            endList.add(System.lineSeparator());

        }
        String fin = String.join("",endList);


//        String l = System.lineSeparator();
//        String jobString = ( id + l + name + l + employer + l + location + l + positionType + l + coreCompetency);
//        if (job.getName().length() == 0 || job.getName().isBlank()){
//            joblist.put("Name:", "_Data not available_");
//        }
//        else {
//            joblist.put("Name:","_" + job.getName() + "_");
//        }
//        if (job.getEmployer().getValue().length() == 0 || job.getEmployer().getValue().isBlank()){
//            String employer =("Employer: _Data not available_");
//        }
//        else {
//            String employer =("Employer: _" + job.getEmployer().getValue() + "_");
//        }
//        if (job.getLocation().getValue().length() == 0 || job.getLocation().getValue().isBlank()){
//            String location =("Location: _Data not available_");
//        }
//        else {
//            String location =("Location: _" + job.getLocation().getValue() + "_");
//
//        }
//        if (job.getPositionType().getValue().length() == 0 || job.getPositionType().getValue().isBlank()){
//            String positionType =("Position Type: _Data not available_");
//        }
//        else {
//            String positionType =("Position Type: _" + job.getPositionType().getValue() + "_");
//
//        }
//        if (job.getCoreCompetency().getValue().length() == 0 || job.getCoreCompetency().getValue().isBlank()){
//            String coreCompetency =("Core Competency: _Data not available_");
//        }else {
//            String coreCompetency =("Core Competency: _" + job.getCoreCompetency().getValue() + "_");
//
//        }
//        String jobString = ( id + l + name + l + employer + l + location + l + positionType + l + coreCompetency);




//        r
        return fin;

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
