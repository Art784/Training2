package Brain;
public class Counting {

public static void jeep(String[][] car) throws MyArraySizeException {
        if (car.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < car.length; i++) {
                for (int j = 0; j < car[0].length; j++) {
                }
        }
}
public static void calculation(String[][] car) throws MyArrayDataException {
        int box = 0;
        for (int i = 0; i < car.length; i++) {
        for (int j = 0; j < car[0].length; j++) {
        try {
        box += Integer.parseInt(car[i][j]);
        System.out.println("Sum of the array: = " + box);
        } catch (NumberFormatException ex) {
        throw new MyArrayDataException("NumberFormatException: " + ex.getMessage()+i+j);
        }
        }
        }
        }
        }
