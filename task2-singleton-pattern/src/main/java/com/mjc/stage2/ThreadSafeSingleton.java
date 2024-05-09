package com.mjc.stage2;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public synchronized ThreadSafeSingleton getInstance() {

        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }
}
