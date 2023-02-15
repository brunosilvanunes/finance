package br.com.alura.finance.service.impl;

import br.com.alura.finance.model.ExpenseEntity;
import br.com.alura.finance.model.dto.ExpenseDTO;
import br.com.alura.finance.repository.ExpenseRepository;
import br.com.alura.finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    @Override
    public ExpenseDTO saveExpense(ExpenseDTO expenseDTO) {
        ExpenseEntity entity = new ExpenseEntity();

        entity.setKey(expenseDTO.getKey());
        entity.setValue(expenseDTO.getValue());
        entity.setCreatedDate(expenseDTO.getCreatedDate());
        entity.setEndDate(expenseDTO.getEndDate());

        repository.save(entity);

        return expenseDTO;
    }
}
