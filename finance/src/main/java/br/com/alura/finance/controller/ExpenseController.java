package br.com.alura.finance.controller;

import br.com.alura.finance.model.dto.ExpenseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @GetMapping
    public ResponseEntity<String> getExpenses() {
        return ResponseEntity.ok("financiamento imobiliario");
    }

    @PostMapping
    public ResponseEntity<String> saveExpense(ExpenseDTO expenseDTO) {
        return ResponseEntity.ok("Despesa cadastrada com sucesso!");
    }
}
