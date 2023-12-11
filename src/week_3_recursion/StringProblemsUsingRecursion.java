package week_3_recursion;

public class StringProblemsUsingRecursion {
    public static void main(String[] args) {
        //System.out.println(isPalindromeString("abcdcb"));

        //System.out.println(occurrencesOfStringInOtherString("ababbabac","ab"));
        printAllSubsetsOfString("abc");
    }

    static boolean isPalindromeString(String s){
        if(s.isEmpty()) return true;
        return isPalindromeStringHelper(s,0,s.length()-1);
    }
    static boolean isPalindromeStringHelper(String s , int l, int r){
        //base case
        if(l >= r) return true;
        if(s.charAt(l) == s.charAt(r))
            return isPalindromeStringHelper(s, l+1, r-1);
        return false;
    }

    static int occurrencesOfStringInOtherString(String s, String t){
        if(s.length() == t.length()) return 1;
        return occurrencesOfStringInOtherStringHelper(s,t,0);
    }
    static  int occurrencesOfStringInOtherStringHelper(String s, String t, int i){
        if(i > s.length() - t.length()){  // means large str ko small str mr search kr rhe ho
            return 0;
        }
        int subProblemAns = occurrencesOfStringInOtherStringHelper(s,t,i+1);
        boolean isStartingCharsMatch = s.substring(i, i+t.length()).equals(t);

        if(isStartingCharsMatch)
            return subProblemAns + 1;
        else return subProblemAns;
    }

    static void printAllSubsetsOfString(String s){
        printAllSubsetsOfStringHelper(s,0,"");
    }
    static void printAllSubsetsOfStringHelper(String s, int i, String curr){
         if(i == s.length()){
             System.out.println(curr);
             return;
         }
         printAllSubsetsOfStringHelper(s,i+1, curr+s.charAt(i));
         printAllSubsetsOfStringHelper(s,i+1, curr);
    }
}
