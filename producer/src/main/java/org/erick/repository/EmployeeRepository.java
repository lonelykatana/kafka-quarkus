package org.erick.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.erick.kafka.model.Employee;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {

}
