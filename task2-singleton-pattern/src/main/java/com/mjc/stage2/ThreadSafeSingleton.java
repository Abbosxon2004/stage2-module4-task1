package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}


//        2) Implement Singleton design pattern.
//        For this task, you will need to implement the ThreadSafeSingleton class. Please make sure your implementation is thread safe.