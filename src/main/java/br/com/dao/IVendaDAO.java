/**
 * 
 */
package main.java.br.com.dao;


import main.java.br.com.dao.generic.IGenericDAO;
import main.java.br.com.domain.Venda;
import main.java.br.com.exceptions.DAOException;
import main.java.br.com.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
