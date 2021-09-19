package tp4_POOenJava;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String suNombre, String suDireccion) {
		this.nombre = suNombre;
		this.direccion = suDireccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto unProducto) {
		productos.add(unProducto);
	}

	public Double getPrecioTotal() {
		return productos.stream().mapToDouble(producto->producto.getPrecio()).sum();
	}
}
