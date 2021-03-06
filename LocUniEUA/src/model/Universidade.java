package model;

import java.io.Serializable;

/**
 *
 * @author JoãoVictor
 */
public class Universidade implements Serializable{
    private String id = "";
    private String nome = "";
    private String endereco = "";
    private String cidade = "";
    private String codigo = "";
    private String adm = "";
    private String tituloAdm = "";
    private String website = "";
    private String condado = "";
    private String longitude = "";
    private String latitude = "";
    
    public void conectarAoDataset(){

        //Classe universidade finalizada
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public String getTituloAdm() {
        return tituloAdm;
    }

    public void setTituloAdm(String tituloAdm) {
        this.tituloAdm = tituloAdm;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCondado() {
        return condado;
    }

    public void setCondado(String condado) {
        this.condado = condado;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    
}
