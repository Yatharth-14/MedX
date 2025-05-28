package com.abes.medx.util;

import java.util.HashMap;
import java.util.Map;

import com.abes.medx.dto.Patient;   


public class CollectionUtil {
        public static final Map<Integer, Patient> patientMap = new HashMap<>();

        static {
            // Static Patient Data
            patientMap.put(1, new Patient("Raj", "Verma", "raj@gmail.com", "1234567890", "20", "P001"));
        }
}
