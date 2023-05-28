package __k2.__sem2.arh.kurs.locomative_drivers;

import __k2.__sem2.arh.kurs.worker.worker;

public class locomative_drivers extends worker {
   private String medical_examination_2022;
   private String medical_examination_2023;
    public locomative_drivers(int id, String surename,String name, String gender, int age, 
         int workExperience,  int salary,String medical_examination_2022,String medical_examination_2023) {
        super(id, name, surename, age, gender, workExperience, salary);
        this.medical_examination_2022 = medical_examination_2022;
        this.medical_examination_2023 = medical_examination_2023;
    }
    public String getMedical_examination_2022() {
        return medical_examination_2022;
    }
    public void setMedical_examination_2022(String medical_examination_2022) {
        this.medical_examination_2022 = medical_examination_2022;
    }
    public String getMedical_examination_2023() {
        return medical_examination_2023;
    }
    public void setMedical_examination_2023(String medical_examination_2023) {
        this.medical_examination_2023 = medical_examination_2023;
    }
    
}
