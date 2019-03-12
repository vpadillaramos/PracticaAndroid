package com.vpr.practicaandroid;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conciertos")
public class Concierto {
	//Atributos
	@Id
	@GeneratedValue
    private long id;
	@Column
    private String grupos;
	@Column
    private Date fecha;
	@Column
    private String hora;
	@Column
    private float latitud;
	@Column
	private float longitud;
	@Column
    private float precio;
	@Column
    private boolean asistido;
	@Column
    private boolean cancelado;


    //Metodos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrupos() {
        return grupos;
    }

    public void setGrupos(String grupos) {
        this.grupos = grupos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public float getLatitud() {
    	return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }
    
    public float getLongitud() {
    	return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public boolean isAsistido() {
        return asistido;
    }

    public void setAsistido(boolean asistido) {
        this.asistido = asistido;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String toString(){
        return grupos;
    }
}
