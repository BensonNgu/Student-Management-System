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
import java.util.*;
public class GradeTracker{
    //Array List
    private static ArrayList<Student> students = new ArrayList<Student>();
    public static void main(String[] args){
        int exitKeyword = 0;
        Scanner input = new Scanner (System.in);
        System.out.printf("%30S%n%37s%n%34s%n%33s%n%37s%n","sim homepage","What service do you want?","1.  Student management","2.  Module management","3.  Assessment management");//header
        int option = option4();
        while (option!=exitKeyword){
            switch(option){
                case 1:
                stuManagement();                                                //student management 
                break;
                case 2:
                moduleManagement();                                             //module management
                break;
                case 3:
                assessmentManagement();                                         //assessment management
                break;
            }
            
            //To prompt the home page to user
            System.out.printf("%n%n%n%30S%n%37s%n%34s%n%33s%n%37s%n%-12s","sim homepage","What service do you want?","1.  Student management","2.  Module management","3.  Assessment management","Your option");//header
            option = option4();

            }
        } 
/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void stuManagement(){
        Scanner input = new Scanner (System.in);
        //ask user to select one management
        System.out.printf("%n%n%n%36S%n%28s%n%31s%n%30s%n%29s%n%n","student management page","1.  Add student","2.  Remove student","3.  Calculate GPA","4.  Student List");//header
        int option = option5();
        switch(option){
            case 1:                                                    //Adding student
            System.out.println("Add student");
            System.out.print("How many student will be added: ");
            int numOfStu = intOnly();
            for(int counter = 1;counter <= numOfStu;counter++){
                System.out.print("Enter name: ");
                String name = input.next();
                System.out.print("Enter studentID: ");
                String studentID = input.next();
                Student stu = new Student(name,studentID);             //create new student object for the student
                students.add(stu);
            }
            break;
            /*------------------------------------------------------------------------------------------------------------------------------------- */
            case 2:                                                    //remove student
            System.out.println("Remove Student");
            int indexStu = stuList();
            students.remove(indexStu);
            break;
            /*------------------------------------------------------------------------------------------------------------------------------------- */
            case 3:
            System.out.println("GPA Calculation page");
            indexStu = stuList();
            double gpa = students.get(indexStu).getGPA();                                          //calculate GPA for the student objecta
            System.out.println("gpa: " + gpa);    
            break;
            /*------------------------------------------------------------------------------------------------------------------------------------- */
            case 4: //test to print the arrayList
            System.out.println("Current ArrayList");
            indexStu = stuList();
            ArrayList<Module> moduleCopy = students.get(indexStu).getModule();
            /*String stuInfo = students.get(indexStu).getName();*/
            System.out.println("Name: " + students.get(indexStu).getName());
            System.out.println("Student ID: " +students.get(indexStu).getID());
            System.out.println("Module: ");
            for(Module obj : moduleCopy){
                System.out.printf("%-28s-9%s%s%n",obj.getName(),obj.getModuleCode(),obj.getDescription()); //Wrong code for display student info (should be %-9s)
            }
        }
    }
/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void moduleManagement(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%n%n%36S%n","Modules Management Page");
        System.out.printf("%38s%n%43s%n%37s%n%37s%n","1. Add module to a student","2. Delete module from a student","3. Marks for the students","4. Grade for the students");
        int option = option5();
        switch(option){
            case 1:                                                                                                     //add module to a student
            System.out.println("Add module to a student");
            int indexStu = stuList();
            System.out.println("Add module for "+students.get(indexStu).getName());
            System.out.println("How many module did he/she takes?");                                                 //control the number of loops to assign module to the student
            int count = intOnly();
            String moduleName = Module_enum.BSP.getInfo() +"(BSP)\n"+ Module_enum.PS.getInfo() +"(PS)\n"+ Module_enum.PF.getInfo() +"(PF)\n"+ Module_enum.CN.getInfo()+"(CN)\n";
            System.out.print(moduleName);                                                                              //display existing module info
            for(int i = 0; i < count; i++){
                System.out.println("What module did he take");
                String keyword = input.next();                                                                         //request keyword of the module
                keyword = keyword.toUpperCase();
                System.out.println(keyword);
                switch(keyword){
                    case("BSP"):
                    String module_Name = Module_enum.BSP.getName();
                    String moduleCode = Module_enum.BSP.getModuleCode();
                    String description = Module_enum.BSP.getDescription();
                    int creditUnits = Module_enum.BSP.getCreditUnits();
                    Module modules = new Module(module_Name,moduleCode,description,creditUnits);
                    students.get(indexStu).addModule(modules);
                    break;
                    /*--------------------------------------------------------------------------------------------- */
                    case("PS"):
                    module_Name = Module_enum.PS.getName();
                    moduleCode = Module_enum.PS.getModuleCode();
                    description = Module_enum.PS.getDescription();
                    creditUnits = Module_enum.PS.getCreditUnits();
                    modules = new Module(module_Name,moduleCode,description,creditUnits);
                    students.get(indexStu).addModule(modules);
                    break;
                    /*--------------------------------------------------------------------------------------------- */
                    case("PF"):
                    module_Name = Module_enum.PF.getName();
                    moduleCode = Module_enum.PF.getModuleCode();
                    description = Module_enum.PF.getDescription(); 
                    creditUnits = Module_enum.PF.getCreditUnits();
                    modules = new Module(module_Name,moduleCode,description,creditUnits);
                    students.get(indexStu).addModule(modules);
                    break;
                    /*--------------------------------------------------------------------------------------------- */
                    case("CN"):
                    module_Name = Module_enum.CN.getName();
                    moduleCode = Module_enum.CN.getModuleCode();
                    description = Module_enum.CN.getDescription();
                    creditUnits = Module_enum.CN.getCreditUnits();
                    modules = new Module(module_Name,moduleCode,description,creditUnits);
                    students.get(indexStu).addModule(modules);
                    break;
                    /*--------------------------------------------------------------------------------------------- */
                    default:
                    module_Name = keyword;
                    System.out.println("Module Code: ");
                    moduleCode = input.next();
                    System.out.println("Module description: ");
                    description = input.next();
                    System.out.println("Module total credit units");
                    creditUnits = intOnly();
                    modules = new Module(module_Name,moduleCode,description,creditUnits);
                    students.get(indexStu).addModule(modules);
                    break;
                }
            }
            break;
            /*------------------------------------------------------------------------------------------------------------------------------------- */
            case 2:                                                                                                         //delete module from a student
            System.out.println("Delete module from a student");
            indexStu = stuList();
            ArrayList<Module> moduleCopy = students.get(indexStu).getModule();                                             //make reference to the particular module list of the particular student object
            int indexModule = moduleList(moduleCopy);                                            
            moduleCopy.remove(indexModule);                                                                                    //delete the module object of the student object
            break;
            /*------------------------------------------------------------------------------------------------------------------------------------- */
            case 3:                                                                                                         //calculate the total marks score by a student for a module
            System.out.println("Calculate total marks score by a student for a module");                                 
            indexStu = stuList();
            moduleCopy = students.get(indexStu).getModule();                                             //make reference to the particular module list of the particular student object
            indexModule = moduleList(moduleCopy);                                                   
            ArrayList<Assessment> assessmentList = moduleCopy.get(indexModule).getAssessment();                                //make reference to the particular assessment list of the particular module object
            double stuOverallWeightedMarks = 0;
            for(Assessment obj : assessmentList){                                                                          //get the overall weighted marks accross all assessment objects
                stuOverallWeightedMarks += obj.getWeightedMarks();
            }
            System.out.println("Stu Overall Weighted Marks: " + stuOverallWeightedMarks);           
            break;
            /*--------------------------------------------------------------------------------------------------------------------------------------- */
            case 4: 
            System.out.println("Calculate grade of a student in a module");
            indexStu = stuList();
            moduleCopy = students.get(indexStu).getModule();                                             //make reference to the particular module list of the particular student object
            indexModule = moduleList(moduleCopy);                                                                               
            double overallMarks =moduleCopy.get(indexModule).getWeightedGradePoint();
            System.out.println(overallMarks);
            default:
            break;
        }
    }
/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */    
    public static void assessmentManagement(){
        /*a. Add  any  number  of  Assessments  to  a  Module  that  is  assigned  to  a Student. 
        b. Remove any Assessment in a Module assigned to a student */
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%n%n%36S%n","Assessment Management Page");
        System.out.printf("%40s%n%45s%n%n","1. Add assessment to a student","2. Delete assessment from a student");
        int option = option3();
        switch (option){
            case 1:
            System.out.println("Add assessment to a student");
            int indexStu = stuList();
            ArrayList<Module> moduleCopy = students.get(indexStu).getModule();                                             //make reference to the particular module list of the particular student object
            int indexModule = moduleList(moduleCopy);
            System.out.println("How many Assessment did he/she takes?");                                             //request number of assessment taken by the student object
            int count = intOnly();                                                                                       /*exception int only */
            for(int i = 0; i < count; i++){
                System.out.println("What assessment did he take");
                String keyword = input.next();
                keyword = keyword.toUpperCase();                                                                          //enter keyword or new assessment name
                switch(keyword){
                    case("CA1"):
                    String assessment_Name = Assessment_enum.CA1.getName();
                    String description = Assessment_enum.CA1.getDescription();
                    double totalmarks = Assessment_enum.CA1.getTotalMarks();
                    System.out.println("Enter Marks of the student:");
                    double marks = marks();
                    Assessment assessment = new Assessment(assessment_Name,description,marks,totalmarks);
                    moduleCopy.get(indexModule).addAssessment(assessment);
                    break;
                    case("CA2"):
                    assessment_Name = Assessment_enum.CA2.getName();
                    description = Assessment_enum.CA2.getDescription();
                    totalmarks = Assessment_enum.CA2.getTotalMarks();
                    System.out.println("Enter Marks of the student:");
                    marks = marks();
                    assessment = new Assessment(assessment_Name,description,marks,totalmarks);
                    moduleCopy.get(indexModule).addAssessment(assessment);
                    break;
                    case("CA3"):
                    assessment_Name = Assessment_enum.CA3.getName();
                    description = Assessment_enum.CA3.getDescription();
                    totalmarks = Assessment_enum.CA3.getTotalMarks();
                    System.out.println("Enter Marks of the student:");
                    marks = marks();
                    assessment = new Assessment(assessment_Name,description,marks,totalmarks);
                    moduleCopy.get(indexModule).addAssessment(assessment);
                    break;
                    case("CA4"):
                    assessment_Name = Assessment_enum.CA4.getName();
                    description = Assessment_enum.CA4.getDescription();
                    totalmarks = Assessment_enum.CA4.getTotalMarks();
                    System.out.println("Enter Marks of the student:");
                    marks = marks();
                    assessment = new Assessment(assessment_Name,description,marks,totalmarks);
                    moduleCopy.get(indexModule).addAssessment(assessment);
                    break;
                    default:
                    assessment_Name = keyword;
                    System.out.print("Enter Description: ");
                    description = input.next();
                    System.out.print("Enter total marks: ");
                    totalmarks = marks();
                    System.out.println("Enter Marks of the student:");
                    marks = marks();
                    assessment = new Assessment(assessment_Name,description,marks,totalmarks);
                    moduleCopy.get(indexModule).addAssessment(assessment);
                    break;
                }
            }
            ArrayList<Assessment> assessmentList = moduleCopy.get(indexModule).getAssessment();;
            for(int i = 0; i <assessmentList.size(); i++) {
                double weightage = (assessmentList.get(i).getTotalMarks()/moduleCopy.get(indexModule).getOverallTotalMarks())*100;
                assessmentList.get(i).setWeightage(weightage);
            }
            break;
            /*------------------------------------------------------------------------------------------------------------------------------------- */
            case 2:
            System.out.println("Delete assessment from a student");
            indexStu = stuList();
            moduleCopy = students.get(indexStu).getModule();                                             //make reference to the particular module list of the particular student object
            indexModule = moduleList(moduleCopy);                                                                                        /* exception int & out of bound*/                                                                    
            ArrayList<Assessment> assessmentCopy = moduleCopy.get(indexModule).getAssessment();                            //make reference to the particular assessment list of the particular module object   
            int indexAssessment = assessmentList(assessmentCopy);                                                                                      /* exception int & out of bound*/                            
            assessmentCopy.remove(indexAssessment);                                                                            //delete the module object of the student object
            break;
            default:
            break;
        }        
    }

