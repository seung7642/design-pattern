package com.neowiz;

import com.neowiz.command.impl.LightOffCommand;
import com.neowiz.command.impl.LightOnCommand;
import com.neowiz.domain.Light;
import com.neowiz.invoker.RemoteControl;

public class Main {

    public static void main(String[] args) {
        // 리모컨에 대한 invoker 객체
        RemoteControl remoteControl = new RemoteControl();

        // receiver 객체
        Light livingRoomLight = new Light("Living Room");

        // command 객체
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        /**************************************************************************/
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }
}
