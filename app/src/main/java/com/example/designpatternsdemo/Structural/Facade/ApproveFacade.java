package com.example.designpatternsdemo.Structural.Facade;

public class ApproveFacade {
    public void wholeApprove() {
        new HealthOffice().approve();
        new RevenueOffice().approve();
        new SaicOffice().approve();
    }
}
