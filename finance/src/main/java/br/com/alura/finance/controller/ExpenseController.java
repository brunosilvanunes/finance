package br.com.alura.finance.controller;

import br.com.alura.finance.model.dto.ExpenseDTO;
import br.com.alura.finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping
    public ResponseEntity<String> getExpenses() {
        return ResponseEntity.ok("financiamento imobiliario");
    }

    @PostMapping
    public ResponseEntity<ExpenseDTO> saveExpense(ExpenseDTO expenseDTO) {
        return ResponseEntity.ok(service.saveExpense(expenseDTO));
    }
}
