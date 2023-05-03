package org.example._10_junit_5_testing;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClinicCalendarShould {

    @Test
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
        assertSame(Doctor.avery, enteredAppt.getDoctor());
        assertEquals("05/03/2023 2:34 PM",
                enteredAppt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("MM/dd/yyy h:mm a")));
    }

    @Test
    public void returnTrueForHasAppointmentsIfThereAreAppointments() {
        ClinicCalendar calendar = new ClinicCalendar();
        calendar.addAppointment("Jim", "Weaver",
                "avery", "05/03/2023 2:00 pm");
        assertTrue(calendar.hasAppointment(LocalDate.of(2023, 5, 3)));
    }

    @Test
    public void returnFalseForHasAppointmentsIfThereAreNoAppointments() {
        ClinicCalendar calendar = new ClinicCalendar();
        assertFalse(calendar.hasAppointment(LocalDate.of(2023, 5, 3)));
    }

}
