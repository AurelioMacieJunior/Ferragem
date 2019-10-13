/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.Date;

/**
 *
 * @author Aurelio Macie Junior
 */
public class FornecedorBeans extends Pessoa{
    private String nomeEmpresa;
    private Date horaDeEntrega;

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the horaDeEntrega
     */
    public Date getHoraDeEntrega() {
        return horaDeEntrega;
    }

    /**
     * @param horaDeEntrega the horaDeEntrega to set
     */
    public void setHoraDeEntrega(Date horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }

    /**
     * @return the horaDeEntrega
     */
}
