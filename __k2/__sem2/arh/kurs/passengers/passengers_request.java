package __k2.__sem2.arh.kurs.passengers;

import java.sql.SQLException;
import java.util.ArrayList;
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
    public List<passengers_model> getAllPassenger() throws SQLException {
        List<passengers_model>  Passengers = new ArrayList<>();
        
        List<passengers> PassengersList = new passengers_DAO().getAllPassengers();

        for (passengers  Passenger :  PassengersList) {
            passengers_model  PassengerModel = new passengers_model(
                Passenger.getId(),
                Passenger.getSurename(),
                Passenger.getName(),
                Passenger.getAge(),
                Passenger.getGender(),
                Passenger.getRoutes_to()
            );

            Passengers.add(PassengerModel);
        }

        return  Passengers;
    }
}
