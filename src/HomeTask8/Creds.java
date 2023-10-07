package HomeTask8;

public class Creds {
    String login;
    String password;
    String confirmPassword;
    static boolean validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean isInputDataValid;
        if (login.contains(" ")==true||login.length()<20==false) {
            throw new WrongLoginException("Invalid Login!");
        }
        if (password.contains(" ")==true||password.length()<20==false||password.matches(".*[\\d].*")==false||password!=confirmPassword) {
            throw new WrongPasswordException("Invalid Password!");
        } else {
            isInputDataValid=true;
        }
        return isInputDataValid;
    }
}
