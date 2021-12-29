package com.sofka.biblioteca.repository;

import com.sofka.biblioteca.model.Recurso;
import com.sofka.biblioteca.utils.Area;
import com.sofka.biblioteca.utils.Tipo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface RepositorioRecurso extends MongoRepository<Recurso, String> {

}
