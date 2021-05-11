package org.example;

public class App 
{
    public static void main( String[] args )
    {

        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();
        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaAndroid());
        janela.desenhar();

        janela = new JanelaDownload(new JanelaAndroid());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaAndroid());
        janela.desenhar();

    }
}
