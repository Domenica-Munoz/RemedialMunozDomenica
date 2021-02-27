package ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.Dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.app.g2.cooperativaUnion.EN.PolizaPres;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Libros;

public class LibrosDao {
	
	@Inject
	EntityManager em;
	
	
	public void insertar(Libros libro) {
		em.persist(libro);
		
		}
	
  public Libros buscar(int id) {
	  String jpql= "select li From Libros li where li.codigo = :id";
		Query query = em.createQuery(jpql,Libros.class);
		query.setParameter("numero", id);
		Libros libros = (Libros) query.getSingleResult();
		
		return libros;
	  
		
	}
 public void actualizar(Libros libro) {
	 em.persist(libro);
	
}
 
 public List<Libros>mostrar(){
	 
	 String jpql = "select cre from PolizaPres cre";
		Query query = em.createQuery(jpql, Libros.class);
		List<Libros> libros= query.getResultList();
		for (Libros libro : libros ) {
			
		}
		return libros;
	
 }

}
