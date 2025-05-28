package com.abes.medx.util;

import java.util.HashMap;
import java.util.Map;

import com.abes.medx.dto.Patient;   


public class CollectionUtil {
        public static final Map<Integer, Patient> patientMap = new HashMap<>();

        static {
            // Static Patient Data
            patientMap.put(1, new Patient("Raj", "Verma", "raj@gmail.com", "1234567890", "20", "P001"));
            patientMap.put(2, new Patient("Yatharth", "Yadav", "yath@gmail.com", "1234599990", "21", "P002"));

        }
}
