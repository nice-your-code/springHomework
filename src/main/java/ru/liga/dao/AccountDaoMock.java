package ru.liga.dao;

import org.springframework.stereotype.Component;
import ru.liga.domain.Account;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDaoMock {
    public AccountDaoMock(){
        listAccounts = new ArrayList<Account>();
        listAccounts.add(new Account(1L, 1L, "Sasha", 100.0));
        listAccounts.add(new Account(2L, 1L, "SashaCool", 120.0));
        listAccounts.add(new Account(3L, 2L, "Ivan", 500.0));
    }
    public List<Account> getData(){
        return listAccounts;
    }
    private List<Account> listAccounts;
}
