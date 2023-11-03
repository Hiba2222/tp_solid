package com.directi.traning.isp.exercise_ref;

public interface SensingDoorInterface {
	
	void lock();

    void unlock();

    void open();

    void close();

    void proximityCallback() throws Exception;

}
