package __k2.__sem2.arh.kurs.locomative_drivers;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import __k2.__sem2.arh.kurs._connection;

public class locomative_drivers_DAO extends _connection implements locomative_drivers_interface {
    locomative_drivers_DAO(){
        conn();
    }
    @Override
    public List<locomative_drivers> getAllLocomativeDrivers() {
        List<locomative_drivers> locomative_drivers = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM locomotive_driver");
            while (resultSet.next()) {
                int id = resultSet.getInt("locomotive_driver_id");
                String surename = resultSet.getString("locomotive_driver_surename");
                String name = resultSet.getString("locomotive_driver_name");
                String gender = resultSet.getString("locomotive_driver_gender");
                int age  =resultSet.getInt("locomotive_driver_work_age");
                int exp = resultSet.getInt("locomotive_driver_work_experience");
                int salary = resultSet.getInt("locomotive_driver_salary");
                String medical_2022 = resultSet.getString("locomotive_driver_medical_examination_2022");
                String medical_2023 = resultSet.getString("locomotive_driver_medical_examination_2023");

                locomative_drivers locomative_driver = new locomative_drivers(id, surename, name, gender,age, exp, salary,medical_2022,medical_2023);
                locomative_drivers.add(locomative_driver);
            }
            resultSet.close();
            statement.close();
          } catch (SQLException e) {
             e.printStackTrace();
        }
        return locomative_drivers;
    }

    @Override
    public void addLocomativeDrivers(locomative_drivers locomative_drivers) {
   try {
    PreparedStatement statement = connection.prepareStatement(" INSERT INTO locomotive_driver(locomotive_driver_id,locomotive_driver_surename,locomotive_driver_name"
    + ",locomotive_driver_gender,locomotive_driver_work_age,locomotive_driver_work_experience,locomotive_driver_salary,"
    +  "locomotive_driver_medical_examination_2022,locomotive_driver_medical_examination_2023) VALUEs"
    + "(?,?, ?, ?,?, ?, ?,?,?)");
    statement.setInt(1, locomative_drivers.getId());
    statement.setString(2, locomative_drivers.getSurename());
    statement.setString(3, locomative_drivers.getName());
    statement.setString(4, locomative_drivers.getGender());
    statement.setInt(5, locomative_drivers.getAge());
    statement.setInt(6, locomative_drivers.getWorkExperience());
    statement.setInt(7, locomative_drivers.getSalary());
    statement.setString(8, locomative_drivers.getMedical_examination_2022());
    statement.setString(9, locomative_drivers.getMedical_examination_2023());
    statement.executeUpdate();
    statement.close();

   } catch (SQLException e) {
    e.printStackTrace();
    }
        
    }
    @Override
    public void updateLocomativeDrivers(locomative_drivers locomative_drivers) {
        try {
            PreparedStatement statement = connection.prepareStatement(" UPDATE locomotive_driver SET locomotive_driver_id =?,locomotive_driver_surename=?,locomotive_driver_name=?"
            + ",locomotive_driver_gender=?,locomotive_driver_work_age=?,locomotive_driver_work_experience=?,locomotive_driver_salary=?,"
            +  "locomotive_driver_medical_examination_2022=?,locomotive_driver_medical_examination_2023=?"
            + "(?,?, ?, ?,?, ?, ?,?,?)");
            statement.setInt(1, locomative_drivers.getId());
            statement.setString(2, locomative_drivers.getSurename());
            statement.setString(3, locomative_drivers.getName());
            statement.setString(4, locomative_drivers.getGender());
            statement.setInt(5, locomative_drivers.getAge());
            statement.setInt(6, locomative_drivers.getWorkExperience());
            statement.setInt(7, locomative_drivers.getSalary());
            statement.setString(8, locomative_drivers.getMedical_examination_2022());
            statement.setString(9, locomative_drivers.getMedical_examination_2023());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    @Override
    public void deleteLocomativeDrivers(int id) {
      
        
    }

    @Override
    public locomative_drivers getLocomativeDriversById(int id) {
        locomative_drivers locomative_drivers = null;
        try {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM locomotive_driver WHERE locomotive_driver_id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            String surename = resultSet.getString("locomotive_driver_surename");
            String name = resultSet.getString("locomotive_driver_name");
            String gender = resultSet.getString("locomotive_driver_gender");
            int age  =resultSet.getInt("locomotive_driver_work_age");
            int exp = resultSet.getInt("locomotive_driver_work_experience");
            int salary = resultSet.getInt("locomotive_driver_salary");
            String medical_2022 = resultSet.getString("locomotive_driver_medical_examination_2022");
            String medical_2023 = resultSet.getString("locomotive_driver_medical_examination_2023");

            locomative_drivers = new locomative_drivers(id, surename, name, gender,age, exp, salary,medical_2022,medical_2023);
        }
       } catch (SQLException e) {
        e.printStackTrace();
    }
    return locomative_drivers;
     

    }

    
}
