package com.directi.traning.isp.exercise_ref;

public class SensingDoor implements SensingDoorInterface {

	private boolean _locked;
	@SuppressWarnings("unused")
	private boolean _opened;

	public SensingDoor(Sensor sensor) throws Exception {
		sensor.register(this);
	}

	@Override
	public void lock() {
		_locked = true;
	}

	@Override
	public void unlock() {
		_locked = false;
	}

	@Override
	public void open() {
		if (!_locked) {
			_opened = true;
		}
	}

	@Override
	public void close() {
		_opened = false;
	}

	@Override
	public void proximityCallback() throws Exception {
		_opened = true;
	}

}
