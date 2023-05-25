package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
public class hotels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHotels;
    @Column(name = "nombre",length =60,nullable = false )
    private String nombre;
    @Column(name = "precio_noche",length =5,nullable = false )
    private String precio_noche;
    @Column( name = "ciudad",length = 60, nullable = false)
    private String ciudad;
    @Column(name = "valoracion_promedio",length =4,nullable = false )
    private String valoracion_promedio;
    @Column(name = "estrellas",length = 1,nullable = false)
    private int estrellas;

    public hotels() {
    }

    public hotels(int idHotels, String nombre, String precio_noche, String ciudad, String valoracion_promedio, int estrellas) {
        this.idHotels = idHotels;
        this.nombre = nombre;
        this.precio_noche = precio_noche;
        this.ciudad = ciudad;
        this.valoracion_promedio = valoracion_promedio;
        this.estrellas = estrellas;
    }

    public int getIdHotels() {
        return idHotels;
    }

    public void setIdHotels(int idHotels) {
        this.idHotels = idHotels;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(String precio_noche) {
        this.precio_noche = precio_noche;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getValoracion_promedio() {
        return valoracion_promedio;
    }

    public void setValoracion_promedio(String valoracion_promedio) {
        this.valoracion_promedio = valoracion_promedio;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
}