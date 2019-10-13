/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.FornecedorBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class FornecedorDao {
    ConexaoBD conexEmpresa = new ConexaoBD();
    ConexaoBD conex = new ConexaoBD();
    FornecedorBeans mod = new FornecedorBeans();
//    String nomeEmpresa;
//    int codEmpresa;

    public void salvar(FornecedorBeans mod) {
        //buscaEmpresaId(mod.getNomeEmpresa());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into fornecedor (fornecedor_empresa_id, fornecedor_nome, fornecedor_identificacao, fornecedor_contacto) values(?,?,?,?)");
            pst.setString(1, mod.getNomeEmpresa());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getNrDeIdentificacao());
            pst.setString(4, mod.getContacto());
            //pst.setDate(5, new java.sql.Date(mod.getHoraDeEntrega().getTime()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Inserido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Inserir Fornecedor!  \n Fornecedor Já Existe Registado!");
        }
        conex.desconexao();
    }

    public void editar(FornecedorBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update fornecedor set fornecedor_empresa_id=?, fornecedor_nome=?, fornecedor_identificacao=?, fornecedor_contacto=? where fornecedor_id=?");
            pst.setString(1, mod.getNomeEmpresa());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getNrDeIdentificacao());
            pst.setString(4, mod.getContacto());
            //pst.setDate(5, new java.sql.Date(mod.getHoraDeEntrega().getTime()));
            pst.setInt(5, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar Dados! \n Fornecedor Já Existe Registado!");
        }
        conex.desconexao();
    }

    
    public void excluir(FornecedorBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from fornecedor where fornecedor_id=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro Na Exclusão De Dados!\n Error:" + ex);
        }
        
        conex.desconexao();
    }
    
    public FornecedorBeans buscaFornecedor(FornecedorBeans mod) {
        conex.conexao();

           try {   
            conex.executaSql("select * from fornecedor where fornecedor_nome like '%" + mod.getPesquisa() + "%'");
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("fornecedor_id"));
            mod.setNomeEmpresa(conex.rs.getString("fornecedor_empresa_id"));
            mod.setNome(conex.rs.getString("fornecedor_nome"));
            mod.setNrDeIdentificacao(conex.rs.getString("fornecedor_identificacao"));
            mod.setContacto(conex.rs.getString("fornecedor_contacto"));
            //mod.setHoraDeEntrega(conex.rs.getDate("fornecedor_hora"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fornecedor Sem Registo \n Busque Novamente, Certifique Que Escreve Correctamente");
        }

        conex.desconexao();
        return mod;
    }  
    
//    public void buscaEmpresaId(String nome){
//        conex.conexao();
//        conex.executaSql("select * from empresa where empresa_nome='"+nome+"'");
//        try {
//            conex.rs.first();
//            codEmpresa=conex.rs.getInt("empresa_id");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro Ao Buscar Empresa"+ex);
//        }
//    }
    
//    public void buscaNomeEmpresa(int cod){
//        conexEmpresa.conexao();
//        
//        try {
//            conexEmpresa.executaSql("select * from empresa where empresa_id = "+cod);
//            conexEmpresa.rs.first();
//            nomeEmpresa = conexEmpresa.rs.getString("empresa_nome");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro Na Busta Do Nome Da Empresa \n "+ex);
//        }
//        conexEmpresa.desconexao();
//    }
}
