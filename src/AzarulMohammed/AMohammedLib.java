package AzarulMohammed;

public class AMohammedLib {
    public static boolean reverse(String str) {
        String output = "";
        // Creates an output to compare to String str
        int i = str.length() - 1;
        while (i >= 0) {
            output = output + str.substring(i, i + 1);
            i--;
            // Reverses the index
        }
        if (output.equals(str)) {
            return true;
            // If the output equals the string return true
        } else {
            return false;
            // If the output doesn't equal the string return false
        }
    }

    public static String dateStr (String output)
    {
        String a = output.substring(3, 5);
        // Creates a string of the date of your birthday
        String b = output.substring(0, 2);
        // Creates a string opf the month of your birthday
        String c = output.substring(6);
        // Creates a string for the year of your birthday
        return a + "-" + b + "-" + c;
        // Returns the correct format along with the dashes
    }

    public static boolean isFibonnaci(int x)
    {
        int a = 1;
        int b = 1;
        for (int i = 0; i < Integer.MAX_VALUE; i++)
            // Sets up range of numbers
        if (a > x || b > x)
        {
            return false;
            // If number is less than one it is false;
        }
        else if(x == a || x == b)
        {
            return true;
            // If number is equal to one it is true;
        }
        else {
        a = a + b;
        b = a + b;
        // Checks if it is part of Fibonnaci or not
        }
        return (x == a || x == b);
        // Returns true if x is part of Fibonnaci
    }

    public static int sumUpTo(int x)
    {
        int a = x;
        for(int i = 0; i < x; i++)
        // Sets up the addition of the previous numbers before x
        {
            a = a + i;
            // Addition of previous numbers before x
        }
        return a;
    }

    public static String cutOut(String mainStr, String subStr)
    {
        String a;
        String b;
        // Strings that will be used to store parts of mainStr
        if(mainStr.contains(subStr) && mainStr.indexOf(subStr) == 0)
        {
            mainStr = mainStr.substring(mainStr.indexOf(subStr)+subStr.length());
            //Removes the subStr from mainStr
        }
        else
        {
            a = mainStr.substring(0,mainStr.indexOf(subStr));
            b = mainStr.substring(mainStr.indexOf(subStr) + subStr.length() + 1);
            mainStr = a + b;
            // Breaks up mainStr to find the subStr and returns mainStr without the subStr
        }
        return mainStr;
        // Returns mainStr without the occurrence of subStr
    }

    }





