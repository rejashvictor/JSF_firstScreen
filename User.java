
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rejash.victorpaul
 */
public class User {
     String courseName;
    Date courseStartDate;
    String discription;
    String duration;
    String noOfParticepents;
    String costPerPerson;
    String totalCost;
    int id;
    boolean internal;
    boolean external;
    String instructor;
    String courseNameError, totalCostError, discriptionError, participationError, durationError, instructorError;
   

    public User(String courseName, Date courseStartDate, String discription, String duration, String noOfParticepents, String costPerPerson, String totalCost, int id, boolean internal, boolean external, String instructor, String courseNameError, String totalCostError, String discriptionError, String participationError, String durationError, String instructorError) {
        this.courseName = courseName;
        this.courseStartDate = courseStartDate;
        this.discription = discription;
        this.duration = duration;
        this.noOfParticepents = noOfParticepents;
        this.costPerPerson = costPerPerson;
        this.totalCost = totalCost;
        this.id = id;
        this.internal = internal;
        this.external = external;
        this.instructor = instructor;
        this.courseNameError = courseNameError;
        this.totalCostError = totalCostError;
        this.discriptionError = discriptionError;
        this.participationError = participationError;
        this.durationError = durationError;
        this.instructorError = instructorError;
        
        
        
    }

    User(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNoOfParticepents() {
        return noOfParticepents;
    }

    public void setNoOfParticepents(String noOfParticepents) {
        this.noOfParticepents = noOfParticepents;
    }

    public String getCostPerPerson() {
        return costPerPerson;
    }

    public void setCostPerPerson(String costPerPerson) {
        this.costPerPerson = costPerPerson;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseNameError() {
        return courseNameError;
    }

    public void setCourseNameError(String courseNameError) {
        this.courseNameError = courseNameError;
    }

    public String getTotalCostError() {
        return totalCostError;
    }

    public void setTotalCostError(String totalCostError) {
        this.totalCostError = totalCostError;
    }

    public String getDiscriptionError() {
        return discriptionError;
    }

    public void setDiscriptionError(String discriptionError) {
        this.discriptionError = discriptionError;
    }

    public String getParticipationError() {
        return participationError;
    }

    public void setParticipationError(String participationError) {
        this.participationError = participationError;
    }

    public String getDurationError() {
        return durationError;
    }

    public void setDurationError(String durationError) {
        this.durationError = durationError;
    }

    public String getInstructorError() {
        return instructorError;
    }

    public void setInstructorError(String instructorError) {
        this.instructorError = instructorError;
    }

    
    
    
}
