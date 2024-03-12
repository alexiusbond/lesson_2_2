public class Main {
    public static void main(String[] args) {
        int numberOfStudents = 10;
        int temperature = 16;
        boolean isRainy = true;

        if (temperature > 10 && temperature < 40) { // true
            // && - логический оператор И (AND)
            System.out.println("Go to picnic!");
        }

        if (numberOfStudents == 22 && temperature > 15) { // false
            System.out.println("Play Football");
        }

        if (numberOfStudents < 20 || temperature < 25) { // true
            // || - логический оператор ИЛИ (OR)
            System.out.println("Go to cinema");
        }

        if (isRainy || temperature < 10 && numberOfStudents > 5) {
            // true || false && true => 1 + 0 * 1 => 1 + 0 => 1 (TRUE)
            System.out.println("Go to Cafe");
        }
        isRainy = false;
        if ((isRainy || temperature < 10) && numberOfStudents > 5) {
            // (false || false) && true => (0 + 0) * 1 => 0 * 1 => 0 (FALSE)
            System.out.println("Go to park");
        }

        if (isRainy || temperature < 10 && numberOfStudents > 5) {
            // false || false && true => 0 + 0 * 1 => 0 + 0 => 0 (FALSE)
            System.out.println("Go to school");
        }

        if (isRainy) { // false
            System.out.println("Take an umbrella");
        }

        if (!isRainy) { // true
            System.out.println("Go swimming");
        }

        if (!(isRainy || temperature < 10) && numberOfStudents > 5) {
            // !(false || false) && true => !(0 + 0) * 1 => 1 * 1 => 1 (TRUE)
            System.out.println("Go to work");
        }

        if (temperature != 0) {
            System.out.println("Something");
        }
    }
}