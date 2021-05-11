package org.example;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

public class ClientePlugParaTomada2Pinos {
    /**
     * @param args
     */
    private Fio pinoFase;
    private Fio pinoNeutro;


    public ClientePlugParaTomada2Pinos(Fio pinoFase, Fio pinoNeutro) {
        this.pinoFase = pinoFase;
        this.pinoNeutro = pinoNeutro;
    }

    private void acoplaPlug() {
        ServicoTomada3Pinos tomada2pinos = new Adapter(this.pinoFase, this.pinoNeutro);
        ((Adapter) tomada2pinos).conectar();
    }

    public static void main(String[] args) {
        ClientePlugParaTomada2Pinos plug3Pinos = new ClientePlugParaTomada2Pinos(Fio.FASE, Fio.NEUTRO);
        plug3Pinos.acoplaPlug();
    }
}
