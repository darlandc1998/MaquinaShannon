package utils;

import enums.NomeEstadoEnum;
import java.util.ArrayList;
import java.util.List;

public final class UtilTabela {

    public static List<String> getEstados(Integer quantidade, String inicio) {
        List<String> estados = new ArrayList<>();
            for (int i = 0; i < quantidade; i++) {
                estados.add(i == 0 ? inicio : NomeEstadoEnum.NOME.getNome() + (i - 1));
            }
        return estados;
    }
    
    public static Object[] getOpcoesComboBox(Object[] opcoes){
        Object[] opcoesCb = new Object[opcoes.length + 1];
        
        for (int i = 0; i < opcoesCb.length; i++){
             opcoesCb[i] = i == 0 ? null : opcoes[i-1];
        }
        
        return opcoesCb;
    }

}
