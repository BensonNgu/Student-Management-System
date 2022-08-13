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
public class Student {
    private String name;
    private String studentID;
    private ArrayList<Module> modules = new ArrayList<Module>(); //this array will store a bunch of module names

    //methods

    //constructor
    public Student(){
        this.modules = new ArrayList<Module>();
    }

    public Student(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
        this.modules = new ArrayList<Module>();
    }
//setter
    public void setName(String name){this.name = name;}
    public void setID(String studentID){this.studentID = studentID;}

//getter
    public String getName(){return this.name;}
    public String getID(){return this.studentID;}
    public int getTotalCreditUnits(){
        int totalCreditUnits = 0;
        for(Module obj : modules){
            totalCreditUnits += obj.getCreditUnits();
        }
        return totalCreditUnits;
    }
    public double getGPA(){
        double totalWeightedGradePoint = 0;
        for(Module obj : modules){
            totalWeightedGradePoint += obj.getWeightedGradePoint();
        }
        return totalWeightedGradePoint/getTotalCreditUnits();
    }

    //method to add object to module ArrayList

    public void addModule(Module module){ //this method will directly adding module to the selected student object's module arraylist as a module object in the ArrayList
        this.modules.add(module);
    }
    public ArrayList<Module> getModule(){    //this method will get all the modules taken by the particular student and used to copy to a new temporary module Arraylist for futher editing
        return this.modules;
    }

    
//output of the program
    public String toString(){
        String moduleName="";
         for(Module module : this.modules){
            moduleName += module.getName() + "\t";
            }
        String  result = this.name  + "\t" + this.studentID + "\t" + moduleName;
        return result;
    }

}