public class Main {
    public static void main(String[] args) {
        int temperature = 38;
        int numberOfStudents = 20;
        boolean isRainy = false;

        if (temperature > 10 && temperature < 40) { // оператор И (AND) - &&
            System.out.println("The weather is fine!");
        }

        if (temperature >= 20 || numberOfStudents == 22) { // оператор ИЛИ (OR) - ||
            System.out.println("Play football");
        }

        if (temperature > 0 && temperature < 20 || numberOfStudents > 10) {
            // true && false || true => 1 * 0 + 1 => 0 + 1 => 1 (TRUE)
            System.out.println("Go to the picnic");
        }

        if (numberOfStudents > 10 || temperature > 0 && temperature < 20) {
            // true || true && false => 1 + 1 * 0 => 1 + 0 => 1 (TRUE)
            System.out.println("Go to the park");
        }

        if (!isRainy) { // оператор отрицания НЕ (NOT) - !
            System.out.println("Go swimming");
        }

        if (!(numberOfStudents > 50 || temperature < 0)) {
            // !(false || false) => !(0 + 0) => !(0) => 1 (TRUE)
            System.out.println("Do something");
        }
    }
}
