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
public enum Module_enum {
    BSP(
        "Business Statistics in Python",
        "ITSD001",
        "Python and business stat",
        4
        ),
    PS(
        "Problem Solving",
        "ITSD002",
        "Python Programming",
        4),
    PF(
        "Programming Fundamental",
        "ITSD003",
        "Java Programming",
        4),
    CN(
        "Communication and Network",
        "ITSD004",
        "All about how to communicate acrross network",
        4);

    private final String name;
    private final String moduleCode;
    private final String description;
    private final int creditUnits;

    
    Module_enum(String name, String moduleCode, String description, int creditUnits ) {
        this.name = name;
        this.moduleCode = moduleCode;
        this.description = description;
        this.creditUnits = creditUnits;

    }

    ///the following method is used to get info of a module to add into a student mudule record
    public String getName() {  
        return name;
    }
    public String getModuleCode() {
        return moduleCode;
    }
    public String getDescription() {
        return description;
    }
    public int getCreditUnits() {
        return creditUnits;
    }

    public String getInfo (){
        String info = name +":"+ moduleCode;
        return info;
    }
}