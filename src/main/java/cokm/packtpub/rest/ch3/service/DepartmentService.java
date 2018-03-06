package cokm.packtpub.rest.ch3.service;

import cokm.packtpub.rest.ch3.model.Departments;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("departments")
@Stateless
public class DepartmentService {

    @PersistenceContext(unitName = "com.packtpub_rest-chapter3-service_war_1.0-SNAPSHOTPU")
    private EntityManager entityManager;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Departments> findAllDepartments(){
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Departments.class));
        List<Departments> departments = entityManager.createQuery(cq).getResultList();
        return departments;
    }
    
    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloWorld(){
        return "Hello World";
    }
}
