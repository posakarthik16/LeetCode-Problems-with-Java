public class LC3110{
    public static void main(String[] args){

//        --> Problem 3110- Score Of a String
// You are given a string s. 
// The score of a string is defined as 
// the sum of the absolute difference between 
// the ASCII values of adjacent characters.

// Return the score of s.

// Example 1:

// Input: s = "hello"

// Output: 13

// Explanation:

// The ASCII values of the characters in s are: 'h' = 104, 'e' = 101,
//  'l' = 108, 'o' = 111. 
//  So, the score of s would be 
//  |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

// SOLUTION :


    String s = "hello";
    int answer = 0;
    for(int i=0;i<s.length()-1;i++){
        char current = s.charAt(i);
        char next = s.charAt(i+1);
       int temp = Math.abs(current-next);
       answer += temp;

    }
     System.out.println("Answer : "+answer);

  //SimpleWay
  int answer2 = 0;
     for(int i=0;i<s.length()-1;i++){
         int current = s.charAt(i);
         int next = s.charAt(i+1);
        answer2 += Math.abs(current-next);
     }
     System.out.println("Simple Way Answer is : "+ answer2);
    }
}