package com.directi.training.ocp.exercise_ref;

public abstract class Resource {
	
	protected int resourceId;

    public int getResourceID() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public abstract int allocate();

    public abstract void free();
}