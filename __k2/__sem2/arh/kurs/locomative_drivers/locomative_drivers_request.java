package __k2.__sem2.arh.kurs.locomative_drivers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import __k2.__sem2.arh.kurs._connection;

public class locomative_drivers_request extends _connection {
    public void req3() throws SQLException{
        locomative_drivers_DAO locomative_drivers_DAO = new locomative_drivers_DAO();
        List<locomative_drivers> locomative_drivers = locomative_drivers_DAO.getAllLocomativeDrivers();

        for (locomative_drivers locomative_driver : locomative_drivers) {
            System.out.println(locomative_driver.getId()+" "+locomative_driver.getSurename()+" "+locomative_driver.getName()
            +" "+locomative_driver.getGender()+" "+locomative_driver.getAge()+" "+locomative_driver.getWorkExperience() + " "+ locomative_driver.getSalary()
            +" "+locomative_driver.getMedical_examination_2022()+" "+locomative_driver.getMedical_examination_2023());
        }


    // locomative_drivers newLocomativeDriver = new locomative_drivers(7,"Денис", "Коло", "Чоловіча",36, 13, 12128,"+","+");
    // locomative_drivers_DAO.addLocomativeDrivers(newLocomativeDriver);
    // System.out.println("Новий працівник доданий");

    // Оновлення інформації про працівника
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Введіть ID працівника для оновлення: ");
    // int updateId = sc.nextInt();
    // locomative_drivers updateLocomativeDriver = locomative_drivers_DAO.getLocomativeDriversById(updateId);
    // if (updateLocomativeDriver != null) {
    //     updateLocomativeDriver.setName("Updated Name");
    //     updateLocomativeDriver.setSurename("Updated Surename");
    //     updateLocomativeDriver.setAge(21);
    //     updateLocomativeDriver.setWorkExperience(1);
    //     updateLocomativeDriver.setSalary(2000);
    //     updateLocomativeDriver.setMedical_examination_2022("-");
    //     updateLocomativeDriver.setMedical_examination_2023("+");
    //     locomative_drivers_DAO.updateLocomativeDrivers(updateLocomativeDriver);
    //     System.out.println("Інформація про працівника оновлена");
    // } else {
    //     System.out.println("Працівник з ID " + updateId + " не знайдений");
    // }

    // Видалення працівника
    
    // System.out.print("Введіть ID працівника для видалення: ");
    // int deleteId = sc.nextInt();
    // locomative_drivers_DAO.deleteLocomativeDrivers(deleteId);
    // System.out.println("Працівник з ID " + deleteId + " видалений");

    connection.close();
    // sc.close();
    }
    public List<locomative_drivers_model> getAllLocamativeDrivers() throws SQLException {
        List<locomative_drivers_model>  LocomativeDriver = new ArrayList<>();
        
        List<locomative_drivers> LocomativeDriverList = new locomative_drivers_DAO().getAllLocomativeDrivers();

        for (locomative_drivers  LocomativeDrivers :  LocomativeDriverList) {
            locomative_drivers_model  LocomativeDriverModel = new locomative_drivers_model(
                LocomativeDrivers.getId(),
                LocomativeDrivers.getSurename(),
                LocomativeDrivers.getName(),
                LocomativeDrivers.getGender(),
                LocomativeDrivers.getAge(),
                LocomativeDrivers.getWorkExperience(),
                LocomativeDrivers.getSalary(),
                LocomativeDrivers.getMedical_examination_2022(),
                LocomativeDrivers.getMedical_examination_2023()
            );

            LocomativeDriver.add(LocomativeDriverModel);
        }

        return  LocomativeDriver;
    }
}
