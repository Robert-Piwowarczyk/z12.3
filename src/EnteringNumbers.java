import java.util.Scanner;

public class EnteringNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wpisz dowolną liczbę dodatnią i wciśnij enter:");
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; ) {
            int number = sc.nextInt();
            if (number > 0) {
                numbers[i] = number;
                i++;
            } else {
                if (number < 0)
                    System.out.println("Liczba ta NIE powinna być dodana do listry");
                break;
            }
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Odwrotna kolejność wprowadzanych cyfr " + numbers[i]);
        }
        int sum = 0;
        for (int n = 0; n < numbers.length; n++){
            if (sum == sum + numbers[n]){
                sum = sum + numbers[n];
            }
        }
        System.out.println("Suma  wprowadzonych cyfr  = " + sum);

        int max = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] != null && numbers[j] > max) {
                max = numbers[j];
            }
        }
        System.out.println("Największa wprowadzona cyfra to: " + max);
        int min = 0;
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] != null && numbers[k] < min) {
                min = numbers[k];
            }
        }
        System.out.println("Najmniejsza wprowadzona cyfra to: " + min);
        sc.close();
    }
}






