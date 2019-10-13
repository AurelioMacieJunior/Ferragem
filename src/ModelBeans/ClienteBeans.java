/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author Aurelio Macie Junior
 */
public class ClienteBeans extends Pessoa{
    private String nomeDoMaterial;
    private int quantidadeDesejada;

    /**
     * @return the nomeDoMaterial
     */
    public String getNomeDoMaterial() {
        return nomeDoMaterial;
    }

    /**
     * @param nomeDoMaterial the nomeDoMaterial to set
     */
    public void setNomeDoMaterial(String nomeDoMaterial) {
        this.nomeDoMaterial = nomeDoMaterial;
    }

    /**
     * @return the quantidadeDesejada
     */
    public int getQuantidadeDesejada() {
        return quantidadeDesejada;
    }

    /**
     * @param quantidadeDesejada the quantidadeDesejada to set
     */
    public void setQuantidadeDesejada(int quantidadeDesejada) {
        this.quantidadeDesejada = quantidadeDesejada;
    }

}
