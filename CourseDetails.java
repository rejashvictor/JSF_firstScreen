
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.primefaces.context.RequestContext;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rejash.victorpaul
 */
@ManagedBean(name = "courseDetails")
@RequestScoped
public class CourseDetails {

    String courseName;
    Date courseStartDate;
    String discription;
    String duration;
    @Max(1)
    String noOfParticipents;
    int costPerPerson;
    int totalCost;
    int id;
    boolean internal;
    boolean external;
    String instructor;
    String courseNameError, totalCostError, discriptionError, participationError, durationError, instructorError;
    String instructorType;
    int tc,pc;
    
    
    boolean checkInternal, checkExternal;

   

    

 

    public boolean isCheckInternal() {
        return checkInternal;
    }

    public void setCheckInternal(boolean checkInternal) {
        this.checkInternal = checkInternal;
    }

    public boolean isCheckExternal() {
        return checkExternal;
    }

    public void setCheckExternal(boolean checkExternal) {
        this.checkExternal = checkExternal;
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

    public Date getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructorType() {
        return instructorType;
    }

    public void setInstructorType(String instructorType) {
        this.instructorType = instructorType;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getNoOfParticipents() {
        return noOfParticipents;
    }

    public void setNoOfParticpents(String noOfParticipents) {
        this.noOfParticipents = noOfParticipents;
    }

    public int getCostPerPerson() {
        return costPerPerson;
    }

    public void setCostPerPerson(int costPerPerson) {
        this.costPerPerson = costPerPerson;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public void validateDiscription() {

    }

    public void courseDetail() {
        internal = true;
    }

    public void instructorChange() {
        if (instructorType.equalsIgnoreCase("Internal")) {
            System.out.println("Inside Internal");
            internal = true;

            RequestContext.getCurrentInstance().update("course");
        } else if (instructorType.equalsIgnoreCase("External")) {
            System.out.println("Inside External");
            external = false;
            RequestContext.getCurrentInstance().update("course");
        }

    }

    public void validateTitle() {
        if (courseName.matches("[a-z A-Z]+")) {
            setCourseNameError(" ");
        } else {
            setCourseNameError("Course name should be Alphabet");

        }

    }

    public void validateDuration(){
        if(duration.matches("1[012]|[1-9]")){
            setDurationError(" ");
        }else{
            setDurationError(" Duration must be Hours");
        }
    
    }
    
    public void validateParticipants() {
       
        if(noOfParticipents.matches("1[1-9]")){
            setParticipationError(" ");
        }else{
            setParticipationError("Partcipipant must be below 10");
        }
       
          
    }

}
