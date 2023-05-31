package __k2.__sem2.arh.kurs.passengers;

import java.sql.SQLException;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class passengers_request extends _connection {
    public void getAllPassengers() throws SQLException {
        List<passengers> passengers = new passengers_DAO().getAllPassengers();

        for (passengers passenger : passengers) {
    System.out.println(passenger.getId()+" "+passenger.getSurename()+" "+passenger.getName()+" "+passenger.getGender()
    +" "+passenger.getAge()+" "+passenger.getRoutes_to());
}

        connection.close();
    }
}
