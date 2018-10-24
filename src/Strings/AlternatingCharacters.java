package Strings;

/**
 *
 * @author temisperez
 * HackerRank Challenge
 */

//You are given a string containing characters  and  only. 
//Your task is to change it into a string such that there 
//are no matching adjacent characters. To do this, you are 
//allowed to delete zero or more characters in the string. 
//Your task is to find the minimum number of required deletions.
//For example, given the string , remove an  at positions  and  
//to make  in deletions.

public class AlternatingCharacters 
{
    static int alternatingCharacters(String s)
    {
        int count = 0;
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
            {
                count++;
            }
        }
        return count;
    } 
}
