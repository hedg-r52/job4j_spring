package ru.job4j.spring.ioc.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Memory storage
 *
 * @author Andrei Soloviev (hedg.r52@gmail.com)
 * @version 1.0
 * @since 12.03.2020
 */
public class MemoryStorage implements Storage {
    private final List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        this.users.add(user);
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }
}
