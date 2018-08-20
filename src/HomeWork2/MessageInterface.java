package HomeWork2;

public interface MessageInterface {

    default void PrintMessage(String s) {
        System.out.println(s);
    };

}
