/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interFacesClass;

import entidades.Aluno;
import java.util.List;

/**
 *
 * @author lab.alunosalesiano
 */
public interface InterfaceAluno {    
    public int getRowCount();
    public int getColumnCount();
    public String getColumnName(int column);
    public List<Aluno> getValueAt();
    public List<Aluno> setValueAt();
    public void addRow(Aluno alunoLista);
    public void removeRow(int linha);
    public Aluno getSelectedValue(int index);//
    ///
    public boolean editarAluno(int index, Aluno alunoEditar);
    
}
