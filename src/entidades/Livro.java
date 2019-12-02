/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Paulo Victor
 */
public class Livro {
    private String autor;
    private String editora; 
    private int edicao;
    private int volume;
    private String genero;
    private int quantidadesDisponivel;
    private int idLivro;
    private String titulo;
    
    public Livro(String autor,String editora,int edicao,int volume,String genero,int quantidadesDisponivel,int idLivro,String titulo){
        setAutor(autor);
        setEdicao(edicao);
        setEditora(editora);
        setGenero(genero);
        setIdLivro(idLivro);
        setQuantidadesDisponivel(quantidadesDisponivel);
        setTitulo(titulo);
        setVolume(volume);
    }

    public Livro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the edicao
     */
    public int getEdicao() {
        return edicao;
    }

    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the quantidadesDisponivel
     */
    public int getQuantidadesDisponivel() {
        return quantidadesDisponivel;
    }

    /**
     * @param quantidadesDisponivel the quantidadesDisponivel to set
     */
    public void setQuantidadesDisponivel(int quantidadesDisponivel) {
        this.quantidadesDisponivel = quantidadesDisponivel;
    }

    /**
     * @return the idLivro
     */
    public int getIdLivro() {
        return idLivro;
    }

    /**
     * @param idLivro the idLivro to set
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
