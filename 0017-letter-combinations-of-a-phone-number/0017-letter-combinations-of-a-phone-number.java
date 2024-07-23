//make aa private static final array so that we can use it evevrywhere and as fixed/final
class Solution {
    private static final String[] KEYS={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        return letterCombinations1("",digits);
    }
    public List<String> letterCombinations1(String p,String up) {
        if(up.isEmpty()){
            List<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }
        //take the first digit
        int digit=up.charAt(0)-'0';//this converts it into a number
        List<String> ans=new ArrayList<>();
        String letter=KEYS[digit];
        for(char ch:letter.toCharArray()){
           
            ans.addAll(letterCombinations1(p+ch,up.substring(1)));
        }
        return ans;
    }
}
/*Example: digits = "23"
We will generate all possible letter combinations for the digits "2" and "3".

Initial Call:
Input: digits = "23"
Method Call: letterCombinations("23")
Initial Check: digits is not empty, so proceed to the recursive function.
Recursive Call: letterCombinationsRecursive("", "23")
First Level of Recursion:
Input: combination = "", nextDigits = "23"
Digit: 2 (maps to "abc")
Letters: "abc"
We loop through each letter in "abc":

First Letter ('a'):
New Combination: "a"
Remaining Digits: "3"
Recursive Call: letterCombinationsRecursive("a", "3")
Second Level of Recursion:
Input: combination = "a", nextDigits = "3"
Digit: 3 (maps to "def")
Letters: "def"
We loop through each letter in "def":

First Letter ('d'):
New Combination: "ad"
Remaining Digits: "" (empty)
Recursive Call: letterCombinationsRecursive("ad", "")
Base Case Reached:
Input: combination = "ad", nextDigits = ""
Base Case: nextDigits is empty, so add "ad" to the result list.
Return to the second level and continue with the next letters in "def":

Second Letter ('e'):
New Combination: "ae"
Remaining Digits: "" (empty)
Recursive Call: letterCombinationsRecursive("ae", "")
Base Case Reached:
Input: combination = "ae", nextDigits = ""
Base Case: nextDigits is empty, so add "ae" to the result list.
Third Letter ('f'):
New Combination: "af"
Remaining Digits: "" (empty)
Recursive Call: letterCombinationsRecursive("af", "")
Base Case Reached:
Input: combination = "af", nextDigits = ""
Base Case: nextDigits is empty, so add "af" to the result list.
Return to the first level and continue with the next letters in "abc":

Second Letter ('b'):
New Combination: "b"
Remaining Digits: "3"
Recursive Call: letterCombinationsRecursive("b", "3")
Repeat the process for "b" and the letters "def":

First Letter ('d'):

New Combination: "bd"
Remaining Digits: ""
Recursive Call: letterCombinationsRecursive("bd", "")
Base Case: Add "bd" to the result list.
Second Letter ('e'): */