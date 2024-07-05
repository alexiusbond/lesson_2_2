public class Main {
    public static void main(String[] args) {
        int temperature = 20, numberOfStudents = 10;
        boolean isRainy = true;
        if (temperature > 15 && temperature < 30) { // && - логический оператор И (AND)
            System.out.println("Go walking");
        }

        if (numberOfStudents == 20 && isRainy) {
            System.out.println("We will not go to the park");
        }

        if (isRainy || temperature < 15) { // || - логический оператор ИЛИ (OR)
            System.out.println("We will not go to the school");
        }

        if (temperature > 30 || numberOfStudents > 20) {
            System.out.println("We will go to picnic");
        }

        if (temperature < 40 && temperature > 15 || numberOfStudents > 10 && isRainy) {
            // true && true || false && true => 1 * 1 + 0 * 1 = 1 + 0 = 1 (TRUE)
            System.out.println("We will go to the cinema");
        }

        if (temperature < 40 && (temperature > 15 || numberOfStudents > 10) && isRainy) {
            // true && (true || false) && true => 1 * (1 + 0) * 1 = 1 * 1 * 1 = 1 (TRUE)
            System.out.println("We will go to the cafe");
        }

        if (isRainy) {
            System.out.println("Take an umbrella");
        }
        isRainy = false;
        if (!isRainy) { // ! - логический оператор отрицания НЕ (NOT)
            System.out.println("Go swimming");
        }
    }
}