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
public enum Assessment_enum {
    CA1(
        "CA1",
        "Online Quiz",
        20),
    CA2(
        "CA2",
        "Pysical Test",
        100),
    CA3(
        "CA3",
        "Big Big Project",
        100),
    CA4(
        "CA4",
        "Online Quiz",
        20);


    private final String name;
    private final String description;
    private final double totalMarks;

    Assessment_enum(String name, String description, double totalMarks) {
        this.name = name;
        this.description = description;
        this.totalMarks = totalMarks;
        
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getTotalMarks() {
        return totalMarks;
    }
}