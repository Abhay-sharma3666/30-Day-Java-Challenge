
// Welcome to Day 9
// " Today, I tackled a problem involving a for String with array. ”

/* Problem 1 : To get the index of all the characters of the alphabet.
 */
/* Problem 2 : To take input from user and check if the character is present in each element.
 */
/* Problem 3 : To check String is a palindrome or not and take multiple string input from user.
 */
/* Problem 4 : Take a string input from user and split the element by "," and store in string array.
 */
/* Problem 5 : Find the largest word in the string by using split function.
 */
/* Problem 6 : Find the reverse and last character in uppercase by using split function.
 */

import java.util.Scanner;
public class Day_9_String_with_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solving Problem 1
        /*// Declare and initialize a string variable.
        String str = "The quick brown fox jumps over the lazy dog.";
        // Get the index of all the characters of the alphabet
        // starting from the beginning of the String.
        int a = str.indexOf("a", 0);
        int b = str.indexOf("b", 0);
        int c = str.indexOf("c", 0);
        int d = str.indexOf("d", 0);
        int e = str.indexOf("e", 0);
        int f = str.indexOf("f", 0);
        int g = str.indexOf("g", 0);
        int h = str.indexOf("h", 0);
        int i = str.indexOf("i", 0);
        int j = str.indexOf("j", 0);
        int k = str.indexOf("k", 0);
        int l = str.indexOf("l", 0);
        int m = str.indexOf("m", 0);
        int n = str.indexOf("n", 0);
        int o = str.indexOf("o", 0);
        int p = str.indexOf("p", 0);
        int q = str.indexOf("q", 0);
        int r = str.indexOf("r", 0);
        int s = str.indexOf("s", 0);
        int t = str.indexOf("t", 0);
        int u = str.indexOf("u", 0);
        int v = str.indexOf("v", 0);
        int w = str.indexOf("w", 0);
        int x = str.indexOf("x", 0);
        int y = str.indexOf("y", 0);
        int z = str.indexOf("z", 0);

        // Display the results of all the indexOf method calls.
        System.out.println(" a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " +
                e + " " + f + " " + g + " " + h + " " +
                i + " " + j + "\n");

        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " +
                o + " " + p + " " + q + " " + r + " " +
                s + " " + t + "\n");

        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        System.out.println(u + " " + v + " " + w + " " + x + " " +
                y + " " + z);*/
        // Solving Problem 2
        /*String [] a = new String[5];
        char k = 'e',c;
        int i,j;
        for (i =0 ; i<a.length ; i++){
            System.out.println("Enter name = ");
            a[i] = sc.nextLine();
        }
        for (i=0 ; i<a.length ; i++){
            String p = a[i];
            for (j=0 ; j<p.length() ; j++) {
                c = p.charAt(j);

                if (c == k) {
                    System.out.println("word is available in string "+p);
                    break;
                }
            }
        }*/
        // Solving Problem 3
        /*String [] name = new String[5];
        int i,j,z;
        String y ="";
        String word;
        for ( i=0 ; i< name.length ; i++){
            System.out.print("Enter name = ");
            name[i] = sc.nextLine();
        }
        //code for maxlength of name
        int maxlength=0;
        String longword = null;
        for (i=0 ; i< name.length ; i++){
            word = name[i];
            if (word.length() > maxlength) {
                maxlength = word.length();
            }
        }
        System.out.println("Max length is = "+maxlength);
        System.out.print("Maxlength word is = ");
        for (i=0 ; i< name.length ; i++) {
            word = name[i];
            if(word.length()==maxlength)
            {
                System.out.print(word+"\t");
            }
        }
        System.out.println();
        System.out.print("Revers of word is = ");
        for (i=0 ; i<name.length ; i++){
            String n = name[i];
            if (n.length() == maxlength) {
                for (j = n.length() - 1; j >= 0; j--) {
                    char c = n.charAt(j);
                    y = y + c;
                }
                System.out.print(y+"\t");
                y="";
            }
        }*/
        // Solving Problem 4
        /*String s = "Ashok,Abhay,Ravi,Golu";
        String y[] = s.split(",");
        for (int i=0 ; i<y.length ; i++){
            System.out.println("Array "+ "["+i+"] = " + y[i] +" and length is : "+ y[i].length());
        }*/
        // Solving Problem 5
        /*String x, word;
        int largestword=0;
        System.out.print("Enter the word with space : ");
        x = sc.nextLine();
        String [] y = x.split(" ");
        System.out.print("Entered string is : ");
        for (int i=0 ; i<y.length ; i++){
            word = y[i];
            if (word.length() > largestword){
                largestword = word.length();
            }
            System.out.print(y[i]+"\t");
            word = "";
        }
        System.out.println();
        System.out.println("largestword length is = " + largestword);
        for ( int i=0 ; i<y.length ; i++){
            word = y[i];
            if (word.length() == largestword){
                System.out.println("largest word is = " + word);
            }
            word=""; // here free the space
        }*/
        // Solving Problem 6
        String x;
        System.out.print("Enter the word with space : ");
        x = sc.nextLine();
        String [] y = x.split(" ");
        System.out.println();
        for (int i=y.length-1 ; i>=0 ; i--){
            String n = y[i];
            for ( int j=n.length()-1 ; j>=0 ; j--){
                if ( j == 0){
                    if(n.charAt(j)>=97 && n.charAt(j)<=122){
                        System.out.print((char) (n.charAt(j)-32)+" ");
                    }
                    else {
                        System.out.print(n.charAt(j));
                    }
                }
                else {
                    System.out.print(n.charAt(j));
                }
            }
        }
    }
}
