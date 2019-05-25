package modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item implements Serializable {
    
    private String estado;
    private List<ItensEstados> itensEstados = new ArrayList<>();

    public Item() {
    }

    public Item(String estado) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ItensEstados> getItensEstados() {
        return itensEstados;
    }

    public void setItensEstados(List<ItensEstados> itensEstados) {
        this.itensEstados = itensEstados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.estado);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "estado=" + estado + ", itensEstados=" + itensEstados + '}';
    }
    
}
