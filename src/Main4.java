import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.print("Введите строку: ");
        userInput = scanner.nextLine();

        try {
            userInput = userInput.trim(); // Удаление начальных и конечных пробелов

            if (userInput.isEmpty()) {
                throw new Exception();
            }

            System.out.println("Вы ввели: " + userInput);
        } catch (Exception e) {
            System.out.println("Ошибка: Введена пустая строка или строка из пробелов.");
        }
    }
}
