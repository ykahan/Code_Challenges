package CodeWars;

import java.util.ArrayList;

public class ValidBraces {
    /*Write a function that takes a string of braces, and determines if the order of the braces is valid.
    It should return true if the string is valid, and false if it's invalid.
    This Kata is similar to the Valid Parentheses Kata, but introduces new characters:
    brackets [], and curly braces {}.
    Thanks to @arnedag for the idea!
    All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
    * */

    public boolean areAllBracesValid(String str){
        ArrayList<String> parans = new ArrayList<>();
        ArrayList<String> brackets = new ArrayList<>();
        ArrayList<String> curlies = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(' || str.charAt(i) == ')') parans.add(Character.toString(str.charAt(i)));
            if (str.charAt(i) == '[' || str.charAt(i) == ']') brackets.add(Character.toString(str.charAt(i)));
            if (str.charAt(i) == '{' || str.charAt(i) == '}') curlies.add(Character.toString(str.charAt(i)));
        }

        boolean paransValid = areTheseBracesValid(parans);
        boolean bracketsValid = areTheseBracesValid(brackets);
        boolean curliesValid = areTheseBracesValid(curlies);

        return(paransValid && bracketsValid && curliesValid);
    }

    public boolean areTheseBracesValid(ArrayList<String> list){
        
    }
}
