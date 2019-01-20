//       1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
//              при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//              Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//              должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
//               и вывести результат расчета.

public class Main {
    public static void main(String[] args) {
        String[][] mas = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4",}};
        try {
            MyArray.getSizeMyArray(mas);
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }

        try {
            MyArray.getDataMyArray(mas);
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }

    }
}

class MyArraySizeException extends Exception {
    private String[][] arr;

    public String[][] getArr() {
        return arr;
    }
    public MyArraySizeException(String mag, String[][] arr){
        super(mag);
        this.arr = arr;
    }
}

class MyArrayDataException extends Exception{
    private String NumArr;

    public String getNumArr() {
        return NumArr;
    }
    public MyArrayDataException(String mag, String NumArr){
        super(mag);
        this.NumArr = NumArr;
    }
}

class MyArray {
    public static String[][] getSizeMyArray (String[][] arr) throws MyArraySizeException{
        int size = 4;
        int sum = 0;
        if (arr.length != size | arr[1].length != size){
            throw new MyArraySizeException("Размер массива указан неправильно", arr);
        }
        return arr;
    }

    public static String[][] getDataMyArray (String[][] arr) throws MyArrayDataException{
        int[][] NumArray = new int[4][4];
        int sum = 0;
        boolean check = true;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                NumArray[i][j] = Integer.valueOf(arr[i][j]);
                if (check != Character.isDigit(NumArray[i][j])){
                    System.out.println(NumArray[i][j]);
                    throw new MyArrayDataException("Не числовое выражение", arr[i][j]);
                } else {
                    sum += NumArray[i][j];

                }
            }
        }
        System.out.println(sum);
        return arr;
    }
}
