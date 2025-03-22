package org.erick.kafka.model;

public class Employee {

    private String name;
    private LevelEnum level;
    private Integer sales;
    private Integer salary;
    private Double bonus;

    public Employee() {
    }

    public Employee(String name, LevelEnum level, Integer sales, Integer salary, Double bonus) {
        this.name = name;
        this.level = level;
        this.sales = sales;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
