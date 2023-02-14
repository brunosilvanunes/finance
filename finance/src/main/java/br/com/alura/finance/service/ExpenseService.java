package br.com.alura.finance.service;

import br.com.alura.finance.model.dto.ExpenseDTO;

public interface ExpenseService {

    public ExpenseDTO saveExpense(ExpenseDTO expenseDTO);
}
