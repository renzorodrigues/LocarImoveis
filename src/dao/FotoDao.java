package dao;


import java.util.List;

import dominio.Foto;

public interface FotoDao {

	public void inserirAtualizar(Foto x);
	public void excluir(Foto x);
	public Foto buscar(int x);
	public List<Foto> buscarTodos();

}
