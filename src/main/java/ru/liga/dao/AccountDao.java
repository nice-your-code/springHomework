package ru.liga.dao;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.liga.domain.Account;

import java.util.ArrayList;
import java.util.List;

@Component
public interface AccountDao {
    public List<Account> getAll();
    public List<Account> getById(Long id);
    public List<Account> getByOwner(Long ownerId);
}
