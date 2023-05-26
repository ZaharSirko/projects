package __k2.__sem2.arh.kurs.railway_station_worker;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class railway_station_worker_DAO extends _connection implements railway_station_worker_interface {
    railway_station_worker_DAO(){
        conn();
    }
    @Override
    public List<railway_station_worker> getAllRailwayStationWorker() {
        List<railway_station_worker> railway_station_workers = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM worker");
            while(resultSet.next()){
                int id = resultSet.getInt("worker_id");
                String surename = resultSet.getString("worker_surename");
                String name = resultSet.getString("worker_name");
                int age = resultSet.getInt("worker_age");
                String gender = resultSet.getString("worker_gender");
                int children = resultSet.getInt("worker_children");
                String chief = resultSet.getString("worker_chief");
                int department = resultSet.getInt("worker_department");
                int workExp = resultSet.getInt("worker_exp");
                int salary = resultSet.getInt("worker_salary");

                railway_station_worker railway_station_worker = new railway_station_worker(id, name, surename, age, gender, children, chief, department, workExp, salary);
                railway_station_workers.add(railway_station_worker);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
             e.printStackTrace();
        }
        return railway_station_workers;
    }

    @Override
    public int NumberOfRailwayStationWorker() {
        int NumberOfRailwayStationWorker = 0;
        try{
         Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT count(*) as Number_of_worker From worker");
        if (resultSet.next()) {
            NumberOfRailwayStationWorker = resultSet.getInt("Number_of_worker");
        }
        } catch (SQLException e) {
            e.printStackTrace();
       }
        return NumberOfRailwayStationWorker;
    }

    @Override
    public void addRailwayStationWorker(railway_station_worker worker) {
    try {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO worker (worker_id,worker_surename,worker_name,worker_age,worker_gender,"
        +"worker_children,worker_chief,worker_department,worker_exp,worker_salary) VALUES "
        + "(?,?,?,?,?,?,?,?,?,?)");
        statement.setInt(1, worker.getId());
        statement.setString(2, worker.getSurename());
        statement.setString(3, worker.getName());
        statement.setInt(4, worker.getAge());
        statement.setString(5, worker.getGender());
        statement.setInt(6, worker.getChildren());
        statement.setString(7, worker.getChief());
        statement.setInt(8, worker.getDepartment());
        statement.setInt(9, worker.getWorkExp());
        statement.setInt(10, worker.getSalary());
        statement.executeUpdate();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    @Override
    public void updateRailwayStationWorker(railway_station_worker worker) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE worker SET worker_id=?,worker_surename =?,worker_name,worker_age=?,worker_gender=?,"
            +"worker_children=?,worker_chief=?,worker_department=?,worker_exp=?,worker_salary=?"
            + "(?,?,?,?,?,?,?,?,?,?)");
            statement.setInt(1, worker.getId());
            statement.setString(2, worker.getSurename());
            statement.setString(3, worker.getName());
            statement.setInt(4, worker.getAge());
            statement.setString(5, worker.getGender());
            statement.setInt(6, worker.getChildren());
            statement.setString(7, worker.getChief());
            statement.setInt(8, worker.getDepartment());
            statement.setInt(9, worker.getWorkExp());
            statement.setInt(10, worker.getSalary());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void deleteRailwayStationWorker(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM worker WHERE worker_id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    @Override
    public railway_station_worker getRailwayStationWorkerById(int id) {
        railway_station_worker railway_station_worker = null;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM brigade_worker WHERE brigade_worker_id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String surename = resultSet.getString("worker_surename");
                String name = resultSet.getString("worker_name");
                int age = resultSet.getInt("worker_age");
                String gender = resultSet.getString("worker_gender");
                int children = resultSet.getInt("worker_children");
                String chief = resultSet.getString("worker_chief");
                int department = resultSet.getInt("worker_department");
                int workExp = resultSet.getInt("worker_exp");
                int salary = resultSet.getInt("worker_salary");

                railway_station_worker = new railway_station_worker(id, name, surename, age, gender, children, chief, department, workExp, salary);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return railway_station_worker;
    }
    
}
