package com.kodilla.good.patterns.challenges.hadnling;

import com.kodilla.good.patterns.challenges.order.service.InformationService;
import com.kodilla.good.patterns.challenges.order.service.User;

import java.time.LocalDateTime;

public class MailService implements InformationService {
    public void inform(User user){
        System.out.println("Mail with order information was sent to: " + user.getFirstName() + " " + user.getLastName() + ".");
    }
}
