package org.example;

public class JanelaDownload extends JanelaAbstrata{
    public JanelaDownload(JanelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela de Dowload");
        desenharBotao("Onde o download deve ser realiza?");
        desenharBotao("Botão deseja continuar?");
        desenharBotao("Botão Não");
    }


}
