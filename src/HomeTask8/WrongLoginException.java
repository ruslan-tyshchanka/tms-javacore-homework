package HomeTask8;

public class WrongLoginException extends Exception{
    WrongLoginException(String message)
    {
        super(message);
        System.out.println(message);
    }
    WrongLoginException()
    {
        super("Invalid Login! Please update!");
        System.out.println("Invalid Login! Please update!");
    }
}
