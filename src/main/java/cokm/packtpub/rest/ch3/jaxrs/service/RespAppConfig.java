package cokm.packtpub.rest.ch3.jaxrs.service;

import cokm.packtpub.rest.ch3.service.DepartmentService;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("webresources")
public class RespAppConfig extends Application{

    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resource = new HashSet<>();
        resource.add(DepartmentService.class);
        return resource;
    }
}
