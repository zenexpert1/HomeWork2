package HomeWork2;

public class MyArrayDataException extends Exception implements MessageInterface {
    private int row;
    private int col;
    private String detailMessage;

    public MyArrayDataException(Exception e,int i,int j){
        super(e);
        this.row = i;
        this.col = j;
        this.detailMessage = String.format("Невозможно преобразование в строке %1d столбце %1d ",i,j);
    }

    @Override
    public String toString() {
        return this.detailMessage +"\n\t"+ super.toString();
    }
}
