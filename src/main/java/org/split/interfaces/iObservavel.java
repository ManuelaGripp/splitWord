package org.split.interfaces;

import org.split.clases.Observador;

public interface iObservavel {

    public void registraObservador(Observador obs);
    public void removeObservador(Observador obs);
    public void notificaObservadores();

}
