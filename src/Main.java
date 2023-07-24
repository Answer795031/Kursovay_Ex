import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        String[] array = {"П", "Р", "Р", "П", "И", "В", "В", "П", "Е", "Т", "Е", "!"};
        String arrayChars = "";

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == null) {
                continue;
            }

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] == null) {
                    continue;
                }

                if (array[i].equals(array[j])) {
                    array[j] = null;
                }
            }
        }

        for (String i : array) {

            if (i == null) {
                continue;
            }

            arrayChars += i;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(arrayChars);
    }
}