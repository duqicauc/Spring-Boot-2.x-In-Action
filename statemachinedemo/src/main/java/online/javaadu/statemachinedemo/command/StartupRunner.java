package online.javaadu.statemachinedemo.command;

import javax.annotation.Resource;

import online.javaadu.statemachinedemo.statemachine.Events;
import online.javaadu.statemachinedemo.statemachine.States;
import org.springframework.boot.CommandLineRunner;
import org.springframework.statemachine.StateMachine;

public class StartupRunner implements CommandLineRunner {

    @Resource
    StateMachine<States, Events> stateMachine;

    @Override
    public void run(String... args) throws Exception {
        stateMachine.start();
        stateMachine.sendEvent(Events.ONLINE);
        stateMachine.sendEvent(Events.PUBLISH);
        stateMachine.sendEvent(Events.ROLLBACK);
    }
}
