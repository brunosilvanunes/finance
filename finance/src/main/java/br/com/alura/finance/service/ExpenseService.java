package br.com.alura.finance.service;

import br.com.alura.finance.model.dto.ExpenseDTO;

import java.util.List;

public interface ExpenseService {

    void saveExpense(ExpenseDTO expenseDTO);

    List<ExpenseDTO> getExpenses();
}
