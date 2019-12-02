/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidades.Aluno;
import entidades.aluguelLivro;
import javax.swing.JFrame;
import ControleClass.ControleAluguelLivro;
import entidades.Livro;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author NICCLABPROF
 */
public class TelaInformacaoAluno extends javax.swing.JPanel {
    ControleAluguelLivro op = new ControleAluguelLivro();
    /**
     * Creates new form InformacaoAluno
     */
    public TelaInformacaoAluno(Aluno alunoInformacoes, int id) {
        initComponents();
        nomeLabel.setText(alunoInformacoes.getNome());
        matriculaLabel.setText(Integer.toString(alunoInformacoes.getMatricula()));
        cpfLabel.setText(alunoInformacoes.getCpf());
        enderecoLabel.setText(alunoInformacoes.getEndereco());
        contatoLabel.setText(alunoInformacoes.getContato());
         listaLabel.setVisible(false);
         listaLabel2.setVisible(false);
         listaLabel3.setVisible(false);  
         listaLabel4.setVisible(false); 
        int size =-1;
         List<Livro> pp = null;
        try {
            
        if(op.getSelectValue(alunoInformacoes.getMatricula()) != null){
           pp = op.getSelectValue(alunoInformacoes.getMatricula());
           size = pp.size();
        }
        }catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "O usuario não pussui nenhum livro!", "Obsevação!!", JOptionPane.INFORMATION_MESSAGE);
                   
        }
        if(size != -1){
            for(int i =0; i<size;i++){
                switch(i){
                    case 0:
                        listaLabel.setVisible(true);
                         listaLabel.setText(pp.get(0).getTitulo());
                        break;
                    case 1:
                        listaLabel2.setVisible(true);
                         listaLabel2.setText(pp.get(1).getTitulo());  
                        break;
                    case 2:
                        listaLabel3.setVisible(true);
                         listaLabel2.setText(pp.get(2).getTitulo());  
                        break;
                    case 3:
                        listaLabel4.setVisible(true);
                         listaLabel2.setText(pp.get(3).getTitulo());  
                        break;
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        matriculaLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        enderecoLabel = new javax.swing.JLabel();
        contatoLabel = new javax.swing.JLabel();
        listaLabel = new javax.swing.JLabel();
        listaLabel2 = new javax.swing.JLabel();
        listaLabel3 = new javax.swing.JLabel();
        listaLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Nome:");

        jLabel2.setText("Matricula:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Contato:");

        jLabel6.setText("Lista de Livros:");

        nomeLabel.setText("jLabel7");

        matriculaLabel.setText("jLabel7");

        cpfLabel.setText("jLabel7");

        enderecoLabel.setText("jLabel7");

        contatoLabel.setText("jLabel7");

        listaLabel.setText("jLabel7");

        listaLabel2.setText("jLabel7");

        listaLabel3.setText("jLabel7");

        listaLabel4.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaLabel4)
                    .addComponent(listaLabel3)
                    .addComponent(listaLabel2)
                    .addComponent(contatoLabel)
                    .addComponent(enderecoLabel)
                    .addComponent(cpfLabel)
                    .addComponent(matriculaLabel)
                    .addComponent(nomeLabel)
                    .addComponent(listaLabel))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matriculaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpfLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(enderecoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contatoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaLabel)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contatoLabel;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel listaLabel;
    private javax.swing.JLabel listaLabel2;
    private javax.swing.JLabel listaLabel3;
    private javax.swing.JLabel listaLabel4;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JLabel nomeLabel;
    // End of variables declaration//GEN-END:variables
}
