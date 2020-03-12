package ru.job4j.spring.ioc.storage;

import java.util.List;

/**
 * Storage interface
 *
 * @author Andrei Soloviev (hedg.r52@gmail.com)
 * @version 1.0
 * @since 12.03.2020
 */
public interface Storage {
    void add(User user);
    List<User> findAll();
}