    /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
    public static int option3(){
        Scanner input = new Scanner(System.in);
        Exception optionTest = new Exception();                                 //to avoid wrong input format and range
        boolean decider = false;
        while(decider == false){
            System.out.println("Which service do you want?");
            String optionInput =input.next();
            try{
                optionTest.setOption3(optionInput);
                decider = true;
            }
            catch(IllegalArgumentException e){
                System.out.printf("Exeption: %s%n%n",e.getMessage());
            decider = false;
            }
        }
        int option = optionTest.getOption();
        return option;
    }
    
    public static int option4(){
        Scanner input = new Scanner (System.in);
        Exception optionTest = new Exception();                                 //to avoid wrong input format and range
        boolean decider = false;
        while(decider == false){
            System.out.println("Which service do you want?");
            String optionInput =input.next();
            try{
                optionTest.setOption4(optionInput);
                decider = true;
            }
            catch(IllegalArgumentException e){
            System.out.printf("Exeption: %s%n%n",e.getMessage());
            decider = false;
        }
        }
        int option = optionTest.getOption();
        return option;
    }

    public static int option5(){
        Scanner input = new Scanner (System.in);
        Exception optionTest = new Exception();
        boolean decider = false;
        while(decider == false){
            System.out.println("Which service do you want?");
            String optionInput =input.next();
            try{
                optionTest.setOption5(optionInput);
                decider = true;
            }
            catch(IllegalArgumentException e){
                System.out.printf("Exeption: %s%n%n",e.getMessage());
                decider = false;
            }
        }
        int option = optionTest.getOption();
        return option;
    }

