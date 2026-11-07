package com.marc.expensetracker.service;

import com.marc.expensetracker.model.Expense;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private final List<Expense> expenses = new ArrayList<>();
    private int nextId = 1;

    public Expense add(LocalDate date, String category,
                       BigDecimal amount, String description) {
        Expense e = new Expense(nextId++, date, category, amount, description);
        expenses.add(e);
        return e;
    }

    public List<Expense> getAll() {
        return List.copyOf(expenses);
    }
}