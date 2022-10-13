package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String filename = "C:\\Users\\ocean\\Downloads\\seoul_hospital_infos.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);

        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getSqlInsertQuery());
        }
    }
}
