// Welcome to Day 8
// " Today, I tackled a problem involving a for String. ”

/* Problem 1 : Write a program to find length of a string.
 */
/* Problem 2 : Write a program to copy one string to another string.
 */
/* Problem 3 : Write a program to compare two strings.
 */
/* Problem 4 : To convert lowercase string to uppercase and also convert
               uppercase string to lowercase.
 */
/* Problem 5 : To find total number of alphabets, digits or special character in a string.
 */
/* Problem 6 : To count total number of vowels and consonants in a string.
 */
/* Problem 7 : To check whether a string is palindrome or not.
 */
/* Problem 8 : To find frequency character in a string.
 */


import java.util.Scanner;
public class Day_8_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solving Problem 1
        /*System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        System.out.println("Length of the string is: " + length);*/

        // Solving Problem 2
        /*System.out.print("Enter the source string: ");
        String sourceString = scanner.nextLine();
            // Create a new string to store the copy
        String copiedString = sourceString;
        System.out.println("Copied string: " + copiedString);*/

        // Solving Problem 3
        /*System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
            // Compare the strings
        int comparisonResult = firstString.compareTo(secondString);
        if (comparisonResult == 0) {
            System.out.println("Both strings are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("The first string comes before the second string.");
        } else {
            System.out.println("The first string comes after the second string.");
        }*/

        // Solving Problem 4
        /*System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
            // Check if the string is initially in lowercase
        if (inputString.equals(inputString.toLowerCase())) {
            String convertedString = inputString.toUpperCase();
            System.out.println("Converted to uppercase: " + convertedString);
        }
            // Check if the string is initially in uppercase
        else if (inputString.equals(inputString.toUpperCase())) {
            String convertedString = inputString.toLowerCase();
            System.out.println("Converted to lowercase: " + convertedString);
        }
            // If the string contains a mix of uppercase and lowercase characters
        else {
            System.out.println("The string contains both uppercase and lowercase characters.");
        }*/

        // Solving Problem 5
        /*System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }
        System.out.println("Alphabets count: " + alphabetCount);
        System.out.println("Digits count: " + digitCount);
        System.out.println("Special characters count: " + specialCharCount);*/

        // Solving Problem 6
        /*System.out.print("Enter any string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase for easier comparison

        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : inputString.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);*/

        // Solving Problem 7
        /*System.out.println("Enter any String = ");
        String s = scanner.nextLine();
        String y = "";
        int i,j;

        for (i=s.length()-1 ; i>=0 ; i--) {
            y = y + s.charAt(i);
        }
        System.out.println(y);

        if ( s.equals(y)){
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Given string is not palindrome");
        }*/

        // Solving Problem 8
        /*String s ;
        System.out.print("Enter the string = ");
        s = scanner.nextLine();
        s = s.toUpperCase();
        int i, len;
        int p[] = new int[26];
        len = s.length();
        for (i = 0; i < len; i++)
        {
            p[s.charAt(i)-65]++;
        }
        for (i = 0; i < p.length; i++)
        {
            if (p[i] != 0)
            {
                System.out.println((char)(65+i) + " --> " + p[i]);
            }
        }*/

    }
}
