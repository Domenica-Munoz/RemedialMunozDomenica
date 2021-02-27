package ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.Dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Categoria;


public class CategrioaDao {
	
	
	@Inject
	EntityManager em;
	
	
	
	public void insertar(Categoria categoria) {
		em.persist(categoria);
		
		}
	
  public Categoria buscar(int id) {
	  String jpql= "select li From Libros li where li.codigo = :id";
		Query query = em.createQuery(jpql,	Categoria.class);
		query.setParameter("numero", id);
		Categoria categria = (Categoria) query.getSingleResult();
		
		return categria;
	  
		
	}
 public void actualizar(Categoria categ) {
	 em.persist(categ);
	
}
 
 public List<Categoria>mostrar(){
	 String jpql = "select cre from PolizaPres cre";
		Query query = em.createQuery(jpql, Categoria.class);
		List<Categoria> categria= query.getResultList();
		for (Categoria cate : categria ) {
			cate.getNombre();
		}
		return categria;
 }
}
