package org.example;

import java.util.Observable;
import java.util.Observer;
import java.util.List;
import java.util.ArrayList;

 class RevistaInformatica extends Observable {

 private List<UsuarioConcreteObserver> usuarios = new ArrayList<UsuarioConcreteObserver>();


    public void setNovaEdicao(String novaEdicao) {
        UsuarioConcreteObserver usuario = new UsuarioConcreteObserver();
        usuario.setEmail(novaEdicao);
        usuarios.add(usuario);
        setChanged();
        notifyObservers();
    }

    public void getEdicao() {

        for (UsuarioConcreteObserver usuario : usuarios) {
            System.out.println(usuario.getEmail());
        }
    }

    public static void main(String[] args) {
        //poderia receber a nova edicao atraves de um recurso externo
        String novaEdicao = "asd";
        String novaEdicao02 = "sad" ;
        String novaEdicao03 = "Coisa" ;
        RevistaInformatica revistaInformatica = new RevistaInformatica();
        Assinante1 assinante1 = new Assinante1(revistaInformatica);
        revistaInformatica.setNovaEdicao(novaEdicao);
        revistaInformatica.setNovaEdicao(novaEdicao02);
        revistaInformatica.setNovaEdicao(novaEdicao03);



    }

}

class Assinante1 implements Observer {

    Observable revistaInformatica;

    int edicaoNovaRevista;

    public Assinante1(Observable revistaInformatica) {
        this.revistaInformatica = revistaInformatica;
        revistaInformatica.addObserver(this);
    }

    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof RevistaInformatica) {
            RevistaInformatica revistaInformatica = (RevistaInformatica) revistaInfSubject;
            //revistaInformatica.getEdicao();

        }
    }
}