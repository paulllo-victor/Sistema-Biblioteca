/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import entidades.Aluno;
import java.util.ArrayList;
import interFacesClass.InterfaceAluno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sala 03
 */
public class RepositorioAluno implements InterfaceAluno {
    //ArrayList<Aluno> repositorioAluno = new ArrayList<>(); //Arraylist que serve como banco de dados dos Alunos cadastrados
    private List<Aluno>  repositorioAluno = new ArrayList<>();
    
    private String[] colunas = {"Nome","Matricula","Cpf","Contato","Endereço"};
    
    public int getRowCount() {
         return repositorioAluno.size();
    }    
    public int getColumnCount() {
        return colunas.length;
    }
    
    public String getColumnName(int column) {
        return colunas[column];
    }      
    public List<Aluno> getValueAt() {
       return repositorioAluno;
    }
    public void addRow(Aluno alunoLista){
        this.repositorioAluno.add(alunoLista);        
    }
    public void removeRow(int linha){
        this.repositorioAluno.remove(linha);    
    }
    public List<Aluno> setValueAt() {
        return repositorioAluno;
    }
    @Override
    public Aluno getSelectedValue(int index) {
        return repositorioAluno.get(index);
    }

    @Override
    public boolean editarAluno(int index, Aluno alunoEditar) {
       repositorioAluno.set(index, alunoEditar);
       return true;
    }
        
    }
    
    

