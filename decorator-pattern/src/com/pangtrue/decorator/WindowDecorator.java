package com.pangtrue.decorator;

import com.pangtrue.Window;

abstract class WindowDecorator implements Window {

    protected Window decoratedWindow; // the Window being decorated

    public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
}
