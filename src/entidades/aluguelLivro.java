/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import entidades.Aluno;
import entidades.Livro;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Paulo Victor
 */
public class aluguelLivro {
    private Aluno aluno;
    private int limiteQuantidadeLivro;
    private List<Livro> listaLivro;

    public aluguelLivro(){
        this.aluno = null;
        this.limiteQuantidadeLivro = 0;
        this.listaLivro = new ArrayList<>();
    }
    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the limiteQuantidadeLivro
     */
    public int getLimiteQuantidadeLivro() {
        return limiteQuantidadeLivro;
    }

    /**
     * @param limiteQuantidadeLivro the limiteQuantidadeLivro to set
     */
    public void setLimiteQuantidadeLivro(int limiteQuantidadeLivro) {
        this.limiteQuantidadeLivro = limiteQuantidadeLivro;
    }

    /**
     * @return the listaLivro
     */
    public List<Livro> getListaLivro() {
        return listaLivro;
    }
    /**
     * @param listaLivro the listaLivro to set
     */
    public void setListaLivro(List<Livro> listaLivro) {
        this.listaLivro = listaLivro;
    }
    public void setListaLivroAdicionar(Livro listaLivro) {
        this.listaLivro.add(listaLivro);
    }
    public void setListaLivroRenover(Livro listaLivro) {
        this.listaLivro.remove(listaLivro);
    }
}
