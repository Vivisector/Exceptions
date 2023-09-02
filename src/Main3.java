import java.io.FileNotFoundException;

public class Main3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[2] = 9; // здесь возникнет исключение "Индекс массива выходит за пределы размера массива!"
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль не допускается!");
//        } catch (FileNotFoundException ex) {
//            System.out.println("Файл не найден!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Индекс массива выходит за пределы размера массива!");
        } catch (Exception ex) {
            System.out.println("Общее исключение: " + ex.getMessage());
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }


}
