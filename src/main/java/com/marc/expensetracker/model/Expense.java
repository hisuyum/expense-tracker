package com.marc.expensetracker.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Expense(int id, LocalDate date, String category,
                      BigDecimal amount, String description) {

}