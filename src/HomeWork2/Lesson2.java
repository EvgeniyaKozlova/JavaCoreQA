package HomeWork2;

public class Lesson2 {

    static int sizeA = 4;
    static int sizeB = 4;

    public static void main(String[] args) {

        String[][] noProblem = new String[][]{{"12", "47", "58", "78"}, {"0", "785", "45", "3"}, {"78", "2", "1", "123"}, {"7", "62", "81", "95"}};
        String[][] wrongData = new String[][]{{"1", "2", "3", "4"}, {"asd", "5", "6", "7"}, {"8", "9", "1", "0"}, {"7", "6", "8", "9"}};
        String[][] wrongLength = new String[][]{{"1", "2", "3"}, {"1", "5", "6"}, {"8", "9", "1"}, {"7", "6", "8"}};


        try {
            System.out.println("Массив noProblem");
            try {int result = checkSum(noProblem);System.out.println("Сумма ячеек: " + result);

            } catch (MyArraySizeException e) {System.out.println(e.getMessage());
            }
        }
        catch (MyArrayDataException e) {System.out.println(e.getMessage());}



        try {
            System.out.println("Массив wrongLength");
            try {int result = checkSum(wrongLength);System.out.println("Сумма ячеек:" + result);

            } catch (MyArraySizeException e) {System.out.println(e.getMessage());
            }
        }
        catch (MyArrayDataException e) {System.out.println(e.getMessage());}




        try {
            System.out.println("Массив wrongData");
            try {int result = checkSum(wrongData);System.out.println("Сумма ячеек:" + result);
            } catch (MyArraySizeException e) {System.out.println(e.getMessage());
            }
        }
        catch (MyArrayDataException e) {System.out.println(e.getMessage());}
    }



    static void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length!=sizeA || array[0].length!=sizeB) throw new MyArraySizeException("Выход за пределы массива");
    }



    static Integer checkSum(String[][] array) throws MyArrayDataException,MyArraySizeException{
        checkValue(array);
        Integer result = 0;
        int i =0;
        int j =0;
        try {for (; i < array.length; i++) {
                j =0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){throw new  MyArrayDataException("Значение ячейки " + i+"х"+j + " не число");}

        return result;
    }
    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message){
            super(message);
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            super(message);
        }
    }

}
