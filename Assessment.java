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
public class Assessment {
    private String name; // CA1 CA2 CA3 CA4
    private String description;
    private Module module;
    private double marks; 
    private double totalMarks;
    private double weightage;
   
    public Assessment(String name,String description,double marks,double totalMarks){
        this.name = name;
        this.description = description;
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.weightage = 0;
       
    }

    //setter
    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setModule(Module module) {this.module = module;}
    public void setMarks(double marks) {this.marks = marks;}
    public void setTotalMarks(int totalMarks) {this.totalMarks = totalMarks;}
    public void setWeightage(double weightage){this.weightage = weightage;}

    //getter
    public String getName(){return name;}
    public String getDescription(){return description;}
    public Module getModule(){return module;}
    public double getMarks(){return marks;}
    public double getTotalMarks(){return totalMarks;}
    public double getWeightage(){return weightage;}

    //main methods
    public double getWeightedMarks(){
        double weightedMarks = (marks / totalMarks) * weightage;
        return weightedMarks;
    }

    
}