/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.VendaBeans;
import ModelConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aurelio Macie Junior
 */
public class VendaDao {
    ConexaoBD conex = new ConexaoBD();
    VendaBeans venda = new VendaBeans();
    
    
        public void vender(VendaBeans mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into venda (venda_nome, venda_desejo, venda_quantidade, venda_preco, venda_pronta_entrega, venda_data, venda_valor_pagar, venda_estado) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getDesejo());
            pst.setInt(3, mod.getQuantidade());
            pst.setFloat(4, mod.getPreco());
            pst.setString(5, mod.getProntaEntrega());
            pst.setDate(6, new java.sql.Date(mod.getData().getTime()));
            pst.setInt(7, mod.getValorPagar());
            pst.setString(8, mod.getEstado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Venda Realizada Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Efectuar Venda! \n Error: "+ex);
        }
        conex.desconexao();
    }
    
}
