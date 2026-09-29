import java.util.Base64;
import java.util.Scanner;

public class EncryptionDecryption {

    public static String caesarCipher(String text, int shift, boolean isEncrypt) {
        StringBuilder result = new StringBuilder();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int shiftAmount = isEncrypt ? shift : -shift;

        for (char c : text.toCharArray()) {
            int index = alphabet.indexOf(c);
            if (index == -1) {
                result.append(c); // Non-alphabet character remains unchanged
            } else {
                int newIndex = (index + shiftAmount + alphabet.length()) % alphabet.length();
                result.append(alphabet.charAt(newIndex));
            }
        }
        return result.toString();
    }

    public static String xorEncrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            result.append((char) (c ^ key));
        }
        return result.toString();
    }

    public static String base64Encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    public static String base64Decode(String text) {
        return new String(Base64.getDecoder().decode(text));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Operation (encrypt/decrypt): ");
        String operation = scanner.nextLine().toLowerCase();

        System.out.println("Choose Technique (caesar/xor/base64): ");
        String technique = scanner.nextLine().toLowerCase();

        System.out.println("Enter Data: ");
        String inputData = scanner.nextLine();

        String result = "";

        switch (technique) {
            case "caesar":
                System.out.println("Enter Key (numeric shift): ");
                int caesarKey = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                result = caesarCipher(inputData, caesarKey, operation.equals("encrypt"));
                break;

            case "xor":
                System.out.println("Enter Key (numeric): ");
                int xorKey = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                result = xorEncrypt(inputData, xorKey);
                break;

            case "base64":
                if (operation.equals("encrypt")) {
                    result = base64Encode(inputData);
                } else {
                    try {
                        result = base64Decode(inputData);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Base64 input for decryption!");
                        return;
                    }
                }
                break;

            default:
                System.out.println("Invalid technique selected!");
                return;
        }

        System.out.println("Result: " + result);
    }
}

