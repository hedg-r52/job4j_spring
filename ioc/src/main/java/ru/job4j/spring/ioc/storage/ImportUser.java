package ru.job4j.spring.ioc.storage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;
import java.util.List;

/**
 * Import user
 *
 * @author Andrei Soloviev (hedg.r52@gmail.com)
 * @version 1.0
 * @since 12.03.2020
 */
public class ImportUser {
    private final UserStorage storage;

    public ImportUser(final UserStorage storage) {
        this.storage = storage;
    }

    public void importUsers(List<User> users) {
        for (User user : users) {
            this.storage.add(user);
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context-storage.xml");
        UserStorage storage = context.getBean(UserStorage.class);
        List<User> list = Arrays.asList(new User("user#3"), new User("user#4"));
        ImportUser importUser = new ImportUser(storage);
        importUser.importUsers(list);
    }
}
