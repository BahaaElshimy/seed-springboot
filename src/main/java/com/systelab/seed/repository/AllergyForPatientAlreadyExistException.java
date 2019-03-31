package com.systelab.seed.repository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class AllergyForPatientAlreadyExistException extends RuntimeException {

    private final String patientId;
    private final String allergyId;

    public AllergyForPatientAlreadyExistException(UUID patientId, UUID allergyId) {
        super("allergy-already-exist-" + patientId.toString() + "-" + allergyId);
        this.patientId = patientId.toString();
        this.allergyId = allergyId.toString();
    }

    public String getPatientId() {
        return patientId;
    }

    public String getAllergyId() {
        return allergyId;
    }

}