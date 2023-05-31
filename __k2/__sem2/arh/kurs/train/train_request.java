package __k2.__sem2.arh.kurs.train;

import java.sql.SQLException;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;
import __k2.__sem2.arh.kurs.route.route;

public class train_request extends _connection {
    public void getTrainRoutes() throws SQLException {
        train_DAO train_DAO = new train_DAO();
        List<train> trainRoutes = train_DAO.getAllTrainsRoutes();

        for (train train : trainRoutes) {
            System.out.println(train.getTrain_id()+" "+train.getTrain_name()+" "+train.getFrom()+" "+train.getDirection()+" "+train.getTo()
            +" "+train.getRoutes_ticket_price()+" "+train.getRoutes_duration());
        }
        List<route> routes = train_DAO.getTrainRoutes(1);
        for (route route : routes) {
            System.out.println(route.getId()+" "+route.getFrom()+" "+route.getDirection()+" "+route.getTo());
        }
        connection.close();
    }
    }
