package ru.liga.dao;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.liga.domain.Account;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDao {
    AccountDao(){

    }
    public List<Account> getAll(){
        return accountDaoMock.getData();
    }
    public List<Account> getById(Long id){
        List<Account> list = new ArrayList<Account>();
        List<Account> listAll = getAll();
        for(Account account: listAll){
            if(account.getId() == id){
                list.add(account);
            }
        }
        return list;
    }
    public List<Account> getByOwner(Long ownerId){
        List<Account> list = new ArrayList<Account>();
        List<Account> listAll = getAll();
        for(Account account: listAll){
            if(account.getOwnerId() == ownerId){
                list.add(account);
            }
        }
        return list;
    }
    @Autowired
    private AccountDaoMock accountDaoMock;
}
