/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.UsuarioBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class UsuarioDao {
ConexaoBD conex = new ConexaoBD();
UsuarioBeans cliente = new UsuarioBeans();

    public void salvar(UsuarioBeans cliente) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (nome, senha, tipo) values(?,?,?)");
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getSenha());
            pst.setString(3, cliente.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Usuário! \n Usuário Já Existe Registado!");
        }
        conex.desconexao();
    }

    public void editar(UsuarioBeans cliente) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuario set nome=?, senha=?, tipo=? where id=?");
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getSenha());
            pst.setString(3, cliente.getTipo());
            pst.setInt(4, cliente.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n Usuário Já Existe Registado!");
        }
        conex.desconexao();
    }

    
    public void excluir(UsuarioBeans cliente){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuario where id=?");
            pst.setInt(1, cliente.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados!\n Error:" + ex);
        }
        
        conex.desconexao();
    }
    
    public UsuarioBeans buscaUsuario(UsuarioBeans cliente) {
        conex.conexao();
        conex.executaSql("select * from usuario where nome like '%" + cliente.getPesquisa() + "%'");

           try { 
            conex.rs.first();
            cliente.setCodigo(conex.rs.getInt("id"));
            cliente.setNome(conex.rs.getString("nome"));
            cliente.setSenha(conex.rs.getString("senha"));
            cliente.setTipo(conex.rs.getString("tipo"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário Sem Registo! \n Busque Novamente, Certifique Que Escreve Correctamente");
        }

        conex.desconexao();
        return cliente;
    }    
}
