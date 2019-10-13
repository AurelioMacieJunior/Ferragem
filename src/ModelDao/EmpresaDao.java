/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.EmpresaBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class EmpresaDao {
    ConexaoBD conex = new ConexaoBD();
    EmpresaBeans mod = new EmpresaBeans();

    public void salvar(EmpresaBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into empresa (empresa_nome, empresa_localizacao, empresa_contacto, empresa_email) values(?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getLocalizacao());
            pst.setString(3, mod.getContacto());
            pst.setString(4, mod.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Empresa Inserida Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Empresa! \n"+ex);
        }
        conex.desconexao();
    }

    public void editar(EmpresaBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update empresa set empresa_nome=?, empresa_localizacao=?, empresa_contacto=?, empresa_email=? where empresa_id=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getLocalizacao());
            pst.setString(3, mod.getContacto());
            pst.setString(4, mod.getEmail());
            pst.setInt(5, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n"+ex);
        }
        conex.desconexao();
    }

    
    public void excluir(EmpresaBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from empresa where empresa_id=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados!\n Error:" +ex);
        }
        
        conex.desconexao();
    }
    
    public EmpresaBeans buscaEmpresa(EmpresaBeans mod) {
        conex.conexao();
        conex.executaSql("select * from empresa where empresa_nome like '%" + mod.getPesquisa() + "%'");

           try { 
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("empresa_id"));
            mod.setNome(conex.rs.getString("empresa_nome"));
            mod.setLocalizacao(conex.rs.getString("empresa_localizacao"));
            mod.setContacto(conex.rs.getString("empresa_contacto"));
            mod.setEmail(conex.rs.getString("empresa_email"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Empresa Sem Registo \n Busque Novamente, Certifique Que Escreve Correctamente \n"+ex);
        }

        conex.desconexao();
        return mod;
    }        
}
