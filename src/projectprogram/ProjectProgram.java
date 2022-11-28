package projectprogram;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author bryan
 */
public class ProjectProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MongoClient client = MongoClients.create("mongodb+srv://BryanDB:DTrUZ0em3XONr3fR@quintanabryan-g.dobuj.mongodb.net/?retryWrites=true&w=majority");

        MongoDatabase db = client.getDatabase("Music");

        MongoCollection<Document> toys = db.getCollection("MusicInfo");

        Document doc = toys.find().first();

        try (MongoCursor< Document> cur = toys.find().iterator()) {

            while (cur.hasNext()) {

                doc = cur.next();
                var users = new ArrayList<>(doc.values());

                System.out.println("S" + users.get(1) + users.get(2));
            }
        }
    }
}
