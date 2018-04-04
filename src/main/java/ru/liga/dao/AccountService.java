package ru.liga.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.liga.domain.Account;

import java.util.List;

@Component
public class AccountService {
    AccountService(){}
    public void printAll(){
        List<Account> list = accountDao.getAll();
        for(Account account: list){
            System.out.println(account);
        }
    }
    public void multipleAll(Double multipler){
        List<Account> list = accountDao.getAll();
        for(Account account: list){
            //account = new Account(account.getId(), account.getOwnerId(), account.getName(), account.getVolume() * multipler);
            account.setVolume(account.getVolume() * multipler);
        }
    }
    public void multipleOwner(Long ownerID, Double multipler){
        List<Account> list = accountDao.getByOwner(ownerID);
        for(Account account: list){
            //account = new Account(account.getId(), account.getOwnerId(), account.getName(), account.getVolume() * multipler);
            account.setVolume(account.getVolume() * multipler);
        }
    }
    public Double getTotalVolume(){
        Double total = 0.0;
        List<Account> list = accountDao.getAll();
        for(Account account: list){
            total += account.getVolume();
        }
        return total;
    }
    public Double getTotalOwnerVolume(Long ownerId){
        Double total = 0.0;
        List<Account> list = accountDao.getByOwner(ownerId);
        for(Account account: list){
            total += account.getVolume();
        }
        return total;
    }
    @Autowired
    private AccountDao accountDao;
}
