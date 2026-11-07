package com.marc.expensetracker;

import com.marc.expensetracker.service.ExpenseService;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExpenseService service = new ExpenseService();
        service.add(LocalDate.now(), "Food", new BigDecimal("250.50"), "Lunch");
        service.add(LocalDate.now(), "Transport", new BigDecimal("80"), "Jeepney");
        service.getAll().forEach(System.out::println);
    }
}