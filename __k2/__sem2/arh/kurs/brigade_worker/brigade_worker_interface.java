package __k2.__sem2.arh.kurs.brigade_worker;

import java.util.List;

public interface brigade_worker_interface {
    List<brigade_worker> getAllBrigadeWorkers();
    List<brigade_worker> getBrigadeWorkersByDepartment(int department);
    double getAverageSalary();
    brigade_worker getBrigadeWorkerById(int id);
    void addBrigadeWorker(brigade_worker worker);
    void updateBrigadeWorker(brigade_worker worker);
    void deleteBrigadeWorker(int id);
}
