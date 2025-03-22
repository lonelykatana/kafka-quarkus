package org.erick.kafka.model;

public enum LevelEnum {
    A {
        @Override
        public Double calculateBonus(Integer sales, Integer salary) {
            return sales * salary * 0.5;
        }
    }, B {
        @Override
        public Double calculateBonus(Integer sales, Integer salary) {
            return sales * salary * 0.4;
        }
    }, C {
        @Override
        public Double calculateBonus(Integer sales, Integer salary) {
            return sales * salary * 0.2;
        }
    };

    public abstract Double calculateBonus(Integer sales, Integer salary);

}
