package ups.edu.ec.RcuperacionMunozDomenica.Recuperacion;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.Dao.CategrioaDao;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.Dao.LibrosDao;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Autor;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Categoria;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Libros;

@Stateless
public class LibroON {
	
	@Inject
	EntityManager em;
	
	@Inject
	private LibrosDao librodao;
	@Inject
	private CategrioaDao categriadao;
	
	
	
	public List<Libros> listarlibros(){
	
		return librodao.mostrar();
		
		
	}
	
	public List<Categoria> listarCategoria(){
		return categriadao.mostrar();
		
	}
	
	public void insert (Autor au) {
		  String jpql= "select Autores From  aut where aut.nombre = :nombre";
			Query query = em.createQuery(jpql,	Autor.class);
			query.setParameter("numero", au);
			Autor autor = (Autor) query.getSingleResult();
			au.getNombre();
	}
	
	public void insertca(Categoria ca) {
		  String jpql= "select Categoria From  ca where ca.nombre = :nombre";
			Query query = em.createQuery(jpql,	Categoria.class);
			query.setParameter("numero", ca);
			Categoria cate = (Categoria) query.getSingleResult();
			cate.getNombre();
		
	}
  
}
