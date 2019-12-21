package task2;

public class MyException extends RuntimeException {

    @Override
    public String getMessage() {
        return "You entered invalid number";
    }
}
