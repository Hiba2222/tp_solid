package com.directi.training.ocp.exercise_ref;

public class ResourceAllocator {
	
	public int allocate(Resource resource) {
        return resource.allocate();
    }

    public void free(Resource resource) {
        resource.free();
    }

}