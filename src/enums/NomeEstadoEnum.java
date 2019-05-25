package enums;

public enum NomeEstadoEnum {
    
    NOME("Q");
    
    String nome;
    
    NomeEstadoEnum(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
