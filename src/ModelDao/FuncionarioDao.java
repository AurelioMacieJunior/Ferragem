/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.FuncionarioBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class FuncionarioDao {
    ConexaoBD conex = new ConexaoBD();
    FuncionarioBeans mod = new FuncionarioBeans();

    public void salvar(FuncionarioBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionario (nome, nascimento, sexo, estadocivil, contacto, identificacao) values(?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getNascimento());
            pst.setString(3, mod.getSexo());
            pst.setString(4, mod.getEstadoCivil());
            pst.setString(5, mod.getContacto());
            pst.setString(6, mod.getNrDeIdentificacao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Funcionario Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Funcionário! \n Funcionário Já Existe Registado!");
        }
        conex.desconexao();
    }

    public void editar(FuncionarioBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update funcionario set nome=?, nascimento=?, sexo=?, estadocivil=?, contacto=?, identificacao=? where id=?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getNascimento());
            pst.setString(3, mod.getSexo());
            pst.setString(4, mod.getEstadoCivil());
            pst.setString(5, mod.getContacto());
            pst.setString(6, mod.getNrDeIdentificacao());
            pst.setInt(7, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n Funcionário Já Existe Registado!");
        }
        conex.desconexao();
    }

    
    public void excluir(FuncionarioBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from funcionario where id=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados!\n Error:" + ex);
        }
        
        conex.desconexao();
    }
    
    public FuncionarioBeans buscaFuncionario(FuncionarioBeans mod) {
        conex.conexao();
        conex.executaSql("select * from funcionario where nome like '%" + mod.getPesquisa() + "%'");

           try { 
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setNascimento(conex.rs.getInt("nascimento"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setEstadoCivil(conex.rs.getString("estadocivil"));
            mod.setContacto(conex.rs.getString("contacto"));
            mod.setNrDeIdentificacao(conex.rs.getString("identificacao"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcionário Sem Registo \n Busque Novamente, Certifique Que Escreve Correctamente");
        }

        conex.desconexao();
        return mod;
    }    
}
