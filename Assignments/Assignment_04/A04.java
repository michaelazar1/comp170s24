public class A04 {
    public static void main(String[] args) {
        printOddCharacters("Springfield"); // Expect: p i g i l
        printEvenCharacters("Springfield"); // Expect: S r n f e d 
    } // method main

    /* 2nd character, 4th character, 6th character, 8th character, and 10th character in word are considered odd since we count from 0 */
    public static void printOddCharacters(String string) {
        for (int i = 1; i < string.length(); i += 2) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
    }

    /* 1st character, 3rd character, 5th character, 7th character, 9th character, and 11th character in word are considered even since we count from 0 */
    public static void printEvenCharacters(String string) {
        for (int i = 0; i < string.length(); i += 2) { 
            System.out.print(string.charAt(i) + " "); 
        }
        System.out.println();
    }
}
