package com.thetestingacademy.TestNG.List;

import org.testng.IExecutionListener;

public class CustomListener implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        long endTime= System.currentTimeMillis();
        System.out.println("****   *** Finished execution at- "+ endTime +"****   *** ");

    }

    @Override
    public void onExecutionFinish() {
        long startTime= System.currentTimeMillis();
        System.out.println(" ****   *** Started execution at - "+ startTime + "****   *** ");

    }
}
