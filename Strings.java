package JAVA;
import java.util.*;
public class Strings {
    public static void main(String[]args){
        //String name = new String("data");
        //String name = "data";

//        String name= "Aman";
//        String fullName ="Aman";
//        String sentence = "My name is Syed Aman Hasan";

//        System.out.println(name + "   " + fullName + "   " + sentence);
//
//        //user input
//        Scanner sc = new Scanner(System.in);
//        String hlo = sc.nextLine();
//        System.out.println(hlo);

//        String str = "123";
//        int number = Integer.parseInt(str);    //converts the string of numeric data into int/
//        System.out.println(number);

//





       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
       int size = sc.nextInt();
       String arr[] = new String[size];
        System.out.println("Enter the elements of array:");
        int totalLength=0;

       for(int i=0; i<size; i++){                                       //BHASAD
           arr[i] = sc.nextLine();
           totalLength+= arr[i].length();
       }
        System.out.println(arr.length);
        System.out.println(totalLength);
    }


    public static class stringBuilder{
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Aman");
            sb.setCharAt(0, 'T');
            System.out.println(sb);                                  //BHASAD
            System.out.println(sb.insert(0,'a'));
            System.out.println(sb.delete(1,2));
            System.out.println(sb.append("hasan"));

            String str = "Aman";
            String str1= "";

            for(int i=str.length()-1; i>=0; i--){
                str1+= str.charAt(i);
            }
            System.out.println(str1);


        }
    }
}

//----------------------------------------------------------------------------------------------------------------------


//String methods      take name as a string
/*
name.length() --> returns the length of the string.
name.concat(string2) --> add both the string.
name.toLowerCase()--> returns the string with all lowercase leters.
name.toUpperCase()--> returns the string with all uppercase letters.
name.trim()--> removes all the starting and ending spaces.
name.substring(index)--> returns the string from given to ending index.
name.substring(start index , end index)--> returns the string from given start to the given end index(end is excluded).
name.replace('char' , 'char')--> returns the new string after replacing the first char(or string) with second.
name.startsWith("givenstring")--> returns true if the string starts with given string or substring.
name.endsWith(givenstring)--> returns true if the string ends with the given string.
name.chatAt(index) --> returns the character that is present at the given index.
name.indexOf("string") --> returns the index of the given char(returns the first occurance of given char)
name.indexOf("string",index) --> returns the index of first occurance of the given string after the given index.
name.lastIndexOf("sting") --> returns the last index of the given string.
name.lastIndexOf("string", index) --> returns the last index of the given string before or under the given index.
name.equals("string") --> returns true if the given string is equal to the initialisez string.
name.equalsIgnoreCase() --> returns true if given string is equal or not while ignoring the uper and lower cases.
name1.compareTo(name2) --> returns +ve value if name1>name2, -ve if n1<n2, 0 if n1==n2. (it compares on the basis of
character's number priority in english 26 alphabets).
 */


/*
sb as a string
sb.setCharAt(index,'char') --> returns the string after set the given char at the given index(replacing is done).
sb.insert(index, 'char') --> returns the string after inserting the given char at given index(Shifting is done).
sb.delete(start index, end index)--> delete the char or substring from the starting index to ending index(end index is excluded).
sb.append("string")--> to ad some char pr string at the end of the string.
 */










