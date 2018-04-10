package prescriptions.tests;

import java.util.ArrayList;
import java.util.Collection;
import junit.framework.TestCase;
import prescriptions.Prescription;
import prescriptions.PrescriptionDatabase;
import prescriptions.Pharmacy;

public class PharmacyTest extends TestCase {
    private static final int NUMBER_OF_PRESCRIPTIONS = 100;
    private static final String PRESCRIBER = "Dr. Jekyll";
    private static final long SLEEP_MILLIS = 2000;
    
    private Pharmacy pharmacy;

    public PharmacyTest(String name) {
	super(name);
    }
    
    @Override
    protected void setUp() throws Exception {
	final PrescriptionDatabase database = getDatabase(NUMBER_OF_PRESCRIPTIONS, SLEEP_MILLIS);
	pharmacy = new Pharmacy(database);
    }
    
    public void testFindPrescriptions() {
	final Collection<Prescription> prescriptions =
	    pharmacy.findPrescriptionsByPrescriber(PRESCRIBER);

	assertEquals(NUMBER_OF_PRESCRIPTIONS, prescriptions.size());
	assertPrescriber(PRESCRIBER, prescriptions);
    }

    private void assertPrescriber(String prescriber, Collection<Prescription> prescriptions) {
	for (Prescription p: prescriptions)
	    assertEquals(prescriber, p.getPrescriber());
    }
    
    private PrescriptionDatabase getDatabase(final int numberOfPrescriptions, final long millis) {
	return new PrescriptionDatabase() {
	    @Override
	    public Collection<Prescription> listByPrescriber(String prescriber) {
		trySleeping(millis);
		Collection<Prescription> prescriptions = new ArrayList<>();
		for (int i=0; i < numberOfPrescriptions; i++)
		    prescriptions.add(getPrescription(prescriber));
		return prescriptions;
	    }

	    private void trySleeping(long millis) {
		try {
		    Thread.sleep(millis);
		}
		catch (InterruptedException e) {}
	    }
	    
	    private Prescription getPrescription(String prescriber) {
		return new Prescription() {
		    @Override
		    public String getPrescriber() {
			return prescriber;
		    }
		};
	    }

	};
    }
}
