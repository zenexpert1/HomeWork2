package HomeWork2;


public class ExceptionTest {


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] m1 = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","0"}
        };
        String[][] m2 = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1"},
                {"1","1","1","1"}
        };
        String[][] m3 = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","O"},
                {"1","1","1","1"}
        };
        String[][] m4 = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","0"},
                {"1","1","1","1"}
        };


        try {
            System.out.println("Сумма элементов массива равна " + ParseStringToIntAndSum(m1));
        }catch (MyArraySizeException e){
            System.out.println("Обработано исключение в первом массиве");
            System.out.println(e.toString());

        }catch (MyArrayDataException e){
            System.out.println("Обработано исключение в первом массиве");
            System.out.println(e.toString());
        }
        try {
            System.out.println("Сумма элементов массива равна " + ParseStringToIntAndSum(m2));
        }catch (MyArraySizeException e){
            System.out.println("Обработано исключение во втором массиве");
            System.out.println(e.toString());

        }catch (MyArrayDataException e){
            System.out.println("Обработано исключение во втором массиве");
            System.out.println(e.toString());
        }

        try {
            System.out.println("Сумма элементов массива равна " + ParseStringToIntAndSum(m3));
        }catch (MyArraySizeException e){
            System.out.println("Обработано исключение в третьем массиве");
            System.out.println(e.toString());

        }catch (MyArrayDataException e){
            System.out.println("Обработано исключение в третьем массиве");
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + ParseStringToIntAndSum(m4));
        }catch (MyArraySizeException e){
            System.out.println("Обработано исключение в четвёртом массиве");
            System.out.println(e.toString());

        }catch (MyArrayDataException e){
            System.out.println("Обработано исключение в четвёртом массиве");
            System.out.println(e);
        }

        System.out.println("The END");

    }

    public static int ParseStringToIntAndSum(String [][] s) throws MyArraySizeException, MyArrayDataException{

        if(s.length != 4)
            throw new  MyArraySizeException("Массив не 4х4");
        for(int i=0;i<4;i++)
            if(s[i].length != 4)
                throw new  MyArraySizeException("Массив не 4х4");

        int sum = 0;
        for (int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                try{
                    sum += Integer.parseInt(s[i][j]);
                }catch (Exception e){
                    throw new MyArrayDataException(e,i,j);
                }
            }
        }
        return sum;
    }



}






