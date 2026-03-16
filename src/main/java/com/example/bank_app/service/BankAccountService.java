package com.example.bank_app.service;


import com.example.bank_app.model.BankAccount;
import com.example.bank_app.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {
    private final BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public BankAccount createAccount(BankAccount account) {
        return bankAccountRepository.save(account);
    }
    public BankAccount getAccount(Long id) {
        return bankAccountRepository.findById(id).orElse(null);
    }
    public BankAccount deposit(Long id, Double amount) {

        BankAccount account = bankAccountRepository.findById(id).orElseThrow();

        account.setBalance(account.getBalance() + amount);

        return bankAccountRepository.save(account);
    }
    public BankAccount withdraw(Long id, Double amount) {

        BankAccount account = bankAccountRepository.findById(id).orElseThrow();

        if(account.getBalance() < amount){
            throw new RuntimeException("Insufficient balance");
        }

        account.setBalance(account.getBalance() - amount);

        return bankAccountRepository.save(account);
    }
}
