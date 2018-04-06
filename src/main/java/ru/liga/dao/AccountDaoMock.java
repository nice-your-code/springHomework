package ru.liga.dao;

import org.springframework.stereotype.Component;
import ru.liga.domain.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class AccountDaoMock implements AccountDao{
    private List<Account> listAccounts;

    public AccountDaoMock(){
        listAccounts = new ArrayList<Account>();
        listAccounts.add(new Account(1L, 1L, "Sasha", 100.0));
        listAccounts.add(new Account(2L, 1L, "SashaCool", 120.0));
        listAccounts.add(new Account(3L, 2L, "Ivan", 500.0));
    }

    public List<Account> getAll(){
        return listAccounts;
    }

    public List<Account> getById(Long id) {
        return getAll()
                .stream()
                .filter(account -> Objects.equals(account.getId(), id))
                .collect(Collectors.toList());
    }

    public List<Account> getByOwner(Long ownerId){
        return getAll()
                .stream()
                .filter(account -> Objects.equals(account.getOwnerId(), ownerId))
                .collect(Collectors.toList());
    }
}
