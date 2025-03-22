package org.erick.kafka.model;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class EmployeeDeserializer extends ObjectMapperDeserializer<Employee> {
    public EmployeeDeserializer() {
        super(Employee.class);
    }
}
