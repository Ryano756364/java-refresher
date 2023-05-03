package org.example._10_junit_5_testing;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClinicCalendarShould {

    @Test  //Inidcates to J
    public void allowEntryOfAnAppointment(){
        ClinicCalendar calendar = new ClinicCalendar();

        calendar.addAppointment("Jim", "Weaver", "avery",
                "05/03/2023 2:34 PM");

        List<PatientAppointment> appointments = calendar.getAppointments();

        //Testing for the input of data
        assertNotNull(appointments);
        assertEquals(1,appointments.size());

        //Testing for the extraction of data
        PatientAppointment enteredAppt = appointments.get(0);
        assertEquals("Jim", enteredAppt.getPatientFirstName());
        assertEquals("Weaver", enteredAppt.getPatientLastName());
        assertEquals(Doctor.avery, enteredAppt.getDoctor());
        assertEquals("05/03/2023 2:34 PM",
                enteredAppt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("MM/dd/yyy h:mm a")));
    }

}
