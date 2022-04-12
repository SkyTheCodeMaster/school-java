// this is insecure.

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class PasswordCheck {
  static String hash(String input) throws NoSuchAlgorithmException {
    MessageDigest sha = MessageDigest.getInstance("SHA-256");
    sha.update(input.getBytes());
    byte[] digest = sha.digest();
    StringBuffer hexString = new StringBuffer();
    for (int i=0;i<digest.length;i++) {
      hexString.append(Integer.toHexString(0xff & digest[i]));
    }
    return hexString.toString();
  }
  public static void main(String[] args) throws NoSuchAlgorithmException {
    Scanner scanner = new Scanner(System.in);
    String passwordHash = "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8"; // This is "password"
    System.out.print("Please enter your password: ");
    String passwd = scanner.nextLine();
    String passwdHash = hash(passwd);
    if (passwdHash.equals(passwordHash)) {
      System.out.println("You are authenticated.");
    } else {
      System.out.println("Access Denied.");
    }
  }
}
