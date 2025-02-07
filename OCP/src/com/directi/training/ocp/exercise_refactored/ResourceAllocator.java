package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {
    // private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        try {
            int resourceId = resource.findFreeSlot();
            resource.markSlotBusy(resourceId);
            return resourceId;
        } catch (Exception e) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return -1;
        }
    }

    public void free(Resource resource, int resourceId) {
        resource.markSlotFree(resourceId);
    }
}
