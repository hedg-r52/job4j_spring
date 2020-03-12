package ru.job4j.spring.ioc.storage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User storage
 *
 * @author Andrei Soloviev (hedg.r52@gmail.com)
 * @version 1.0
 * @since 12.03.2020
 */
@Component
public class UserStorage {
    private Storage storage;

    @Autowired
    public UserStorage(Storage storage) {
        this.storage = storage;
    }

    public void add(User user) {
        this.storage.add(user);
    }

    public List<User> findAll() {
        return this.storage.findAll();
    }
}
