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
public class VendaBeans {
    private String estado;
    private String desejo;
    private int quantidade;
    private float preco;
    private int valorPagar;
    private String nome;
    private String ProntaEntrega;
    private Date data;

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }


    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the desejo
     */
    public String getDesejo() {
        return desejo;
    }

    /**
     * @param desejo the desejo to set
     */
    public void setDesejo(String desejo) {
        this.desejo = desejo;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the valorPagar
     */
    public int getValorPagar() {
        return valorPagar;
    }

    /**
     * @param valorPagar the valorPagar to set
     */
    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ProntaEntrega
     */
    public String getProntaEntrega() {
        return ProntaEntrega;
    }

    /**
     * @param ProntaEntrega the ProntaEntrega to set
     */
    public void setProntaEntrega(String ProntaEntrega) {
        this.ProntaEntrega = ProntaEntrega;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
    
}
