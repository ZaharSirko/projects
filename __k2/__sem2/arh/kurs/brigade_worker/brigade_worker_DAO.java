package __k2.__sem2.arh.kurs.brigade_worker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class brigade_worker_DAO extends _connection implements brigade_worker_interface {
    public brigade_worker_DAO(){
        conn();
    }
    @Override
    public List<brigade_worker> getAllBrigadeWorkers() {
        
        List<brigade_worker> brigadeWorkers = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM brigade_worker");

            while (resultSet.next()) {
                int id = resultSet.getInt("brigade_worker_id");
                String name = resultSet.getString("brigade_worker_name");
                String surename = resultSet.getString("brigade_worker_surename");
                int age = resultSet.getInt("brigade_worker_age");
                int salary = resultSet.getInt("brigade_worker_salary");
                int department = resultSet.getInt("brigade_worker_department");

                brigade_worker brigadeWorker = new brigade_worker(id, name, surename, age, department, salary);
                brigadeWorkers.add(brigadeWorker);

            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return brigadeWorkers;
    }

    @Override
    public double getAverageSalary() {
        double averageSalary = 0.0;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT AVG(brigade_worker_salary) AS average FROM brigade_worker");

            if (resultSet.next()) {
                averageSalary = resultSet.getDouble("average");
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return averageSalary;
    }
    @Override
    public void addBrigadeWorker(brigade_worker brigadeWorker) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO brigade_worker (brigade_worker_id,brigade_worker_name, brigade_worker_surename, brigade_worker_age, brigade_worker_salary, brigade_worker_department) VALUES (?,?, ?, ?, ?, ?)");
            statement.setInt(1, brigadeWorker.getId());
            statement.setString(2, brigadeWorker.getName());
            statement.setString(3, brigadeWorker.getSurename());
            statement.setInt(4, brigadeWorker.getAge());
            statement.setInt(5, brigadeWorker.getSalary());
            statement.setInt(6, brigadeWorker.getDepartment());

            statement.executeUpdate();
            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void updateBrigadeWorker(brigade_worker brigadeWorker) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE brigade_worker SET brigade_worker_name = ?, brigade_worker_surename = ?, brigade_worker_age = ?, brigade_worker_salary = ?, brigade_worker_department = ? WHERE brigade_worker_id = ?");
            statement.setString(1, brigadeWorker.getName());
            statement.setString(2, brigadeWorker.getSurename());
            statement.setInt(3, brigadeWorker.getAge());
            statement.setInt(4, brigadeWorker.getSalary());
            statement.setInt(5, brigadeWorker.getDepartment());
            statement.setInt(6, brigadeWorker.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    @Override
    public void deleteBrigadeWorker(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM brigade_worker WHERE brigade_worker_id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