    public static int intOnly(){
        Scanner input = new Scanner (System.in);
        Exception intInput = new Exception();                                 //to avoid wrong input format and range
        boolean decider = false;
        while(decider == false){
            String optionInput =input.next();
            try{
                intInput.intInput(optionInput);//exception error
                decider = true;
            }
            catch(IllegalArgumentException e){
            System.out.printf("Exeption: %s%n%nPlease enter Integer value only!!",e.getMessage());
            decider = false;
            }
        }
        int num = intInput.getInt();
        return num;                              
    }

    public static int stuList(){
        for(Student stuList : students){
            System.out.printf( "%d. %s%n",students.indexOf(stuList) , stuList);//display student list
        }
        Scanner input = new Scanner(System.in);
        Exception intInput = new Exception();
        boolean decider = false;
        while(decider == false){
            boolean decider2 = false;
            while(decider2 == false){
            System.out.print("Enter index of the student ");//request index of student
            String indexStuStr = input.next();
            try{
                intInput.intInput(indexStuStr);
                decider2 = true;
            }catch(IllegalArgumentException e){
                System.out.println("Error in Input:" + e.getMessage());
                decider2 = false;
            }
            }
            int indexStu = intInput.getInt();
            try{
            students.get(indexStu);
            decider = true;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Index is out of bounds.");
            }
        }
        int index = intInput.getInt();
        return index;
    }

