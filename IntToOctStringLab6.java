public class IntToOctStringLab6 {
    public static String intToOctString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Число повинно бути невід'ємним.");
        }
        return Integer.toOctalString(i).toUpperCase();
    }

    public static void main(String[] args) {
        // Приклади перевірок
        try {
            System.out.println("Результат для 511: " + intToOctString(511)); // очікувано: "777"
            System.out.println("Результат для 83: " + intToOctString(83));   // очікувано: "123"
            System.out.println("Результат для 8: " + intToOctString(8));     // очікувано: "10"

            // Перевірка з помилковими даними
            System.out.println("Результат для -5: " + intToOctString(-5));   // виключення
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}