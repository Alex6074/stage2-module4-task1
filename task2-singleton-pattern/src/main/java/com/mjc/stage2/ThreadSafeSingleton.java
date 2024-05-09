package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ThreadSafeSingleton();
                }
            }
        }
        return localInstance;
    }
}
