package com.uca.capas.tarea_labo4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
    @AssertTrue(message = "Eres robot")
    private Boolean soyRobot;

    public Robot(){}

    public Robot(Boolean soyRobot) {
        this.soyRobot = soyRobot;
    }

    public Boolean getSoyRobot() {
        return soyRobot;
    }

    public void setSoyRobot(Boolean soyRobot) {
        this.soyRobot = soyRobot;
    }
}
