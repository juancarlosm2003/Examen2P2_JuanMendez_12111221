/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmendez_.pkg12111221;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Juan Carlos Mendez
 */
public class Guardar2 implements Runnable {

    private JLabel hora;

    public Guardar2(JLabel hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
        while (true) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm:ss");
            hora.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {

            }
        }
    }

}
