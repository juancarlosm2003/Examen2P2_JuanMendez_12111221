/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmendez_.pkg12111221;

import javax.swing.JProgressBar;

/**
 *
 * @author Juan Carlos Mendez
 */
public class Administrar extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public Administrar(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100000000) {
                    vive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

}
