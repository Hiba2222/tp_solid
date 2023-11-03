package com.directi.traning.isp.exercise_ref;

public interface TimedDoorInterface {

	void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback() throws Exception;
}
