package __k2.__sem2.arh.kurs.locomative;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class locomative_request extends _connection {
    public List<locomative_model> getAllLocamatives() throws SQLException {
        List<locomative_model>  Locomative = new ArrayList<>();
        
        List<locomative> LocomativeList = new locomative_DAO().getAllLocomative();

        for (locomative  Locomatives :  LocomativeList) {
            locomative_model  LocomativeModel = new locomative_model(
                Locomatives.getId(),
                Locomatives.getName(),
                Locomatives.getAge(),
                Locomatives.getDepartment(),
                Locomatives.getCompleted_routes(),
                Locomatives.getCompleted_routes_before_repair()
            );

            Locomative.add(LocomativeModel);
        }

        return  Locomative;
    }
}
