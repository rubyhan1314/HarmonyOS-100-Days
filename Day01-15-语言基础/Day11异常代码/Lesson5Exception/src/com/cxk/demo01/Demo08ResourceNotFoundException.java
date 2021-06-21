package com.cxk.demo01;
public class Demo08ResourceNotFoundException {
    public static void main(String[] args) throws ResourceNotFoundException {
         ResourceManager manager = new ResourceManager();
         manager.getResource(0);
    }
}

class Resource {
    private int id;

    public Resource(int id) {
        super();
        this.id = id;
    }
}

class ResourceManager {
    public Resource getResource(int id) throws ResourceNotFoundException {
        if (id == 10) {
             new Resource(id);
        } else {
             throw new ResourceNotFoundException("Resource not found with id ::" + id);
        }
        return null;
    }
}

class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object resourId) {
        super(resourId != null ? resourId.toString() : null);
    }
}