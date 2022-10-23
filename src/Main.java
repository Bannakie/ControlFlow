import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class AsciiChars
{
    public static void printNumbers(){
        // prints valid numeric numbers
        System.out.print("\nThe valid numbers are : ");
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
    }
    public static void printLowerCase(){
        // prints valid lowercase alphabets
        System.out.print("\nThe valid lowercase alphabets are : ");
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch + " ");
        }
    }
    public static void printUpperCase(){
        // prints valid lowercase alphabets
        System.out.print("\nThe valid uppercase alphabets are : ");
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch + " ");
        }
    }
}
