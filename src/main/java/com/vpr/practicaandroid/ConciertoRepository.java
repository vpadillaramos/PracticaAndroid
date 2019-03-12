package com.vpr.practicaandroid;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ConciertoRepository extends CrudRepository<Concierto, Integer>{
	
	List<Concierto> findAll();
	Concierto findByGrupos(String grupos);
}
