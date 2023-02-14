package br.com.alura.finance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseEntity {
    private Long id;
    private String key;
    private BigDecimal value;
    private LocalDateTime createdDate;
    private LocalDateTime endDate;
}
