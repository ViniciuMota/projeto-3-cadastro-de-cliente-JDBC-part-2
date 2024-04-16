package main.java.br.com.services;

import main.java.br.com.dao.IProdutoDAO;
import main.java.br.com.domain.Produto;
import main.java.br.com.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
