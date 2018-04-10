package prescriptions;

import java.util.Collection;

public interface PrescriptionDatabase {
    Collection<Prescription> listByPrescriber(String prescriber);
}
