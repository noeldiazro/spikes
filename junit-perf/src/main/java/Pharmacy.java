package prescriptions;

import java.util.Collection;

public class Pharmacy {
    private final PrescriptionDatabase database;
    
    public Pharmacy(PrescriptionDatabase database) {
	this.database = database;
    }

    public Collection<Prescription> findPrescriptionsByPrescriber(String prescriber) {
	return database.listByPrescriber(prescriber);
    }
}
