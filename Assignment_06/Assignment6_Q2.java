//Accept a single digit number from user and print it into word


import java.util.Scanner;

class Assignment6_Q2 {

    public static void Number(int iNo) {
        // Array of words for numbers 0-9
        String words[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        // Validate input
        if (iNo >= 0 && iNo <= 9) {
            System.out.println("Number in words: " + words[iNo]);
        } else {
            System.out.println("Invalid input! Please enter a single-digit number (0-9).");
        }
    }

    public static void main(String[] args) {
        int iValue;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a single-digit number: ");
        iValue = sobj.nextInt();

        Number(iValue); // Call the function

        sobj.close(); // Close Scanner
    }
}
