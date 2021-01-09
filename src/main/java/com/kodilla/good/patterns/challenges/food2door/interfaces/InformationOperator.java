package com.kodilla.good.patterns.challenges.food2door.interfaces;

import com.kodilla.good.patterns.challenges.food2door.service.Operator;

import java.time.LocalDateTime;

public interface InformationOperator {
    void inform(Operator operator, LocalDateTime orderDate, LocalDateTime deliveryDate);
}
