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
public class Exception{
    private int option;
    private int intValue;
    private double doubleValue;
    public void setOption4(String optionStr){ //for 4 option
        this.option = Integer.parseInt(optionStr);
        
        if(option<0 | option > 3){
            throw new IllegalArgumentException("option must be between 0 and 3");
        }
    }


    /*--------------------------------------------------------------------------------*/
    public void setOption5(String optionStr){  //for 5 option
        this.option = Integer.parseInt(optionStr);
        if(option<0 | option > 4){
            throw new IllegalArgumentException("option must be between 0 and 3");
        }
    }
    /*--------------------------------------------------------------------------------*/ 
    public void setOption3(String optionStr){  //for 3 option
        this.option = Integer.parseInt(optionStr);
        if(option<0 | option > 2){
            throw new IllegalArgumentException("option must be between 0 and 2");
        }
    }
    
    /*--------------------------------------------------------------------------------*/
    public void intInput(String optionStr){  //for 2 option
        this.intValue = Integer.parseInt(optionStr);
    }
    /*--------------------------------------------------------------------------------*/ 
    public void doubleInput(String optionStr){
        this.doubleValue = Double.parseDouble(optionStr);

    }
    public int getOption(){return this.option;}
    public int getInt(){return this.intValue;}
    public double getDouble(){return this.doubleValue;}
}
