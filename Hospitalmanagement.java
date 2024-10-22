// Patient.java
public class Patient {
    private String id;
    private String name;
    private String gender;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private String medicalHistory;

    public Patient(String id, String name, String gender, String address, String phoneNumber, String dateOfBirth, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.medicalHistory = medicalHistory;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getMedicalHistory() { return medicalHistory; }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Gender: " + gender;
    }
}
// Appointment.java
import java.util.Date;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private Date appointmentDate;
    private String status; // Scheduled, Completed, or Cancelled

    public Appointment(String appointmentId, String patientId, String doctorId, Date appointmentDate, String status) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    public String getAppointmentId() { return appointmentId; }
    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public Date getAppointmentDate() { return appointmentDate; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId + ", Patient ID: " + patientId + ", Doctor ID: " + doctorId;
    }
}
// HealthRecord.java
public class HealthRecord {
    private String recordId;
    private String patientId;
    private String diagnosis;
    private String treatment;
    private String doctorId;
    private String dateOfVisit;

    public HealthRecord(String recordId, String patientId, String diagnosis, String treatment, String doctorId, String dateOfVisit) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.doctorId = doctorId;
        this.dateOfVisit = dateOfVisit;
    }

    public String getRecordId() { return recordId; }
    public String getPatientId() { return patientId; }
    public String getDiagnosis() { return diagnosis; }
    public String getTreatment() { return treatment; }
    public String getDoctorId() { return doctorId; }
    public String getDateOfVisit() { return dateOfVisit; }

    @Override
    public String toString() {
        return "Health Record ID: " + recordId + ", Patient ID: " + patientId + ", Diagnosis: " + diagnosis;
    }
}
// Invoice.java
public class Invoice {
    private String invoiceId;
    private String patientId;
    private double totalAmount;
    private String billingDate;

    public Invoice(String invoiceId, String patientId, double totalAmount, String billingDate) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.totalAmount = totalAmount;
        this.billingDate = billingDate;
    }

    public String getInvoiceId() { return invoiceId; }
    public String getPatientId() { return patientId; }
    public double getTotalAmount() { return totalAmount; }
    public String getBillingDate() { return billingDate; }

    @Override
    public String toString() {
        return "Invoice ID: " + invoiceId + ", Patient ID: " + patientId + ", Total: " + totalAmount;
    }
}
// MedicalSupply.java
public class MedicalSupply {
    private String supplyId;
    private String name;
    private int quantity;
    private double pricePerUnit;

    public MedicalSupply(String supplyId, String name, int quantity, double pricePerUnit) {
        this.supplyId = supplyId;
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getSupplyId() { return supplyId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPricePerUnit() { return pricePerUnit; }

    @Override
    public String toString() {
        return "Supply ID: " + supplyId + ", Name: " + name + ", Quantity: " + quantity;
    }
}
// Staff.java
public class Staff {
    private String staffId;
    private String name;
    private String role; // Doctor, Nurse, Admin
    private String department;
    private double salary;

    public Staff(String staffId, String name, String role, String department, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.department = department;
        this.salary = salary;
    }

    public String getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Staff ID: " + staffId + ", Name: " + name + ", Role: " + role;
    }
}
// HospitalService.java
import java.util.*;

public class HospitalService {
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<HealthRecord> healthRecords = new ArrayList<>();
    private List<Invoice> invoices = new ArrayList<>();
    private List<MedicalSupply> supplies = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();

    // Patient management methods
    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient Registered: " + patient);
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment Scheduled: " + appointment);
    }

    public void addHealthRecord(HealthRecord record) {
        healthRecords.add(record);
        System.out.println("Health Record Added: " + record);
    }

    public void generateInvoice(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice Generated: " + invoice);
    }

    public void addSupply(MedicalSupply supply) {
        supplies.add(supply);
        System.out.println("Supply Added: " + supply);
    }

    public void hireStaff(Staff staff) {
        staffMembers.add(staff);
        System.out.println("Staff Hired: " + staff);
    }
}
// HospitalManagementSystem.java
import java.util.Date;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        HospitalService hospitalService = new HospitalService();

        // Sample data for patients, appointments, and staff
        Patient patient = new Patient("P001", "John Doe", "Male", "123 Elm St", "555-1234", "1990-01-01", "No history");
        hospitalService.registerPatient(patient);

        Appointment appointment = new Appointment("A001", "P001", "D001", new Date(), "Scheduled");
        hospitalService.scheduleAppointment(appointment);

        HealthRecord healthRecord = new HealthRecord("HR001", "P001", "Flu", "Rest and fluids", "D001",
