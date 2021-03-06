package edu.neu.db.jws.lecture;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/developer")
public class MyWebService {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Jersey");
	EntityManager em = null;
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Developer> getAllDevelopers() {
		List<Developer> developers = new ArrayList<Developer>();		
		em = factory.createEntityManager();
		em.getTransaction().begin();
		developers = em.createNamedQuery("findAllDevelopers").getResultList();
		em.getTransaction().commit();
		em.close();
		return developers;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Developer getDeveloperById(@PathParam("id") int id) {
		Developer developer = null;
		em = factory.createEntityManager();
		em.getTransaction().begin();
		developer = em.find(Developer.class, id);
		em.getTransaction().commit();
		em.close();
		return developer;
	}
	@GET
	@Path("/")
	public void createDeveloperQueryString(@QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName) {
		Developer developer = new Developer();
		developer.setFirstName(firstName);
		developer.setLastName(lastName);
		em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(developer);
		em.getTransaction().commit();
		em.close();
	}
	
	@POST
	@Path("/")
	public void createDeveloper(@FormParam("firstName") String firstName, @FormParam("lastName") String lastName) {
		Developer developer = new Developer();
		developer.setFirstName(firstName);
		developer.setLastName(lastName);
		em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(developer);
		em.getTransaction().commit();
		em.close();
	}
}