    public static int moduleList(ArrayList<Module> moduleCopy){
        for(Module moduleObj : moduleCopy){                                                                            //display the module taken by the student object
            System.out.printf("%d. %s%n",moduleCopy.indexOf(moduleObj),moduleObj.getName());
        }
        Scanner input = new Scanner (System.in);
        Exception intInput = new Exception();
        boolean decider = false;
        while(decider == false){
            boolean decider2 = false;
            while(decider2 == false){
                System.out.print("Enter index of module: ");                                                   //request index of module to be deleted
                String indexModStr = input.next();
                try{
                    intInput.intInput(indexModStr);
                    decider2 = true;
                }catch(IllegalArgumentException e){
                System.out.println("Error in Input:" + e.getMessage());
                decider2 = false;
            }
            }
            int index = intInput.getInt();
            try{
                moduleCopy.get(index);
                decider = true;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Index is out of bounds.");
                decider = false;
            }
        }
        int index = intInput.getInt();
        return index;
    }

    public static int assessmentList(ArrayList<Assessment> assessmentCopy){
        for(Assessment assessmentobj : assessmentCopy){                                                            //display the assessment taken by the student object
            System.out.printf("%d %s%n",assessmentCopy.indexOf(assessmentobj),assessmentobj.getName());
        }
        Exception intInput = new Exception();
        boolean decider = false;
        while(decider == false){
            Scanner input = new Scanner (System.in);
            boolean decider2 = false;
            while(decider2 == false){
                System.out.print("Enter index of assessment:");                                                           //request index of assessment to be deleted
                String indexAssStr = input.next();
                try{
                    intInput.intInput(indexAssStr);
                    decider2 = true;
                }catch(IllegalArgumentException e){
                System.out.println("Error in Input:" + e.getMessage());
                decider2 = false;
                }
            }
            int index = intInput.getInt();
            try{
                assessmentCopy.get(index);
                decider = true;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Index is out of bounds.");
                decider = false;
            }
        }
        int index = intInput.getInt();
        return index;
    }

    public static double marks(){
        Scanner input = new Scanner(System.in);
        Exception doubleInput = new Exception();                                
        boolean decider = false;
        while(decider == false){
            String markStr =input.next();
            try{
                doubleInput.doubleInput(markStr);
                decider = true;
            }
            catch(IllegalArgumentException e){
            System.out.printf("Exeption: %s%n%n",e.getMessage());
            System.out.println("Please enter double only!!");
            decider = false;
            }
        }
        double marks = doubleInput.getDouble();
        return marks;
    }
}