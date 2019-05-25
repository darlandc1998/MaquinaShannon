package enums;

public enum DirecaoEnum {
    DIREITA("D"),
    ESQUERDA("E"),
    FIM("F");
    
    private String simbolo;
    
    DirecaoEnum(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    
}
