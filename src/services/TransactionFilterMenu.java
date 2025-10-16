package services;

import filter.TransactionTypeFilter;
import models.Transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class TransactionFilterMenu {

    private final Scanner scanner = new Scanner(System.in);
    private final TransactionFilterService filterService = new TransactionFilterService();

    public List<Transaction> chooseFilter(List<Transaction> transactions){

        System.out.println("""
                ============================
                Filtreringsalternativ:
                1. Visa alla transaktioner
                2. Filtrera per år
                3. Filtrera per månad
                4. Filtrera per vecka
                5. Filtrera per dag
                6. Visa endast inkomster
                7. Visa endast utgifter
                ============================
                Ditt val (1-7):
              """);

        int choice = scanner.nextInt();


        return switch (choice) {
            case 2 -> {
                System.out.print("Ange år (t.ex. 2025): ");
                int year = scanner.nextInt();
                yield filterService.filterByYear(transactions, year);
            }
            case 3 -> {
                System.out.print("Ange år: ");
                int year = scanner.nextInt();
                System.out.print("Ange månad (1-12): ");
                int month = scanner.nextInt();
                yield filterService.filterByMonth(transactions, year, month);
            }
            case 4 -> {
                System.out.print("Ange år: ");
                int year = scanner.nextInt();
                System.out.print("Ange vecka (1-52): ");
                int week = scanner.nextInt();
                yield filterService.filterByWeek(transactions, year, week);
            }
            case 5 -> {
                System.out.print("Ange datum (yyyy-MM-dd): ");
                String dateString = scanner.next();
                LocalDate date = LocalDate.parse(dateString);
                yield filterService.filterByDay(transactions, date);
            }
            case 6 -> filterService.filterByIncome(transactions);
            case 7 -> filterService.filterByExpense(transactions);
            default -> transactions;
        };

    }

}


