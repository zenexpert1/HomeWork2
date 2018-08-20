package HomeWork2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(Exception e){
        super(e);
    }

    public MyArraySizeException(String s) {
        super(s);
    }
}

