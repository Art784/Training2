package Brain;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        Counting counting = new Counting();
        String[][] car = new String[4][4];
        String[][] air = new String[3][4];
        String[][] conv = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12", "14"}, {"15", "16", "17",
                "XVIII"}};
        Counting.jeep(car);
        Counting.calculation(car);
        try {
            Counting.jeep(air);
        } catch (MyArraySizeException ex) {
            System.out.println("Other size Array " + air.length);
        }
        try {
            Counting.calculation(conv);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}