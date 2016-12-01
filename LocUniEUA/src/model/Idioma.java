package model;

/**
 *
 * @author JoãoVictor
 */
public class Idioma {
    public String informacoes;
    public     String sobreSistema;
    public      String mensagemSobreSistema;
    public     String desenvolvedores;
    public      String mensagemDesenvolvedores;
    public String idioma;
    
    public String filtros;
    
    public String nomeDaUniversidade;
    public String estado;
    public String cidade;
        
    public String buscar;
    
    public String dados;
        
    public String voltar;
    public String salvarResultado;
    public String graficos;

    public String getMensagemSobreSistema() {
        return mensagemSobreSistema;
    }

    public String getMensagemDesenvolvedores() {
        return mensagemDesenvolvedores;
    }
    
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
        sobreSistema = "Sobre o sistema";
        mensagemSobreSistema = "O sistema foi desenvolvido com a finalidade de permitir que o usuário possa fazer uma análise de dados de universidades Estadunidenses.";
        desenvolvedores = "Desenvolvedores";
        mensagemDesenvolvedores = "O sistema foi desenvolvido por:" + "\nJoão Victor Ignacio - ignaciojvig@gmail.com" + "\nLuis Ricardo Ferraz - ferrazluisinho@gmail.com" + "\nAna Carolina Guijarro Pedroso - ana.carolina_gp@hotmail.com";
        idioma = "Idioma";
        filtros = "Filtros";
        nomeDaUniversidade = "Nome da Universidade";
        estado = "Estado";
        cidade = "Cidade";
        buscar = "Buscar";
        dados = "Dados";
        voltar = "Voltar";
        salvarResultado = "Salvar Resultado";
        graficos = "Graficos";
    }
    public void setIdiomaENUS(){
        informacoes = "Information";
        sobreSistema = "About the System ";
        mensagemSobreSistema = "The system was developed with the intent of allow the user to do an analysis of data about North-American Universities";
        desenvolvedores = "Developers";
        mensagemDesenvolvedores = "The system was developed by:" + "\nJoão Victor Ignacio - ignaciojvig@gmail.com" + "\nLuis Ricardo Ferraz - ferrazluisinho@gmail.com" + "\nAna Carolina Guijarro Pedroso - ana.carolina_gp@hotmail.com";
        idioma = "Language";
        filtros = "Filters";
        nomeDaUniversidade = "Name of the University";
        estado = "State";
        cidade = "City";
        buscar = "Seek";
        dados = "Data";
        voltar = "Return";
        salvarResultado = "Save Result";
        graficos = "Graphics";
    }

    public String getSalvarResultado() {
        return salvarResultado;
    }
    
}
