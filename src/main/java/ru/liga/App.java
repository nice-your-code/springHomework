package ru.liga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.liga.config.Config;
import ru.liga.dao.AccountService;
import ru.liga.domain.Account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        accountService.printAll();
        System.out.println(accountService.getTotalVolume());
        System.out.println(accountService.getTotalOwnerVolume(1L));
        accountService.multipleAll(1.05);
        accountService.multipleOwner(1L, 2.0);
        accountService.printAll();
        //System.out.println(accountService.getTotalVolume());
        //System.out.println(accountService.getTotalOwnerVolume(1L));
        //System.out.println(accountService.getTotalOwnerVolume(2L));
    }
}
