package com.spring.plietnov.task.db;

import com.spring.plietnov.task.entity.*;
import com.spring.plietnov.task.repository.EmployeeRepository;
import com.spring.plietnov.task.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository,
                                   OrderRepository orderRepository) {
        orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
        orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));
        orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
