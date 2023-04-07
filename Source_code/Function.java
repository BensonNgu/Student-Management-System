import java.util.Scanner;

public class Function{
    private static String value;
    private static int intValue;
    private static double doubleValue;
    private static Scanner input = new Scanner(System.in);



    //Use to test the input format
    public static boolean isInteger(String value){
        boolean isInteger = false;
        try{
            Integer.valueOf(value);
            isInteger = true;
        }catch(Exception e){
            System.out.println("Wrong input format");
        }
        return isInteger;
    }
    /*---------------------------------------------- */
    public static boolean isDouble(String value){
        boolean isDouble = false;
        try{
            Double.parseDouble(value);
            isDouble = true;
        }catch(Exception e){
            System.out.println("Wrong input format");
        }
        return isDouble;
    }

/*=============================================================================================================================== */
    //use to get the input and return value
    public static int getInteger(){
        while(true){
            value = input.next(); 
            boolean isInteger = isInteger(value);
            if(isInteger == false){
                System.out.println("Please enter a number");
            }else{
                intValue = Integer.parseInt(value);
                return intValue;
            }
        }
    }

    /*--------------------------------------------------------------------- */
    public static double getDouble(){
        while(true){
            value = input.next();
            boolean isDouble = isDouble(value);
            if(isDouble == false){
                System.out.println("Please enter a valid double value");
            }else{
                doubleValue = Double.parseDouble(value);
                return doubleValue;
            }
        }
    }
}
