/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interFacesClass;

import entidades.Livro;
import java.util.List;

/**
 *
 * @author Paulo Victor
 */
public interface InterfaceLivro {
    public int getRowCountLivro();
    public int getColumnCountLivro();
    public String getColumnNameLivro(int column);
    public List<Livro> getValueAtLivro();
    public List<Livro> setValueAtLisvro();
    public void addRowLivro(Livro livroLista);
    public void removeRowLivro(int linha);
    public Livro getSelectedValue(int index);
    public boolean editarLivro(int index, Livro livroEditar);
}
