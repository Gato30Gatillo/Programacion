package iesjandula.proyectounidad4.ejercicio45Extendido;

import java.util.Objects;

public abstract class Libro implements Comparable <Libro> {

	private String titulo;
	private String autor;
	private int anoPublicacion;
	private String editorial;
	private String referenciaBibliografica;
	private EnumLibro tipoLibro;
	
	public abstract EnumLibro tipoLibro();
	
	Libro(){
		
	}
	
	Libro(String titulo, String autor, int anoPublicacion, String editorial, 
			String referenciaBibliografica, EnumLibro tipoLibro){
		this.titulo=titulo;
		this.autor=autor;
		this.anoPublicacion=anoPublicacion;
		this.editorial=editorial;
		this.referenciaBibliografica=referenciaBibliografica;
		this.tipoLibro=tipoLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public String getReferenciaBibliografica() {
		return referenciaBibliografica;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setReferenciaBibliografica(String referenciaBibliografica) {
		this.referenciaBibliografica = referenciaBibliografica;
	}

	public EnumLibro getTipoLibro() {
		return tipoLibro;
	}

	public void setTipoLibro(EnumLibro tipoLibro) {
		this.tipoLibro = tipoLibro;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + ", editorial="
				+ editorial + ", referenciaBibliografica=" + referenciaBibliografica + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoPublicacion, autor, editorial, referenciaBibliografica, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return anoPublicacion == other.anoPublicacion && Objects.equals(autor, other.autor)
				&& Objects.equals(editorial, other.editorial)
				&& Objects.equals(referenciaBibliografica, other.referenciaBibliografica)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		int compare;
		compare=referenciaBibliografica.compareTo(o.getReferenciaBibliografica());
		return compare;
	}
}
