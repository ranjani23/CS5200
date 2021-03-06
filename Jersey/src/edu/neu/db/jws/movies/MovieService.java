package edu.neu.db.jws.movies;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/movie")
public class MovieService {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Jersey");
	EntityManager em = null;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		
		em = factory.createEntityManager();
		em.getTransaction().begin();

		movies = em.createNamedQuery("findAllMovies").getResultList();
		
		em.getTransaction().commit();
		em.close();
		
		return movies;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Movie getMovie(@PathParam("id") int id) {
		Movie movie = new Movie();

		em = factory.createEntityManager();
		em.getTransaction().begin();
		
		movie = em.find(Movie.class, id);
		
		em.getTransaction().commit();
		em.close();

		return movie;
	}
}
