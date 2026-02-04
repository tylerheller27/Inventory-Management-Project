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


}//class
