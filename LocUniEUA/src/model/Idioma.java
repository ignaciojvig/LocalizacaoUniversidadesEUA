package model;

/**
 *
 * @author JoãoVictor
 */
public class Idioma {
    public String informacoes;
    public     String sobreSistema;
    public     String desenvolvedores;
    public String idioma;
    
    public String filtros;
    
    public String nomeDaUniversidade;
    public String estado;
    public String cidade;
        
    public String buscar;
    
    public String dados;
        
    public String voltar;
    public String graficos;
    
    public Idioma(){
        setIdiomaPTBR();
    }

    public String getInformacoes() {
        return informacoes;
    }

    public String getSobreSistema() {
        return sobreSistema;
    }

    public String getDesenvolvedores() {
        return desenvolvedores;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getFiltros() {
        return filtros;
    }

    public String getNomeDaUniversidade() {
        return nomeDaUniversidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBuscar() {
        return buscar;
    }

    public String getDados() {
        return dados;
    }

    public String getVoltar() {
        return voltar;
    }

    public String getGraficos() {
        return graficos;
    }
    
    
    
    public void setIdiomaPTBR(){
        informacoes = "Informações";
        sobreSistema = "O sistema foi desenvolvido com a finalidade de permitir que o usuário possa fazer uma análise de dados de universidades Estadunidenses. ";
        desenvolvedores = "O sistema foi desenvolvido por:\n João Victor Ignacio - ignaciojvig@gmail.com\n Luis Ricardo Ferraz - ferrazluisinho@gmail.com\n Ana Carolina Guijarro Pedroso - ana.carolina_gp@hotmail.com";
        idioma = "Idioma";
        filtros = "Filtros";
        nomeDaUniversidade = "Nome da Universidade";
        estado = "Estado";
        cidade = "Cidade";
        buscar = "Buscar";
        dados = "Dados";
        voltar = "Voltar";
        graficos = "Graficos";
    }
    public void setIdiomaENUS(){
        informacoes = "Information";
        sobreSistema = "The system has been developed with the intent of allow to the user an analysis of the Data about North-America Universities. ";
        desenvolvedores = "The system has been developed by:\n João Victor Ignacio - ignaciojvig@gmail.com\n Luis Ricardo Ferraz - ferrazluisinho@gmail.com\n Ana Carolina Guijarro Pedroso - ana.carolina_gp@hotmail.com";
        idioma = "Language";
        filtros = "Filters";
        nomeDaUniversidade = "Name of the University";
        estado = "State";
        cidade = "City";
        buscar = "Seek";
        dados = "Data";
        voltar = "Return";
        graficos = "Graphics";
    }
    
}
