import java.util.*;
public class StringQuestion {
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        
        if (isPalindrome(s)) {  
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
       int  length=s.length();
       int arr[] = new int[length];
       for(int i=0 ; i<length/2; i++){
        if (s.charAt(i) != s.charAt(length - i - 1)){
            return false;

        }
        return true;
        
       }
       return true;
}

//count the number of vowels in a string\
// public static void main(String[] args) {
//             Scanner sc= new Scanner(System.in);
//             System.out.println("enter a string");
//             String str=sc.nextLine();
//             int output=CountVowel(str);  
//         }
//         public static  int CountVowel(String str){
//             int count=0;
//             for(int i=0;i<str.length();i++){
//                 if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u'){
//                     count++;
//                 }
//             }
//     System.out.println("the total number of vowel in string are"+count);
//     return count;
//         }
}