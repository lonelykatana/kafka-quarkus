package org.erick.kafka.producer;

import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.erick.kafka.model.Employee;
import org.erick.repository.EmployeeRepository;

@Path("/employee")
public class EmployeeResource {

    @Inject
    EmployeeRepository employeeRepository;

    @Channel("employee-request")
    Emitter<Employee> employeeRequestEmitter;

    @POST
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee createEmployee(Employee data) {
        employeeRequestEmitter.send(data);
        return data;
    }

    @Incoming("employee")
    @Blocking
    @Transactional
    public void updateEmployee(Employee data) {
        Employee employee = new Employee();
        employee.setBonus(data.getBonus());
        employee.setLevel(data.getLevel());
        employee.setName(data.getName());
        employee.setSalary(data.getSalary());
        employee.setSales(data.getSales());
        employeeRepository.persist(employee);

    }
}
