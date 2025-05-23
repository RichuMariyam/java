import java.util.Scanner;

public class SortStrings1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = s.nextInt();
        s.nextLine(); // Consume the newline

        String[] str = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            str[i] = s.nextLine();
        }

        // Manual bubble sort implementation
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Compare strings using compareTo
                if (str[i].compareTo(str[j]) > 0) {
                    // Swap str[i] and str[j]
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("The sorted strings are:");
        for (String word : str) {
            System.out.println(word);
        }
    }
}
