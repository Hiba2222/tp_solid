package com.directi.traning.isp.exercise_ref;

import java.util.Random;

public class Sensor
{
    public void register(SensingDoorInterface  door) throws Exception
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}