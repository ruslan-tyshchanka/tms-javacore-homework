package HomeTask8;

public class WrongPasswordException extends Exception{
    WrongPasswordException(String message)
    {
        super(message);
        System.out.println(message);
    }
    WrongPasswordException()
    {
        super("Invalid Password! Please update!");
        System.out.println("Invalid Password! Please update!");
    }
}
