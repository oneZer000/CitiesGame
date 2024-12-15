import java.util.Scanner;

public class CitiesGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastLetter = "";
        String player1, player2;

        System.out.print("Игрок 1, введите свое имя: ");
        player1 = scanner.nextLine();
        System.out.print("Игрок 2, введите свое имя: ");
        player2 = scanner.nextLine();

        boolean player1Turn = true;
        while (true) {
            String word;
            System.out.print((player1Turn ? player1 : player2) + ", введите город: ");
            word = scanner.nextLine();

            if (word.isEmpty()) {
                System.out.println("Вы не ввели слово. Введите слово.");
                continue;
            }

            if (!word.toLowerCase().startsWith(lastLetter.toLowerCase())) {
                System.out.println("Слово должно начинаться с буквы '" + lastLetter + "'. Попробуйте снова.");
                continue;
            }

            lastLetter = word.substring(word.length() - 1);
            player1Turn = !player1Turn;
        }
    }
}