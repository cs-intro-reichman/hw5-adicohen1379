import java.util.Random;

/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        //System.out.println(countChar(hello, 'h'));
        //System.out.println(countChar(hello, 'l'));
        //System.out.println(countChar(hello, 'z'));
        //System.out.println(spacedString(hello));
        //System.out.println(insertRandomly('z',"hello"));
        //System.out.println(subsetOf("hello", "hel"));
        System.out.println(remove("committee","meet"));
        //System.out.println(randomStringOfLetters(100));
        //// Put your other tests here.
    }

    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c') returns 0. 
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char ch) {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }

        }
        return count;
    }

    /** Returns true if str1 is a subset string str2, false otherwise
     *  Examples:
     *  subsetOf("sap","space") returns true
     *  subsetOf("spa","space") returns true
     *  subsetOf("pass","space") returns false
     *  subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
        int count=0;
         for(int i=0;i<str1.length();i++)
         {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    count++;
                    break;
                }
            }
            if(count==str2.length())
            {
                return true;
            }
         }
        return false;
    }

    /** Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character. 
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
        String newstring="";
        for(int i=0;i<str.length()-1;i++)
        {
            newstring+=str.charAt(i)+" ";
        }
        newstring+=str.charAt(str.length()-1);
        return newstring;
    }
  
    /**
     * Returns a string of n lowercase letters, selected randomly from 
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        String newstring="";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index=0;
        for(int i=0;i<n;i++)
        {
            index=(int)(Math.random() *26);
            newstring+=alphabet.charAt(index);
        }
        return newstring;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit" 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */
    public static String remove(String str1, String str2) {
        String newstr="";
        char []  array1=new char [str1.length()];
        char []  array2=new char [str2.length()];
       for(int i=0;i<str1.length();i++)
       {
           array1[i]=str1.charAt(i);
       }
       for(int i=0;i<str2.length();i++)
       {
           array2[i]=str2.charAt(i);
       }
       for(int i=0;i<array2.length;i++)
       {
            for(int j=0;j<array1.length;j++)
            {
               // System.out.println(array1[j]+" "+array2[i]);
                if(array1[j]==array2[i])
                {
                    array1[j]=' ';
                    array2[i]=' ';
                }
            }
       }
       for(int i=0;i<array1.length;i++)
       {
        //System.out.println(array1[i]);
        if(array1[i]!=' ')
        {
            newstr+=array1[i];
        }
       }
        return newstr;
    }

    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
         // Generate a random index between 0 and str.length()
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         // Insert the character at the random index
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}
