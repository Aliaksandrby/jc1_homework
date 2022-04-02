package by.exercise43;

import by.exercise44.MyException;

public class Exceptioner {

    public void handlerNullPointerException() {
        try {
            createNullPointerExceptionOne();
            //createNullPointerExceptionTwo(); also NullPointerException
            //createNullPointerExceptionThree(); also NullPointerException
        } catch (NullPointerException exception) {
            System.out.println("You have " + exception);
            exception.printStackTrace();
        }
    }

    private void createNullPointerExceptionOne() {
        throw new NullPointerException();
    }

    private void createNullPointerExceptionTwo() {
        String someStr = null;
        someStr.length();
    }

    private void createNullPointerExceptionThree() {
        throw null;
    }

    public void handlerMyException(String message) {
        try {
            throw new MyException(message);
        } catch (MyException ownException) {
            System.out.println("My own EXCEPTION " + ownException);
            ownException.printStackTrace();
        }
    }

    public void handlerMyExceptionUp(String message) {
        try {
            makeException(message);
        } catch (MyException ownException) {
            System.out.println("My own EXCEPTION level UP " + ownException);
            ownException.printStackTrace();
        }
    }

    private void makeException(String message) throws MyException {
        throw new MyException(message);
    }
}
