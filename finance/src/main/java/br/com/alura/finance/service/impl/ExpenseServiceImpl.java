package br.com.alura.finance.service.impl;

import br.com.alura.finance.mapstruct.ExpenseMapper;
import br.com.alura.finance.model.ExpenseEntity;
import br.com.alura.finance.model.dto.ExpenseDTO;
import br.com.alura.finance.repository.ExpenseRepository;
import br.com.alura.finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    @Override
    public void saveExpense(ExpenseDTO expenseDTO) {
        repository.save(ExpenseMapper.INSTANCE.saveDTOToEntity(expenseDTO));
    }

    @Override
    public List<ExpenseDTO> getExpenses() {
        List<ExpenseEntity> entities = repository.findAll();

        return entities.stream()
                .map(ExpenseMapper.INSTANCE::dtoToEntity)
                .collect(Collectors.toList());
    }
}
