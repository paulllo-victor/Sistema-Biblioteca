/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleClass;
import interFacesClass.InterfaceAluno;
import repositorio.RepositorioAluno;
import entidades.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Paulo Victor
 */
public class ControleAluno extends AbstractTableModel {
    
    private static InterfaceAluno alunoRepositorio;
    
    public ControleAluno(){
        synchronized(InterfaceAluno.class){
            if(alunoRepositorio==null){
                alunoRepositorio = new RepositorioAluno();
            }
        }
    }
    
    @Override
    public int getRowCount() {
        return alunoRepositorio.getRowCount();
    }

    @Override
    public int getColumnCount() {
       return alunoRepositorio.getColumnCount();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
       List<Aluno> hg = alunoRepositorio.getValueAt();
       
       switch(coluna){
            case 0:
               return hg.get(linha).getNome();
            case 1:
                return hg.get(linha).getMatricula();
            case 2:
                return hg.get(linha).getCpf();  
            case 3:
                return hg.get(linha).getContato(); 
            case 4:
                return hg.get(linha).getEndereco();             
        }
        return null;
        
    }
    public String getColumnName(int column) {
        return alunoRepositorio.getColumnName(column);
        
    }
    public boolean addRow(Aluno alunoLista){
        boolean conf = false;
        for(int i=0;i<alunoRepositorio.getValueAt().size();i++){
            if(alunoRepositorio.getValueAt().get(i).getMatricula() == alunoLista.getMatricula()){
               conf= true; 
            }
        }
        if(conf == false){
             alunoRepositorio.addRow(alunoLista);
             this.fireTableDataChanged();
        }    
        
        return conf;
    }
    public void removeRow(int linha){
        alunoRepositorio.removeRow(linha);
        this.fireTableRowsDeleted(linha, linha);        
    }
    /*public void setValueAt(Object valor, int linha, int coluna) {
        List<Aluno> editarAluno = alunoRepositorio.setValueAt();
        switch(coluna){
            case 0:
                editarAluno.get(linha).setNome((String) valor);      
                break;
            case 1:
                editarAluno.get(linha).setMatricula(Integer.parseInt((String) valor));
                break;
            case 2:
                editarAluno.get(linha).setCpf((String) valor);
                break;
            case 3:
                editarAluno.get(linha).setContato((String) valor);
                break;
            case 4:
                editarAluno.get(linha).setEndereco((String)valor);
                break;           
        }
        this.fireTableRowsUpdated(linha, linha);
    }*/
    public Aluno getSelectedValue(int index){
        return alunoRepositorio.getSelectedValue(index);                
    }
    public boolean editarAluno(int index, Aluno editarAluno){
        boolean conf = false;        
        if(alunoRepositorio.editarAluno(index, editarAluno)){                
                conf = true;
        }        
        this.fireTableDataChanged();
        return conf;
    }
}
