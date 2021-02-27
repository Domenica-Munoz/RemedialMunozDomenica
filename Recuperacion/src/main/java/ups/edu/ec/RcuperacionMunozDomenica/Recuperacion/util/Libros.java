package ups.edu.ec.RcuperacionMunozDomenica.Recuperacion.util;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



public class Libros {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;
	private String nombre;
	private String cantidad;
	private String precio;
	private String total;
	private String Categoria;
	
	
	@OneToOne
    @JoinColumn(name = "categorias", referencedColumnName = "libros")
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinColumn(name = "libros")
    private List<Libros> libros;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	@Override
	public String toString() {
		return "Libros [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + ", Categoria=" + Categoria + "]";
	}
	
	
	
	
	
	
	
	

}
