package projectprogram;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bryan
 */
public class Conexion {

    public MongoClient crearConexion() {
        MongoClient mongo = null;
        try {

            com.mongodb.client.MongoClient client = MongoClients.create("mongodb+srv://BryanDB:DTrUZ0em3XONr3fR@quintanabryan-g.dobuj.mongodb.net/?retryWrites=true&w=majority");
            
            MongoDatabase db = client.getDatabase("Music");
            
            MongoCollection col = db.getCollection("MusicInfo");
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion a MongoDB, error: " + e.toString());
        }
        return mongo;
    }

}
