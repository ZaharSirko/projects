package __k2.__sem2.arh.kurs.railway_station_worker;

import __k2.__sem2.arh.kurs.worker.worker_model;

public class railway_station_worker_model extends worker_model {
    public railway_station_worker_model(){
        super();
    }
    public railway_station_worker_model(int id, String name, String surename, int age, String gender,int children, String chief,
            int department, int work_experience, int salary) {
        super(id, name, surename, age, gender, chief, department, work_experience, children, salary);
    }
}
