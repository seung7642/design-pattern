package com.pangtrue.decorator;

import com.pangtrue.Window;

public class VerticalScrollBarDecorator extends WindowDecorator {

    public VerticalScrollBarDecorator (Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw() {
        drawVerticalScrollBar();
        decoratedWindow.draw();
    }

    private void drawVerticalScrollBar() {
        // draw the vertical scrollbar
    }

    @Override
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }
}