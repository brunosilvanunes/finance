package br.com.alura.finance.controller;

import br.com.alura.finance.model.dto.ExpenseDTO;
import br.com.alura.finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("expense")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping
    public ResponseEntity<List<ExpenseDTO>> getExpenses() {
        return ResponseEntity.ok(service.getExpenses());
    }

    @PostMapping
    public ResponseEntity<ExpenseDTO> saveExpense(@RequestBody ExpenseDTO expenseDTO) {
        return ResponseEntity.ok(service.saveExpense(expenseDTO));
    }
}
