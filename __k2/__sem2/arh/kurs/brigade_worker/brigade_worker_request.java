package __k2.__sem2.arh.kurs.brigade_worker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import __k2.__sem2.arh.kurs._connection;

public class brigade_worker_request extends _connection {
    public void req2() throws SQLException{
     brigade_worker_DAO brigadeWorkerDAO = new brigade_worker_DAO();

    // Виведення всіх працівників
    List<brigade_worker> brigadeWorkers = brigadeWorkerDAO.getAllBrigadeWorkers();

    for (brigade_worker brigadeWorker : brigadeWorkers) {
        System.out.println(brigadeWorker.getId() + " " + brigadeWorker.getName() + " " +
                brigadeWorker.getSurename() + " " + brigadeWorker.getAge() + " " +
                brigadeWorker.getSalary() + " " + brigadeWorker.getDepartment());
    }

    double averageSalary = brigadeWorkerDAO.getAverageSalary();
    System.out.println("Average: " + averageSalary);

    // Виведення працівників певного відділу
    Scanner sc = new Scanner(System.in);
    System.out.print("Введіть номер відділу: ");
    int department = sc.nextInt();

    List<brigade_worker> workersByDepartment = brigadeWorkerDAO.getBrigadeWorkersByDepartment(department);
    if (workersByDepartment.isEmpty()) {
        System.out.println("Немає працівників у відділі " + department);
    } else {
        System.out.println("Працівники у відділі " + department + ":");
        for (brigade_worker worker : workersByDepartment) {
            System.out.println(worker.getId() + " " + worker.getName() + " " +
                    worker.getSurename() + " " + worker.getAge() + " " +
                    worker.getSalary() + " " + worker.getDepartment());
        }
    }

    // brigade_worker newBrigadeWorker = new brigade_worker(11,"Johns","Doe",30,5000,1);
    // brigadeWorkerDAO.addBrigadeWorker(newBrigadeWorker);
    // System.out.println("Новий працівник доданий");

    // Оновлення інформації про працівника

    // System.out.print("Введіть ID працівника для оновлення: ");
    // int updateId = sc.nextInt();
    // brigade_worker updateBrigadeWorker = brigadeWorkerDAO.getBrigadeWorkerById(updateId);
    // if (updateBrigadeWorker != null) {
    //     updateBrigadeWorker.setName("Updated Name");
    //     updateBrigadeWorker.setSurename("Updated Surename");
    //     updateBrigadeWorker.setAge(11);
    //     updateBrigadeWorker.setDepartment(2);
    //     updateBrigadeWorker.setSalary(2000);
    //     brigadeWorkerDAO.updateBrigadeWorker(updateBrigadeWorker);
    //     System.out.println("Інформація про працівника оновлена");
    // } else {
    //     System.out.println("Працівник з ID " + updateId + " не знайдений");
    // }

    // Видалення працівника
    
    // System.out.print("Введіть ID працівника для видалення: ");
    // int deleteId = sc.nextInt();
    // brigadeWorkerDAO.deleteBrigadeWorker(deleteId);
    // System.out.println("Працівник з ID " + deleteId + " видалений");

    connection.close();
    sc.close();



    }
    public List<brigade_worker_model> getAllBrigadeWorker() throws SQLException {
        List<brigade_worker_model>  BrigadeWorker = new ArrayList<>();
        
        List<brigade_worker> BrigadeWorkerList = new brigade_worker_DAO().getAllBrigadeWorkers();

        for (brigade_worker  BrigadeWorkers :  BrigadeWorkerList) {
            brigade_worker_model  BrigadeWorkerModel = new brigade_worker_model(
                BrigadeWorkers.getId(),
                BrigadeWorkers.getName(),
                BrigadeWorkers.getSurename(),
                BrigadeWorkers.getAge(),
                BrigadeWorkers.getDepartment(),
                BrigadeWorkers.getSalary()
            );

            BrigadeWorker.add(BrigadeWorkerModel);
        }

        return  BrigadeWorker;
    }
}
