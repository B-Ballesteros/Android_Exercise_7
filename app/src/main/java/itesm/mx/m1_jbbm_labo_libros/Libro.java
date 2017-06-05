package itesm.mx.m1_jbbm_labo_libros;

/**
 * Created by benji on 11/02/17.
 */

public class Libro {

    private String titulo;
    private String isbn;
    private String fechaPublicacion;
    private int idImagen;

    //region Constructor
    public Libro(String titulo, String isbn, String fechaPublicacion, int idImagen){
        this.titulo = titulo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.idImagen = idImagen;
    }
    //endregion

    //region Getters & Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion  = fechaPublicacion;
    }
    public String getFechaPublicacion() { return fechaPublicacion; }

    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getIsbn() { return isbn; }

    public void setIdImagen(int idImagen) { this.idImagen = idImagen; }
    public int getIdImagen() { return  idImagen; }
    //endregion

}
