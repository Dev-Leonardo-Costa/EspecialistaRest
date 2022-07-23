package com.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.algafood.domain.model.Restaurante;
import com.algafood.domain.repository.RestauranteRepository;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Restaurante buscarPorId(Long id) {
		return manager.find(Restaurante.class, id);
	}

	@Override
	public List<Restaurante> buscarTodos() {
		return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
	}

}