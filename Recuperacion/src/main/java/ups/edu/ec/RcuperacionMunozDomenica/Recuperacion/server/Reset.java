package ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.server;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.LibroON;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Autor;
import ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util.Libros;
 
@Path("/lib")
public class Reset {
	
	@Inject
	private LibroON lion;
	
	@POST
	@Path("/aut")
	@Produces("application/json")
	@Consumes("application/json")
	public Autor libro(Libros li) {
		Autor a=new Autor();
		
		return a;
		
	}
	
	
	

}
