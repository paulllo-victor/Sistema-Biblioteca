/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import entidades.Aluno;
import java.util.List;
import entidades.aluguelLivro;
import java.util.ArrayList;
import interFacesClass.InterfaceAluguel;
import entidades.Livro;

/**
 *
 * @author Paulo Victor
 */
public class RepositorioAluguelLivro implements InterfaceAluguel {
    private List<aluguelLivro> repositorioAluguel = new ArrayList<>();
    private String[] colunas = {"livro"};

    @Override
    public int getRowCount() {
        return repositorioAluguel.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public List<aluguelLivro> getValueAt() {
        return repositorioAluguel;
    }

    @Override
    public List<aluguelLivro> setValueAt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addRow(aluguelLivro aluguel) {
       this.repositorioAluguel.add(aluguel);
    }

    @Override
    public void removeRow(int linha) {
        this.repositorioAluguel.remove(linha);
    }

    @Override
    public aluguelLivro getSelectedValue(int matricula){     
        aluguelLivro aluguel = null;
        for(int i=0; i<repositorioAluguel.size();i++){
            if(repositorioAluguel.get(i).getAluno().getMatricula() == matricula){
                aluguel = repositorioAluguel.get(i);
            }
        }
        return  aluguel;        
    }
    public boolean adicionarAluguel(Aluno varAluno,int varLimite, Livro varLivro){
        
        aluguelLivro varAluguel = new aluguelLivro();
        varAluguel.setAluno(varAluno);
        varAluguel.setLimiteQuantidadeLivro(varLimite);
        varAluguel.setListaLivroAdicionar(varLivro);
        boolean existe = false;
        boolean addOuAlterado = false;
        
        for(int i=0;i<repositorioAluguel.size();i++){
            if(repositorioAluguel.get(i).getAluno().getMatricula() == varAluno.getMatricula()){
                repositorioAluguel.get(i).setListaLivroAdicionar(varLivro);
                existe = true;
                addOuAlterado = true;
                
            }
        }      
        if(existe == false){
            repositorioAluguel.add(varAluguel);
             addOuAlterado = true;
        }
        return addOuAlterado;
    }
    public boolean setListarLivroAlunoRemover(Aluno varAluno, Livro varLivro){
        boolean conf = false;
        for(int i=0;i<repositorioAluguel.size();i++){
            if(repositorioAluguel.get(i).getAluno().getMatricula() == varAluno.getMatricula()){
                repositorioAluguel.get(i).setListaLivroRenover(varLivro);
                conf = true;
            }           
        }
         return conf;
    }
    
}
