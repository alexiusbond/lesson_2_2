public class Main {
    public static void main(String[] args) {
        int temperature = 20;
        int numberOfStudents = 10;
        boolean isRaining = true;

        if (temperature > 10 && temperature < 30) { // && - логический оператор "И" (AND)
            System.out.println("Прогулка состоится");
        }

        if (numberOfStudents > 15 && temperature >= 13) {
            System.out.println("Играем в футбол");
        }

        if (isRaining || temperature < 10) { // || - логический оператор "ИЛИ" (OR)
            System.out.println("Одевайтесь теплее");
        }

        // Пример не изящный
        if (isRaining) {
        } else {
            System.out.println("Зонт не нужен");
        }
        // Пример изящный
        if (!isRaining) { // ! - логический оператор "НЕ" (NOT)
            System.out.println("Зонт не нужен");
        }

        if (temperature > 10 && temperature < 30 || !isRaining && numberOfStudents > 15) {
            // true && true || false && false => 1 * 1 + 0 * 0 => 1 + 0 = 1 (TRUE)
            System.out.println("Едем на пикник");
        }

        if (temperature > 10 && (temperature < 30 || !isRaining) && numberOfStudents > 15) {
            // true && (true || false) && false => 1 * (1 + 0) * 0 => 1 * 1 * 0 = 0 (FALSE)
            System.out.println("Идем в театр");
        }
    }
}