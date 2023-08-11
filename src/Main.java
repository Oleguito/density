import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double volume, mass;
        System.out.print("Объем: ");
        try {
            volume = s.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        System.out.print("Масса: ");
        try {
            mass = s.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        System.out.println("Плотность: " + (mass * volume));
    }
}