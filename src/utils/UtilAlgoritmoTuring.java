package utils;

import enums.DirecaoEnum;
import java.util.List;
import modelos.Item;
import modelos.ItensEstados;

public final class UtilAlgoritmoTuring {

    public static void executarAlgoritmo(List<Item> itens, List<String> operacao) {
        Integer pos = 0;
        String estado = operacao.get(0);
        
        while (true) {
            Item analisado = itens.get(itens.indexOf(new Item(estado)));

            int indexEstado = analisado.getItensEstados().indexOf(new ItensEstados(operacao.get(pos)));

            ItensEstados estadoAnalisado = analisado.getItensEstados().get(indexEstado);

            operacao.set(pos, estadoAnalisado.getSimbolo());
            estado = estadoAnalisado.getProxEstado();

            if (estadoAnalisado.getDirecao().equals(DirecaoEnum.FIM.getSimbolo())) {
                break;
            }

            if (estadoAnalisado.getDirecao().equals(DirecaoEnum.DIREITA.getSimbolo())) {
                pos++;
            } else {
                pos--;
            }
        }
        
    }

}
