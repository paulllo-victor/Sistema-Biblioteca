/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import entidades.Livro;
import interFacesClass.InterfaceLivro;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Paulo Victor
 */
public class RepositorioLivro implements InterfaceLivro {
    private List<Livro> repositorioLivro = new ArrayList<>();
    //private String[] colunas = {"Autor","Editora","Edicao","Volume","Genero","NumeroPaginas","IdLivro","Titulo"};
    private String[] colunas = {"Titulo", "Quantidade Disponiveis"};
    @Override
    public int getRowCountLivro() {
        return repositorioLivro.size();
    }

    @Override
    public int getColumnCountLivro() {
        return colunas.length;
    }

    @Override
    public String getColumnNameLivro(int column) {
       return colunas[column];
    }

    @Override
    public List<Livro> getValueAtLivro() {
        return repositorioLivro;
    }

    @Override
    public List<Livro> setValueAtLisvro() {
        return repositorioLivro;
    }

    @Override
    public void addRowLivro(Livro livroLista) {
        repositorioLivro.add(livroLista);
    }

    @Override
    public void removeRowLivro(int linha) {
        repositorioLivro.remove(linha);
    }

    @Override
    public Livro getSelectedValue(int index) {
           return repositorioLivro.get(index);
    }

    @Override
    public boolean editarLivro(int index, Livro livroEditar) {
        repositorioLivro.set(index, livroEditar);
        return true;
    }
    
    
}
