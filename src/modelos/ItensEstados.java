package modelos;

import java.util.Objects;

public class ItensEstados {
    
    private String estado;
    private String proxEstado;
    private String simbolo;
    private String direcao;

    public ItensEstados() {
    }

    public ItensEstados(String estado) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProxEstado() {
        return proxEstado;
    }

    public void setProxEstado(String proxEstado) {
        this.proxEstado = proxEstado;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "ItensEstados{" + "estado=" + estado + ", proxEstado=" + proxEstado + ", simbolo=" + simbolo + ", direcao=" + direcao + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.estado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItensEstados other = (ItensEstados) obj;
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }
    
    
}
