public class Validation {

    public static boolean IsOnlyLetters(String input)
    {
        if(input.matches("[a-zA-Z]+"))
        {
            return true;
        }
        else{
            return false;
        }
    }//onlyLetters

    public static boolean isNumber(String number)
    {
        try{
            Integer.parseInt(number);
        }//try


        catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }//catch
        return true;

    }//isNumber

    public static boolean isValidGender(char gender)
    {
        if(gender == 'M' || gender == 'F')
        {
            return true;
        }
        else {
            return false;
        }
    }//isValidGender

    public static boolean isExit(String userInput)
    {
        if(userInput.equalsIgnoreCase("exit"))
        {
            return true;
        }
        else {
            return false;
        }
    }


}//class
