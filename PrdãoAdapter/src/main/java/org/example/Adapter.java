package org.example;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

public class Adapter extends ServicoTomada3Pinos implements Adaptee {
    public Adapter(Fio fioVermelho, Fio fioAzulClaro) {
        super(fioVermelho, fioAzulClaro,null);
    }

    @Override
    public void conectar() {
        this.forneceEnergia();
    }
}
