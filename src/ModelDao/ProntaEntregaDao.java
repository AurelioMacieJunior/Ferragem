/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.ProntaEntregaBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class ProntaEntregaDao {
    ConexaoBD conex = new ConexaoBD();
    ProntaEntregaBeans mod = new ProntaEntregaBeans();

    public void salvar(ProntaEntregaBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pentrega (pentrega_nome, pentrega_contacto, pentrega_carro, pentrega_matricula) values(?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getContacto());
            pst.setString(3, mod.getCarro());
            pst.setString(4, mod.getMatricula());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Pronta Entrega Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Pronta Entrega! \n Pronta Entrega Já Existe Registado!");
        }
        conex.desconexao();
    }

    public void editar(ProntaEntregaBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update pentrega set pentrega_nome=?, pentrega_contacto=?, pentrega_carro=?, pentrega_matricula=? where pentrega_id=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getContacto());
            pst.setString(3, mod.getCarro());
            pst.setString(4, mod.getMatricula());
            pst.setInt(5, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n Pronta Entrega Já Existe Registado!");
        }
        conex.desconexao();
    }

    
    public void excluir(ProntaEntregaBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from pentrega where pentrega_id=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados!\n Error:" + ex);
        }
        
        conex.desconexao();
    }
    
    public ProntaEntregaBeans buscaProntaEntrega(ProntaEntregaBeans mod) {
        conex.conexao();
        conex.executaSql("select * from pentrega where pentrega_nome like '%" + mod.getPesquisa() + "%'");

           try { 
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("pentrega_id"));
            mod.setNome(conex.rs.getString("pentrega_nome"));
            mod.setContacto(conex.rs.getString("pentrega_contacto"));
            mod.setCarro(conex.rs.getString("pentrega_carro"));
            mod.setMatricula(conex.rs.getString("pentrega_matricula"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pronta Entrega Sem Registo \n Busque Novamente, Certifique Que Escreve Correctamente");
        }

        conex.desconexao();
        return mod;
    }    
    
}
