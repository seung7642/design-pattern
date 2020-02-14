package com.neowiz.command;

/**
 * 모든 커맨드 객체에서 구현해야하는 인터페이스.
 */
public interface Command {

    void execute();

    void undo();
}
