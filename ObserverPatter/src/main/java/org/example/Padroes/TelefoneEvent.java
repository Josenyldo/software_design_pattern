package org.example.Padroes;

public class TelefoneEvent
        extends java.util.EventObject {

    public TelefoneEvent(Telefone source) {
        super(source);
    }
}