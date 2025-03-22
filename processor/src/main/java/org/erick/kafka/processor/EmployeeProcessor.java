package org.erick.kafka.processor;

import io.smallrye.common.annotation.Blocking;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.erick.kafka.model.Employee;

@ApplicationScoped
public class EmployeeProcessor {

    @Incoming("request")
    @Outgoing("employee")
    @Blocking
    public Employee process(Employee data) {
        if (data.getSalary() != null & data.getSales() != null)
            data.setBonus(data.getLevel().calculateBonus(data.getSales(), data.getSalary()));
        return data;
    }
}
