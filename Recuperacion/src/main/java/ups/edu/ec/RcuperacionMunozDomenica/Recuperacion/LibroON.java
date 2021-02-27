package ups.edu.ec.RcuperacionMunozDomenica.Recuperacion;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.Dao.LibrosDao;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Libros;

@Stateless
public class LibroON {
	
	@Inject
	EntityManager em;
	
	@Inject
	private LibrosDao librodao;
	
	
	
	public List<Libros> listarlibros(Libros li){
		librodao.insertar(li);
		return null;
		
		
	}
	
	
	
	

}
