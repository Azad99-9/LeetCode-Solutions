class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        if (str1.length() != str2.length()) return false;
        if (str1.length() <= 2) return str1.equals(str2); 
        StringBuilder clockWise = new StringBuilder(str1.substring(2, str1.length()));
        StringBuilder antiClockWise = new StringBuilder(str1.substring(0, str1.length() - 2));
        
        
        clockWise.append(str1.substring(0, 2));
        StringBuilder tmp = new StringBuilder(str1.substring(str1.length() - 2, str1.length()));

        antiClockWise = tmp.append(antiClockWise);
        
        
        
        
        if (str2.equals(clockWise.toString())) return true;
        if (str2.equals(antiClockWise.toString())) return true;
        
        return false;
    }
    
}
