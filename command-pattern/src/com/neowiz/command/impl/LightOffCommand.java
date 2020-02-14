package com.neowiz.command.impl;

import com.neowiz.command.Command;
import com.neowiz.domain.Light;

/**
 * command 객체
 */
public class LightOffCommand implements Command {

    Light light; // Receiver 객체

    public LightOffCommand(Light light) { this.light = light; }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {

    }
}
