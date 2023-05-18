
import java.util.Random;
import java.util.Scanner;

public class Generator{

    public static void main(String[] args) {

        // Password length
        int length = 10;
        
        // Character arrays for password generation
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_+";

        // Password generation options
        String allChars = lowerChars + upperChars + numbers + specialChars;
        String lettersAndNumbers = lowerChars + upperChars + numbers;

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length (default is 10): ");
        String inputLength = scanner.nextLine();

        if (!inputLength.isEmpty()) {
            length = Integer.parseInt(inputLength);
        }

        System.out.print("Include uppercase letters (yes/no)? ");
        boolean includeUppercase = scanner.nextLine().toLowerCase().equals("yes");

        System.out.print("Include numbers (yes/no)? ");
        boolean includeNumbers = scanner.nextLine().toLowerCase().equals("yes");

        System.out.print("Include special characters (yes/no)? ");
        boolean includeSpecialChars = scanner.nextLine().toLowerCase().equals("yes");

        String allowedChars = lowerChars;

        if (includeUppercase) {
            allowedChars += upperChars;
        }

        if (includeNumbers) {
            allowedChars += numbers;
        }

        if (includeSpecialChars) {
            allowedChars += specialChars;
        }

        // Random password generation
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(index));
        }

        System.out.println("Generated password: " + password.toString());
    }
}

