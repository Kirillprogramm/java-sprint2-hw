import java.util.Scanner;

/**
 * «Автоматизация бухгалтерии»
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MonthlyReport monthlyReport = new MonthlyReport();
        YearlyReport yearlyReport = new YearlyReport();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                /**
                 * Метод для Считывания всех месячных отчётов
                 */
                monthlyReport.readingMonthlyReports();
            } else if (command == 2) {
                /**
                 * Метод для Считывания годового отчёта
                 */
                yearlyReport.readingYearlyReport();
            } else if (command == 3) {
                /**
                 * Метод Сверки отчётов
                 */
                ReviseReports.reviseSumReports(monthlyReport.monthlyReportsMaps, yearlyReport.yearlyReportMap);
            } else if (command == 4) {
                /**
                 * Метод Вывода информации о всех месячных отчётах
                 */
                monthlyReport.outputInfoMonthlyReports();
            } else if (command == 5) {
                /**
                 * Метод Вывода информации о годовом отчёте
                 */
                yearlyReport.outputInfoYearlyReport();
            } else if (command == 0) {

                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о всех месячных отчётах");
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("0 - Выход");
    }
}