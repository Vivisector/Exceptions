import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        float number = getUserFloatInput();
        System.out.println("Вы ввели число: " + number);
    }

    public static float getUserFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0.0f;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Пожалуйста, введите дробное число (типа float): ");
                String input = scanner.nextLine();
                result = Float.parseFloat(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректное значение. Попробуйте еще раз.");
            }
        }

        return result;
    }
}
