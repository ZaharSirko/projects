package __k2.__sem2.arh.kurs.locomative;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import __k2.__sem2.arh.kurs._connection;

public class locomative_request extends _connection {
    public void req4_5() throws SQLException{
     locomative_DAO locomative_DAO = new locomative_DAO();
     List<locomative> locomatives = locomative_DAO.getAllLocomative();

     for (locomative locomative : locomatives) {
        System.out.println(locomative.getId()+" "+locomative.getName()+" "+locomative.getAge()+" "+locomative.getDepartment()
        +" "+locomative.getCompleted_routes()+" "+locomative.getCompleted_routes_before_repair());
     }


    //       locomative newLocomative = new locomative(11,"asd",30,1,5000,0);
    //       locomative_DAO.addLocomative(newLocomative);
    // System.out.println("Новий локоматив доданий");

    // // Оновлення інформації про працівника
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Введіть ID працівника для оновлення: ");
    // int updateId = sc.nextInt();
    // locomative updateLocomative = locomative_DAO.getLocomativeById(updateId);
    // if (updateLocomative != null) {
    //     updateLocomative.setName("Updated Name");
    //     updateLocomative.setAge(11);
    //     updateLocomative.setDepartment(2);
    //     updateLocomative.setCompleted_routes(100000);
    //     updateLocomative.setCompleted_routes_before_repair(125);
    //     locomative_DAO.updateLocomative(updateLocomative);
    //     System.out.println("Інформація про локомотив оновлена");
    // } else {
    //     System.out.println("Локомотивів з ID " + updateId + " не знайдено");
    // }

    // // Видалення працівника
    
    // System.out.print("Введіть ID локоматива для видалення: ");
    // int deleteId = sc.nextInt();
    // locomative_DAO.deleteLocomative(deleteId);
    // System.out.println("Локомотив з ID " + deleteId + " видалений");

    connection.close();
    // sc.close();
    }
}
