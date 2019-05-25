package enums;


public enum SeparadorVariavelEnum {
    
    SEPARADOR(";");
    
    private String key;
    
    SeparadorVariavelEnum(String key){
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
}
