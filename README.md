# Laba6
Давайте детально розглянемо обидва завдання і пояснимо кожен рядок коду.

### Завдання №3: Перетворення значення `int` у об’єкт `String`, що представляє число у вісімковій системі числення

#### Клас `IntToOctString`

```java
public class IntToOctString { // Оголошення класу IntToOctString
    public static String intToOctString(int i) { // Оголошення методу intToOctString, який приймає число int
        if (i < 0) { // Перевірка, чи є число від'ємним
            throw new IllegalArgumentException("Число повинно бути невід'ємним."); // Якщо число від'ємне, кидаємо виключення
        }
        return Integer.toOctalString(i).toUpperCase(); // Перетворюємо число в рядок у вісімковій системі та перетворюємо на великі літери
    }

    public static void main(String[] args) { // Головний метод програми
        // Приклади перевірок
        try {
            System.out.println("Результат для 511: " + intToOctString(511)); // Очікувано: "777"
            System.out.println("Результат для 83: " + intToOctString(83)); // Очікувано: "123"
            System.out.println("Результат для 8: " + intToOctString(8)); // Очікувано: "10"
            // Перевірка з помилковими даними
            System.out.println("Результат для -5: " + intToOctString(-5)); // Очікується виключення
        } catch (IllegalArgumentException e) { // Ловимо виключення, якщо число від'ємне
            System.out.println("Помилка: " + e.getMessage()); // Виводимо повідомлення про помилку
        }
    }
}
```

#### Пояснення коду:

1. **`public class IntToOctString`**:
   - Це оголошення класу `IntToOctString`, в якому буде реалізовано перетворення числа в рядок у вісімковій системі.

2. **`public static String intToOctString(int i)`**:
   - Метод `intToOctString` приймає ціле число `int` як параметр і повертає рядок (`String`), який представляє це число у вісімковій системі числення.

3. **`if (i < 0)`**:
   - Перевіряється, чи є число від'ємним. Якщо так, кидається виключення `IllegalArgumentException`.

4. **`throw new IllegalArgumentException("Число повинно бути невід'ємним.");`**:
   - Якщо число від'ємне, кидається виключення з повідомленням про помилку.

5. **`return Integer.toOctalString(i).toUpperCase();`**:
   - Метод `Integer.toOctalString(i)` перетворює ціле число `i` у рядок, що представляє це число у вісімковій системі числення.
   - Метод `toUpperCase()` перетворює отриманий рядок на великі літери.

6. **`public static void main(String[] args)`**:
   - Головний метод, в якому програма виконується.

7. **`try { ... } catch (IllegalArgumentException e)`**:
   - В блоках `try` та `catch` перевіряються виключення. Якщо виникає помилка (від'ємне число), вона обробляється в блоці `catch`.

8. **`System.out.println("Результат для 511: " + intToOctString(511));`**:
   - Викликається метод `intToOctString` з числом `511`, і виводиться результат у вісімковій системі.

9. **`System.out.println("Результат для -5: " + intToOctString(-5));`**:
   - Викликається метод з від'ємним числом `-5`, що викликає виключення. У разі помилки виводиться повідомлення "Помилка: Число повинно бути невід'ємним."

---

### Завдання №8: Підрахунок кількості чисел у рядку

#### Клас `CountNumbersInString`

```java
public class CountNumbersInString { // Оголошення класу CountNumbersInString
    public static int countNumbersInString(String input) { // Оголошення методу countNumbersInString, який приймає рядок
        if (input == null) { // Перевірка, чи рядок не є null
            throw new NullPointerException("Вхідний рядок не може бути null"); // Якщо рядок null, кидаємо виключення
        }
        // Розбиваємо рядок на слова
        String[] tokens = input.split("\\s+"); // Розбиваємо рядок на масив слів, використовуючи пробіли як роздільники
        int count = 0; // Лічильник чисел

        for (String token : tokens) { // Проходимо по кожному слову в масиві
            if (token.matches("\\d+")) { // Якщо слово містить тільки цифри
                count++; // Збільшуємо лічильник
            }
        }
        return count; // Повертаємо кількість чисел
    }

    public static void main(String[] args) { // Головний метод
        // Приклади перевірок
        String example1 = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago"; 
        String example2 = "In 2023, 10 new products were released, and sales increased by 20 percent.";
        System.out.println("Кількість чисел у першому реченні: " + countNumbersInString(example1)); // Очікувано: 2
        System.out.println("Кількість чисел у другому реченні: " + countNumbersInString(example2)); // Очікувано: 3
        // Перевірка з null
        try {
            countNumbersInString(null); // Викликаємо метод з null, щоб перевірити виключення
        } catch (NullPointerException e) { // Ловимо виключення
            System.out.println("Помилка: " + e.getMessage()); // Виводимо повідомлення про помилку
        }
    }
}
```

#### Пояснення коду:

1. **`public class CountNumbersInString`**:
   - Оголошуємо клас `CountNumbersInString`.

2. **`public static int countNumbersInString(String input)`**:
   - Метод `countNumbersInString` приймає рядок (`String`) і повертає кількість чисел у цьому рядку.

3. **`if (input == null)`**:
   - Перевірка, чи є вхідний рядок `null`. Якщо так, кидається виключення `NullPointerException`.

4. **`String[] tokens = input.split("\\s+");`**:
   - Метод `split("\\s+")` розбиває рядок на масив слів, використовуючи пробіли як роздільники. Регулярний вираз `\\s+` означає один або більше пробілів.

5. **`for (String token : tokens)`**:
   - Цикл, який перебирає всі слова в масиві `tokens`.

6. **`if (token.matches("\\d+"))`**:
   - Перевіряється, чи є слово числом. Регулярний вираз `\\d+` означає послідовність цифр.

7. **`count++;`**:
   - Якщо слово — це число, збільшуємо лічильник.

8. **`return count;`**:
   - Повертаємо кількість чисел, знайдених у рядку.

9. **`try { ... } catch (NullPointerException e)`**:
   - Якщо передано `null` як вхідний рядок, викликається виключення, яке ми ловимо та виводимо повідомлення про помилку.

10. **`System.out.println("Кількість чисел у першому реченні: " + countNumbersInString(example1));`**:
    - Виводимо кількість чисел у першому прикладі.

---

Ці програми перевіряють основні принципи обробки рядків та чисел у Java, такі як перетворення чисел у рядки, робота з регулярними виразами, обробка помилок і підрахунок елементів у рядках.
