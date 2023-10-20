/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
   import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Testss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        String[] words;
        boolean duplicate;

        // Get the number of words to store
        System.out.print("Enter the number of words to store: ");
        n = input.nextInt();
        input.nextLine(); // Consume the newline character

        // Create an array to store the words
        words = new String[n];

        // Get the words from the user and store them in the array
        for (int i = 0; i < n; i++) {
            do {
                duplicate = false;
                System.out.print("Enter word " + (i + 1) + ": ");
                words[i] = input.nextLine();

                // Check if the word has been entered before
                for (int j = 0; j < i; j++) {
                    if (words[j].equalsIgnoreCase(words[i])) {
                        System.out.println("Word has already been entered. Please enter a different word.");
                        duplicate = true;
                        break;
                    }
                }
            } while (duplicate);
        }

        // Display the words
        System.out.println("Words entered:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + words[i]);
        }
    }
}


