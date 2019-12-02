/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleClass;
import entidades.Aluno;
import entidades.Livro;
import javax.swing.table.AbstractTableModel;
import interFacesClass.InterfaceAluguel;
import entidades.aluguelLivro;
import repositorio.RepositorioAluguelLivro;
import java.util.List;
/**
 *
 * @author Paulo Victor
 */
public class ControleAluguelLivro extends  AbstractTableModel{
    private static InterfaceAluguel repositorioAluguel;
    private ControleLivro estoque = new ControleLivro();
    
    public ControleAluguelLivro(){
        synchronized(InterfaceAluguel.class){
            if(repositorioAluguel == null){
                repositorioAluguel = new RepositorioAluguelLivro();
            }
        }
    }    
    @Override
    public int getRowCount() {
        return repositorioAluguel.getRowCount();
    }

    @Override
    public int getColumnCount() {
        return repositorioAluguel.getColumnCount();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
   public String getColumnName(int column) {
       return repositorioAluguel.getColumnName(column);
   }
   public List<Livro> getSelectValue(int matricula){
       aluguelLivro aa = repositorioAluguel.getSelectedValue(matricula);
       List<Livro> listaLivro = aa.getListaLivro();
       return listaLivro;
   }
   public boolean addRow(aluguelLivro alu){
       repositorioAluguel.addRow(alu);
       return  true;
   }
   public boolean adicionarAluguel(Aluno varAluno,int varLimite, Livro varLivro){
       return repositorioAluguel.adicionarAluguel(varAluno, varLimite, varLivro);
   }
   public boolean  removerAluguel(Aluno varAluno, Livro varLivro){
       /*boolean conf = false;
       if(estoque.estoqueDisponivel(varLivro) && repositorioAluguel.setListarLivroAlunoRemover(varAluno, varLivro)){
           conf = true;
       }*/       
       int valor = varLivro.getQuantidadesDisponivel() + 1;
       varLivro.setQuantidadesDisponivel(valor);
       return repositorioAluguel.setListarLivroAlunoRemover(varAluno, varLivro);
   }
   public int valorLivrosPegos(Aluno a){
       int valor = 0;
       for(int i =0;i<repositorioAluguel.getValueAt().size();i++){
           if(repositorioAluguel.getValueAt().get(i).getAluno() == a){
               valor = repositorioAluguel.getValueAt().get(i).getListaLivro().size();               
           }
       }
       return valor;
   }   
}
