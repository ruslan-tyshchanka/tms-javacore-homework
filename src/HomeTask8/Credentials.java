package HomeTask8;

public class Credentials {
    public static void main(String[] args) {
        Creds credentials = new Creds();

        credentials.login="RuslanTyshchanka";
        credentials.password="password1";
        credentials.confirmPassword="password1";

        try {
            credentials.validateCredentials(credentials.login, credentials.password, credentials.confirmPassword);
            System.out.println("Login Successful!");
        } catch (WrongLoginException e) {

        } catch (WrongPasswordException e) {
        }
    }
}
