/*
 Owner of this file : Ngu Cheng Jie
 Student ID : 10237865
 Date of submission :
 Module: ITS D004 Programming Fundamentals (L02)

        $$\   $$\   $$$$$$\      $$$$$\ 
        $$$\  $$ | $$  __$$\     \__$$ |
        $$$$\ $$ | $$ /  \__|       $$ |
        $$ $$\$$ | $$ |             $$ |
        $$ \$$$$ | $$ |       $$\   $$ |
        $$ |\$$$ | $$ |  $$\  $$ |  $$ |
        $$ | \$$ | \$$$$$$  | \$$$$$$  |
        \__|  \__|  \______/   \______/ 
                                
                              
                              
*/
import java.util.ArrayList;
public class Module{
    private String name; //name of the module
    private String moduleCode;
    private String description;
    private int creditUnits;
    private ArrayList<Assessment> assessments; 

    // Constructors
    public Module(){
        this.assessments = new ArrayList<Assessment>();
    }
    public Module(String name, String moduleCode, String description, int creditUnits) {
        this.name = name;
        this.moduleCode = moduleCode;
        this.description = description;
        this.creditUnits = creditUnits; 
        this.assessments = new ArrayList<Assessment>();
    }
   
    //setter
    public void setName(String name) {this.name = name;}
    public void setModuleCode(String moduleCode) {this.moduleCode = moduleCode;} 
    public void setDecription(String decription) {this.description = decription;}
    public void setCreditUnits(int creditUnits) {this.creditUnits = creditUnits;}

    //getter
    public String getName() {return name;}
    public String getModuleCode() {return moduleCode;}
    public String getDescription() {return description;}
    public int getCreditUnits(){return creditUnits;}
    
    //Method
    public double getOverallMarks(){
        double overallMarks = 0;

        for(Assessment obj : assessments){
            overallMarks += obj.getMarks();
        }    
        return overallMarks;
    }

    public double getOverallTotalMarks(){    
        double overallTotalMarks = 0;

        for(Assessment obj : assessments){
            overallTotalMarks += obj.getTotalMarks();
        }
        return overallTotalMarks;
    }

    public String getOverallGrade(){                   
        String overallGrade = "";
        double overallWeightedMarks = (getOverallMarks()/getOverallTotalMarks())*100;
        if(overallWeightedMarks >= 90){overallGrade = "A+";}
        else if(overallWeightedMarks >= 80){overallGrade = "A";}
        else if(overallWeightedMarks >= 75){overallGrade = "B+";}
        else if(overallWeightedMarks >= 70){overallGrade = "B";}
        else if(overallWeightedMarks >= 65){overallGrade = "C+";}
        else if(overallWeightedMarks >= 60){overallGrade = "C";}
        else if(overallWeightedMarks >= 55){overallGrade = "D+";}
        else if(overallWeightedMarks >= 50){overallGrade = "D";}
        else{overallGrade = "F";}
        return overallGrade;
    }

    public static double getGradePoint(String grade){
        double gradePoint = 0;
        switch (grade){
            case "A+":  gradePoint = 4;     break;
            case "A":   gradePoint = 4;     break;
            case "B+":  gradePoint = 3.5;   break;
            case "B":   gradePoint = 3;     break;
            case "C+":  gradePoint = 2.5;   break;
            case "C":   gradePoint = 2;     break;
            case "D+":  gradePoint = 1.5 ;  break;
            case "D":   gradePoint = 1;     break;
            case "F":   gradePoint = 0;     break;
            default:    gradePoint = 0;     break;
        }
        return gradePoint;
    }
    public double getWeightedGradePoint() {
        double weighterGradePoint = 0;
        String grade = getOverallGrade();
        double gradePoint = getGradePoint(grade);
        weighterGradePoint = gradePoint * getCreditUnits();
        return weighterGradePoint;
    }

    //method to add object to assessment ArrayList
    public void addAssessment(Assessment assessment) {
        this.assessments.add(assessment);

    }
    public ArrayList<Assessment> getAssessment() {
        return this.assessments;
    }

    
}
