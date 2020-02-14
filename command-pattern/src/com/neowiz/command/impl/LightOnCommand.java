package com.neowiz.command.impl;

import com.neowiz.command.Command;
import com.neowiz.domain.Light;

/**
 * command 객체
 */
public class LightOnCommand implements Command {

    Light light; // Receiver 객체

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
