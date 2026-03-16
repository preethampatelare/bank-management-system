package com.example.bank_app.Controllers;

import com.example.bank_app.model.BankAccount;
import com.example.bank_app.service.BankAccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class BankAccountController {
    private final BankAccountService bankAccountService;
    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
    @PostMapping
    public BankAccount createAccount(@RequestBody BankAccount account) {
        return bankAccountService.createAccount(account);
    }
    @GetMapping("/{id}")
    public BankAccount getAccount(@PathVariable Long id){
        return bankAccountService.getAccount(id);
    }

    @PostMapping("/{id}/deposit")
    public BankAccount deposit(@PathVariable Long id,@RequestParam Double amount){
        return bankAccountService.deposit(id,amount);
    }

    @PostMapping("/{id}/withdraw")
    public BankAccount withdraw(@PathVariable Long id,@RequestParam Double amount){
        return bankAccountService.withdraw(id,amount);
    }
}
