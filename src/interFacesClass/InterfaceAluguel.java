/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interFacesClass;
import entidades.Aluno;
import entidades.Livro;
import entidades.aluguelLivro;
import java.util.List;
/**
 *
 * @author Paulo Victor
 */
public interface InterfaceAluguel {
    
    public int getRowCount();
    public int getColumnCount();
    public String getColumnName(int column);
    public List<aluguelLivro> getValueAt();

    public List<aluguelLivro> setValueAt();
    public void addRow(aluguelLivro aluguel);
    public void removeRow(int linha);     
    public aluguelLivro getSelectedValue(int a);

    @Override
    public boolean equals(Object obj);
    
    //////////
    public boolean adicionarAluguel(Aluno varAluno,int varLimite, Livro varLivro);
    public boolean setListarLivroAlunoRemover(Aluno varAluno, Livro varLivro);
    
}
