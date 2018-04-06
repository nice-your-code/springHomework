package ru.liga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.liga.dao.AccountDao;
import ru.liga.domain.Account;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    AccountService(){}

    public void printAll(){
        accountDao
                .getAll()
                .forEach(System.out::println);
    }

    public void multipleAll(Double multipler){
        accountDao
                .getAll()
                .forEach(account -> account.setVolume(account.getVolume() * multipler));
    }

    public void multipleOwner(Long ownerID, Double multipler){
        accountDao
                .getByOwner(ownerID)
                .forEach(account -> account.setVolume(account.getVolume() * multipler));
    }

    public Double getTotalVolume(){
        return accountDao
                .getAll()
                .stream()
                .mapToDouble(Account::getVolume)
                .sum();
    }

    public Double getTotalOwnerVolume(Long ownerId){
        return accountDao
                .getByOwner(ownerId)
                .stream()
                .mapToDouble(Account::getVolume)
                .sum();
    }
}
