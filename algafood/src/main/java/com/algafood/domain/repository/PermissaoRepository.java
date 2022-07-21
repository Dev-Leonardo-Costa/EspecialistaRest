package com.algafood.domain.repository;

import java.util.List;

import com.algafood.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> buscarTodas();
	Permissao buscarPorId(Long id);
	Permissao adicionar(Permissao permissao);
	void remover(Permissao permissao);
	
}