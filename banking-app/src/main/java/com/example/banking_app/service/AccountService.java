package com.example.banking_app.service;

import com.example.banking_app.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long Id);

    AccountDto deposit(Long Id, double amount);

    AccountDto withdraw(Long Id, double amount);

    List<AccountDto> getAllAccount();

    void deleteAccount(Long Id);
}
