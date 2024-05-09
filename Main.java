import java.util.Scanner;

public class Main {
    private static MemoryGameApp[][] memory = new MemoryGameApp[4][4];

    public static void main(String[] args) {
        initializeMemory();
        playMemoryGame();
    }

    public static void initializeMemory() {
        memory[0][0] = new MemoryGameApp('A');
        memory[0][1] = new MemoryGameApp('K');
        memory[0][2] = new MemoryGameApp('S');
        memory[0][3] = new MemoryGameApp('C');
        memory[1][0] = new MemoryGameApp('T');
        memory[1][1] = new MemoryGameApp('E');
        memory[1][2] = new MemoryGameApp('D');
        memory[1][3] = new MemoryGameApp('B');
        memory[2][0] = new MemoryGameApp('D');
        memory[2][1] = new MemoryGameApp('K');
        memory[2][2] = new MemoryGameApp('C');
        memory[2][3] = new MemoryGameApp('T');
        memory[3][0] = new MemoryGameApp('A');
        memory[3][1] = new MemoryGameApp('B');
        memory[3][2] = new MemoryGameApp('E');
        memory[3][3] = new MemoryGameApp('S');
    }

    public static void playMemoryGame() {
        Scanner scanner = new Scanner(System.in);

        while (!isGameFinished()) {
            displayGameBoard();
            forecast(scanner);
        }
        scanner.close();
    }

    public static void forecast(Scanner scanner) {
        System.out.print("First forecast: (Enter values i and j with spaces.) ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter integer values.");
            scanner.next();
        }
        int i1 = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter integer values.");
            scanner.next();
        }
        int j1 = scanner.nextInt();
        memory[i1][j1].setForecast(true);
        displayGameBoard();

        System.out.print("Second forecast: (Enter values i and j with spaces.) ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter integer values.");
            scanner.next();
        }
        int i2 = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter integer values.");
            scanner.next();
        }
        int j2 = scanner.nextInt();

        if (memory[i1][j1].getValue() == memory[i2][j2].getValue()) {
            memory[i2][j2].setForecast(true);
            System.out.println("Correct prediction! Congratulations...");
        } else {
            memory[i2][j2].setForecast(false);
            System.out.println("False prediction. :(");
        }
    }


    public static void displayGameBoard() {
        for (int i = 0; i < 4; i++) {
            System.out.println("...................");
            for (int j = 0; j < 4; j++) {
                if (memory[i][j].isForecast()) {
                    System.out.print(" |" + memory[i][j].getValue() + "| ");
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println();
        }
        System.out.println("...................");
    }

    public static boolean isGameFinished() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!memory[i][j].isForecast()) {
                    return false;
                }
            }
        }
        return true;
    }
}

class MemoryGameApp {
    private char value;
    private boolean forecast;

    public MemoryGameApp(char value) {
        this.value = value;
        this.forecast = false;
    }

    public char getValue() {
        return value;
    }

    public boolean isForecast() {
        return forecast;
    }

    public void setForecast(boolean forecast) {
        this.forecast = forecast;
    }
}


