package Pertemuan03.Penugasan.Assertion;

public class UserInputValidator {
    public static void validateUsername(String username) {
      assert(username.length() >= 5) : "Username must be at least 5 characters long";
      assert(username.length() <= 20) : "Username must be at most 20 characters long";
      assert(username.matches("^[A-Za-z].*")) : "First character of the username must be a letter";
      assert(username.matches("[A-Za-z0-9_]+")) : "Username must contain only letters, numbers, and underscores";
    }
  
    public static void validateEmail(String email) {
      assert(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,4}$")) : "Invalid email address";
    }
  
    public static void validateAge(int age) {
      assert(17 <= age && age <= 99) : "Age must be between 17 and 99";
    }
  }
  
