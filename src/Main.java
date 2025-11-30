import java.io.*;
import java.net.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first 3 digits of your bank account: ");
        String bankCode = scanner.nextLine().trim();

        String url = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new URL(url).openStream()))) {

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(bankCode)) {
                    String[] parts = line.trim().split("\\s{2,}");
                    if (parts.length > 1) {
                        System.out.println("Your bank: " + parts[1]);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("No bank found for this code.");
            }

        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}