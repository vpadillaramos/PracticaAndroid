package com.vpr.practicaandroid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConciertoController {
	
	@Autowired
	private ConciertoRepository rep;
	
	/**
	 * Obtiene todos los conciertos almacenados
	 * @return List<Concierto>
	 */
	@RequestMapping("/conciertos")
	public List<Concierto> getConciertos(){
		return rep.findAll();
	}
	
	@RequestMapping("/guardar_concierto")
	public void guardarConcierto(String grupos, String fecha, String hora, float latitud,
			float longitud, float precio, boolean asistido, boolean cancelado) {
		
		
		try {
			
			// Creo el objeto
			Concierto concierto = new Concierto();
			concierto.setGrupos(grupos);
			concierto.setFecha(parsearFecha(fecha));
			concierto.setHora(hora);
			concierto.setLatitud(latitud);
			concierto.setLongitud(longitud);
			concierto.setPrecio(precio);
			concierto.setAsistido(asistido);
			concierto.setCancelado(cancelado);
			
			// Guardo el concierto
			rep.save(concierto);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
     * Metodo para obtener una fecha Date de una DB pasado como String
     * @param fecha String
     * @return fecha Date
     * @throws ParseException
     */
    public static Date parsearFecha(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return sdf.parse(fecha);
    }
}
