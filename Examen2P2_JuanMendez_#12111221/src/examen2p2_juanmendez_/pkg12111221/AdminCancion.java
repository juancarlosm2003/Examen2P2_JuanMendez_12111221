/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmendez_.pkg12111221;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Mendez
 */
public class AdminCancion {

    private ArrayList<Cancion> listacancion = new ArrayList();
    private File archivo = null;

    public AdminCancion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cancion> getListacancion() {
        return listacancion;
    }

    public void setListacancion(ArrayList<Cancion> listacancion) {
        this.listacancion = listacancion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminCancion{" + "listacancion=" + listacancion + '}';
    }

    public void cargarArchivo() {
        try {
            listacancion = new ArrayList();
            Cancion temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cancion) objeto.readObject()) != null) {
                        listacancion.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Cancion t : listacancion) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
