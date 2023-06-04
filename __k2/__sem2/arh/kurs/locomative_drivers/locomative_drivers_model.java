package __k2.__sem2.arh.kurs.locomative_drivers;

import __k2.__sem2.arh.kurs.worker.worker_model;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class locomative_drivers_model extends worker_model {
    private StringProperty medical_examination_2022;
    private StringProperty medical_examination_2023;
     public locomative_drivers_model(int id, String surename,String name, String gender, int age, 
          int workExperience,  int salary,String medical_examination_2022,String medical_examination_2023) {
         super(id, name, surename, age, gender, workExperience, salary);
         this.medical_examination_2022 =  new SimpleStringProperty(medical_examination_2022);
         this.medical_examination_2023 =  new SimpleStringProperty(medical_examination_2023);
     }
    public StringProperty getMedical_examination_2022() {
        return medical_examination_2022;
    }
    public void setMedical_examination_2022(StringProperty medical_examination_2022) {
        this.medical_examination_2022 = medical_examination_2022;
    }
    public StringProperty getMedical_examination_2023() {
        return medical_examination_2023;
    }
    public void setMedical_examination_2023(StringProperty medical_examination_2023) {
        this.medical_examination_2023 = medical_examination_2023;
    }
}
