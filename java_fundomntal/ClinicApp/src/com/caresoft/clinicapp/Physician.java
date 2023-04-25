package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;

    // Constructor
    public Physician(Integer id) {
        super(id);
        this.patientNotes = new ArrayList<String>();
    }

    // HIPAACompliantUser interface implementation
//    @Override
    public boolean assignPin(int pin) {
        if (pin > 999 && pin < 10000) {
            this.pin = pin;
            return true;
        }
        else {
            return false;
        }
    }

//    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return confirmedAuthID.equals(this.id);
    }

    // newPatientNotes method
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // Getters and Setters
    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

}
