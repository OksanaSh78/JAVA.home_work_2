package home_work_2.zadacha_3;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

public class z_3 {

    public static void main(String[] args) {
        String palindrom = "A 1 2 3 4 3 2 1 a";
        System.out.println(isPalindrom(palindrom));
    }
    
    public static boolean isPalindrom(String example) {
        for (int i = 0; i < example.length() / 2; i++) {
            if (example.charAt(i) != example.charAt(example.length() - i - 1)) return false;
        }
        return true;
    }
}
