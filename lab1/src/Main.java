import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
//
//************** ZADANIE 1 ******************
//        public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imię: ");
//        String name = scanner.nextLine();
//        if (name == null || name.isEmpty()) {
//            System.out.println("Hello world");
//        }
//        else {
//            System.out.println("Hello " + name);
//        }


// *********** ZADANIE 2 *************
//    public static void main(String[] args) {
//    public static double convertTemperature(double temperature, String fromScale, String toScale) throws IllegalArgumentException {
//        double result = 0;
//
//        if (!fromScale.equals("Celsius") && !fromScale.equals("Fahrenheit") && !fromScale.equals("Kelvin")) {
//            throw new IllegalArgumentException("Nieprawidłowa skala początkowa: " + fromScale);
//        }
//        if (!toScale.equals("Celsius") && !toScale.equals("Fahrenheit") && !toScale.equals("Kelvin")) {
//            throw new IllegalArgumentException("Nieprawidłowa skala docelowa: " + toScale);
//        }
//
//        if (fromScale.equals("Fahrenheit")) {
//            temperature = (temperature - 32) * 5 / 9;  // Fahrenheit -> Celsius
//        } else if (fromScale.equals("Kelvin")) {
//            if (temperature < 0) {
//                throw new IllegalArgumentException("Temperatura w skali Kelvin nie może być mniejsza niż 0 K.");
//            }
//            temperature = temperature - 273.15;
//        }
//
//        if (toScale.equals("Fahrenheit")) {
//            result = (temperature * 9 / 5) + 32;
//        } else if (toScale.equals("Kelvin")) {
//            result = temperature + 273.15;
//        } else {
//            result = temperature;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Wybierz skale początkową (Celsius, Fahrenheit, Kelvin): ");
//            String fromScale = scanner.nextLine();
//
//            System.out.println("Wybierz skale docelową (Celsius, Fahrenheit, Kelvin): ");
//            String toScale = scanner.nextLine();
//
//            System.out.println("Podaj temperaturę w skali " + fromScale + ": ");
//            double temperature = scanner.nextDouble();
//
//            double result = convertTemperature(temperature, fromScale, toScale);
//
//            System.out.printf("Temperatura w skali %s wynosi %.2f %s%n", toScale, result, toScale);
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("Błąd: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Wystąpił błąd: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }

//        **************** ZADANIE 3 ****************
    //    public static void main(String[] args) {
//        public static boolean isLeapYear(int year) {
//            return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
//        }
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Podaj datę w formacie YYYY-MM-DD: ");
//            String date = scanner.nextLine();
//
//            String[] parts = date.split("-");
//            int year = Integer.parseInt(parts[0]);
//            int month = Integer.parseInt(parts[1]);
//
//            String monthName = "";
//            int daysInMonth = 0;
//
//            switch (month) {
//                case 1:
//                    monthName = "Styczeń";
//                    daysInMonth = 31;
//                    break;
//                case 2:
//                    monthName = "Luty";
//                    daysInMonth = isLeapYear(year) ? 29 : 28;
//                    break;
//                case 3:
//                    monthName = "Marzec";
//                    daysInMonth = 31;
//                    break;
//                case 4:
//                    monthName = "Kwiecień";
//                    daysInMonth = 30;
//                    break;
//                case 5:
//                    monthName = "Maj";
//                    daysInMonth = 31;
//                    break;
//                case 6:
//                    monthName = "Czerwiec";
//                    daysInMonth = 30;
//                    break;
//                case 7:
//                    monthName = "Lipiec";
//                    daysInMonth = 31;
//                    break;
//                case 8:
//                    monthName = "Sierpień";
//                    daysInMonth = 31;
//                    break;
//                case 9:
//                    monthName = "Wrzesień";
//                    daysInMonth = 30;
//                    break;
//                case 10:
//                    monthName = "Październik";
//                    daysInMonth = 31;
//                    break;
//                case 11:
//                    monthName = "Listopad";
//                    daysInMonth = 30;
//                    break;
//                case 12:
//                    monthName = "Grudzień";
//                    daysInMonth = 31;
//                    break;
//                default:
//                    System.out.println("Niepoprawny miesiąc");
//                    return;
//            }
//
//            System.out.println("Miesiąc: " + monthName);
//            System.out.println("Liczba dni w miesiącu: " + daysInMonth);
//        }
//    }

    //      ************* ZADANIE 4 ***************
//    public static void main(String[] args) {
//    Map<String, String> users = new HashMap<>();
//        users.put("user1", "password1");
//        users.put("user2", "password2");
//        users.put("admin", "adminpass");
//
//        Console console = System.console();
//        Scanner scanner = null;
//
//        if (console == null) {
//            System.out.println("Console nie jest dostępna, używam Scanner do wczytywania danych.");
//            scanner = new Scanner(System.in);
//        }
//
//        System.out.println("Wybierz opcję:");
//        System.out.println("1. Logowanie");
//        System.out.println("2. Rejestracja");
//
//        String option = null;
//        if (console != null) {
//            option = console.readLine("Wybór: ");
//        } else {
//            option = scanner.nextLine();
//        }
//
//        if (option.equals("1")) {
//            login(users, console, scanner);
//        } else if (option.equals("2")) {
//            register(users, console, scanner);
//        } else {
//            System.out.println("Niepoprawny wybór!");
//        }
//
//        if (scanner != null) {
//            scanner.close();
//        }
//    }
//
//    public static void login(Map<String, String> users, Console console, Scanner scanner) {
//        String login = null;
//        if (console != null) {
//            login = console.readLine("Podaj login: ");
//        } else {
//            login = scanner.nextLine();
//        }
//
//        char[] passwordArray = null;
//        if (console != null) {
//            passwordArray = console.readPassword("Podaj hasło: ");
//        } else {
//            System.out.print("Podaj hasło: ");
//            String password = scanner.nextLine();
//            passwordArray = password.toCharArray();
//        }
//
//        String password = new String(passwordArray);
//
//        if (users.containsKey(login) && users.get(login).equals(password)) {
//            System.out.println("Logowanie udane!");
//        } else {
//            System.out.println("Błędny login lub hasło!");
//        }
//    }
//
//    public static void register(Map<String, String> users, Console console, Scanner scanner) {
//        String login = null;
//        if (console != null) {
//            login = console.readLine("Podaj login: ");
//        } else {
//            login = scanner.nextLine();
//        }
//
//        if (users.containsKey(login)) {
//            System.out.println("Login już istnieje. Spróbuj ponownie.");
//            return;
//        }
//
//        char[] passwordArray = null;
//        if (console != null) {
//            passwordArray = console.readPassword("Podaj hasło: ");
//        } else {
//            System.out.print("Podaj hasło: ");
//            String password = scanner.nextLine();
//            passwordArray = password.toCharArray();
//        }
//
//        String password = new String(passwordArray);
//
//        users.put(login, password);
//        System.out.println("Rejestracja udana! Użytkownik " + login + " został dodany.");
//    }
//    ********** ZADANIE 5 **********

        public static void main(String[] args) {
            String filePath = "macierz.txt";

            try {
                int[][] matrix = readMatrixFromFile(filePath);
                if (isMagicSquare(matrix)) {
                    System.out.println("Macierz jest kwadratem magicznym.");
                } else {
                    System.out.println("Macierz nie jest kwadratem magicznym.");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Nie znaleziono pliku.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        public static int[][] readMatrixFromFile(String filePath) throws FileNotFoundException {
            File file = new File("/Users/szymonkus/Desktop/Projekty IT/Programowanie/lab1/src/macierz.txt");
            Scanner scanner = new Scanner(file);

            int n = 0;
            int[][] matrix = new int[100][100];

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split("\\s+");
                for (int i = 0; i < values.length; i++) {
                    matrix[n][i] = Integer.parseInt(values[i]);
                }
                n++;
            }

            int[][] result = new int[n][n];
            for (int i = 0; i < n; i++) {
                System.arraycopy(matrix[i], 0, result[i], 0, n);
            }

            return result;
        }

        public static boolean isMagicSquare(int[][] matrix) {
            int n = matrix.length;
            int magicSum = 0;

            for (int i = 0; i < n; i++) {
                magicSum += matrix[0][i];
            }

            for (int i = 1; i < n; i++) {
                int rowSum = 0;
                for (int j = 0; j < n; j++) {
                    rowSum += matrix[i][j];
                }
                if (rowSum != magicSum) {
                    return false;
                }
            }

            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int[] ints : matrix) {
                    colSum += ints[j];
                }
                if (colSum != magicSum) {
                    return false;
                }
            }

            int diagSum1 = 0;
            for (int i = 0; i < n; i++) {
                diagSum1 += matrix[i][i];
            }
            if (diagSum1 != magicSum) {
                return false;
            }

            int diagSum2 = 0;
            for (int i = 0; i < n; i++) {
                diagSum2 += matrix[i][n - 1 - i];
            }
            return diagSum2 == magicSum;
        }
    }
