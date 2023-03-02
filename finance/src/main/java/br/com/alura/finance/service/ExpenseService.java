package br.com.alura.finance.service;

import br.com.alura.finance.model.dto.ExpenseDTO;

import java.util.List;

public interface ExpenseService {

    public ExpenseDTO saveExpense(ExpenseDTO expenseDTO);

    List<ExpenseDTO> getExpenses();
}
