/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleClass;
import javax.swing.table.AbstractTableModel;
import interFacesClass.InterfaceLivro;
import java.util.List;
import repositorio.RepositorioLivro;
import entidades.Livro;
/**
 *
 * @author Paulo Victor
 */
public class ControleLivro extends AbstractTableModel{
    private static InterfaceLivro  repositorioLivro;
    
    public ControleLivro(){
        synchronized(InterfaceLivro.class){
            if(repositorioLivro == null){
                repositorioLivro = new RepositorioLivro();
            }
        }
    }
    
    @Override
    public int getRowCount() {
        return repositorioLivro.getRowCountLivro();
    }

    @Override
    public int getColumnCount() {
        return repositorioLivro.getColumnCountLivro();
    }
    public Object getValueAt(int linhas, int colunas) {
           List<Livro> dbLivro = repositorioLivro.getValueAtLivro();
           switch(colunas){
               case 0:
                   return dbLivro.get(linhas).getTitulo();
               case 1:
                   return dbLivro.get(linhas).getQuantidadesDisponivel();
           }
           return null;
    }
    public String getColumnName(int column) {
        return repositorioLivro.getColumnNameLivro(column);
        
    }    
    public boolean addRow(Livro livroNv){
       boolean conf = false;
       for(int i=0;i<repositorioLivro.getValueAtLivro().size();i++){
           String ti= repositorioLivro.getValueAtLivro().get(i).getTitulo();
           if(ti.equals(livroNv.getTitulo())){
               conf = true;
           }
       }
       if(conf == false){         
       repositorioLivro.addRowLivro(livroNv);        
       }
       this.fireTableDataChanged(); 
       return conf;      
   }
    public boolean removeRow(int linha){
       repositorioLivro.removeRowLivro(linha);
       this.fireTableDataChanged();
       return true;
   }
    /*public void setValueAt(Object valor, int linha, int coluna) {
        List<Livro> dbLivro = repositorioLivro.setValueAtLisvro();
        
        switch(coluna){
            case 0:
                dbLivro.get(linha).setAutor((String) valor);
                break;
            case 1:
                dbLivro.get(linha).setEditora((String)valor);
                break;
            case 2:
                dbLivro.get(linha).setEdicao(Integer.parseInt((String) valor));
                break;
            case 3:
                dbLivro.get(linha).setVolume(Integer.parseInt((String) valor));
                break;
            case 4:
                dbLivro.get(linha).setGenero((String) valor);
                break;    
            case 5:
                dbLivro.get(linha).setQuantidadesDisponivel(Integer.parseInt((String)valor));
                break; 
            case 6:
                dbLivro.get(linha).setIdLivro(Integer.parseInt((String)valor));
                break; 
            case 7:
                dbLivro.get(linha).setTitulo((String)valor);
                break; 
        }
        this.fireTableRowsUpdated(linha, linha);
    }   */
    public Livro getSelectedValue(int index){
        return repositorioLivro.getSelectedValue(index);
    }   
    public boolean estoqueDisponivel(Livro livroAlugado){
       boolean confEstoque = false;
       int novoEstoque = livroAlugado.getQuantidadesDisponivel();
       if(novoEstoque >0){
           confEstoque = true;
       }
       return confEstoque;
    }
    
    public boolean diminuirEstoque(Livro livroAlugado){
       int novoEstoque = livroAlugado.getQuantidadesDisponivel() - 1;
       boolean conf = true;
       if(novoEstoque<0){
           conf = false;
       }else{
           livroAlugado.setQuantidadesDisponivel(novoEstoque);
            this.fireTableDataChanged(); 
       }       
       return conf;
   }
    public boolean AdicionarEstoque(Livro livroAlugado){
       boolean conf = false;
       for(int i=0;i<repositorioLivro.setValueAtLisvro().size(); i++){
           if(repositorioLivro.setValueAtLisvro().get(i).getTitulo() == livroAlugado.getTitulo()){
               int novoEstoque = livroAlugado.getQuantidadesDisponivel() + 1;      
               livroAlugado.setQuantidadesDisponivel(novoEstoque);
               conf = true;
           }
       }       
       this.fireTableDataChanged();
       return conf;
    }
    public boolean editarLivro(int index, Livro livroEditar){
        boolean conf = false;
        if(repositorioLivro.editarLivro(index, livroEditar)){
            conf = true;
        }
        this.fireTableDataChanged();
        return conf;
    }
}
