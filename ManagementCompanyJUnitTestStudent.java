import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ManagementCompanyJUnitTestStudent {
	@Test
	public void testAddProperty1() {
		ManagementCompany mgP = new ManagementCompany("New Comp", "Hello-9080");
		Property property = new Property("Montgomery College", "Takoma Park", 900000, "Huseyin Aygun");
		int result = mgP.addProperty(property);
		assertEquals(0, result);
		property.setCity("Germantown");
		property.setOwner("Grigoriy Grinberg");
		property.setPropertyName("Naval Academy");
		property.setRentAmount(9000);
		result = mgP.addProperty(property);
		assertEquals(1, result);
		result = mgP.addProperty(property);
		assertEquals(2, result);
		result = mgP.addProperty(property);
		assertEquals(-1, result);
	}
	@Test
	public void testAddProperty2() {
		ManagementCompany mgP2 = new ManagementCompany("New Comp", "Hello-9080");
		Property property = new Property("Montgomery College", "Takoma Park", 900000, "Huseyin Aygun");
		int result = mgP2.addProperty(property);
		assertEquals(0, result);
		property.setCity("Germantown");
		property.setOwner("Grigoriy Grinberg");
		property.setPropertyName("Naval Academy");
		property.setRentAmount(9000);
		result = mgP2.addProperty(property);
		assertEquals(1, result);
		result = mgP2.addProperty(property);
		assertEquals(2, result);
		result = mgP2.addProperty(property);
		assertEquals(-1, result);
		ManagementCompany mgPp2 = new ManagementCompany(mgP2);
		ManagementCompany managementCompany = new ManagementCompany(mgP2);
		managementCompany.addProperty(new Property("Property Name", "City", 787878, "Owner"));
		mgP2 = managementCompany;
		assertFalse(mgP2==mgPp2, "Not equal");		
	}
	@Test
	public void testTotalRent1() {
		ManagementCompany mgPp = new ManagementCompany("New Comp", "Hello-9080");
		Property property = new Property("Montgomery College", "Takoma Park", 900000, "Huseyin Aygun");
		mgPp.addProperty(property);
		assertEquals(900000, mgPp.totalRent());
		mgPp.addProperty(property);
		assertEquals(1800000, mgPp.totalRent());
		
	}
	@Test
	public void testTotalRent2() {
		ManagementCompany manageCompany = new ManagementCompany("New Company", "9080-90-9080");
		Property property = new Property("UMBC", "Baltimore", 900, "Huseyin Aygun");
		manageCompany.addProperty(property);
		assertEquals(900, manageCompany.totalRent());
		manageCompany.addProperty(property);
		assertEquals(1800, manageCompany.totalRent());
		
	}
	@Test
	public void testEverything() {
		ManagementCompany manage = new ManagementCompany("Gerg's produce", "89-890-7676");
		Property prop = new Property("Tomatoes", "Jackson", 780, "Ger Johnson");
		int result;
		result =manage.addProperty(prop);
		assertEquals(0,result);
		prop.setPropertyName("Pears");
		result=manage.addProperty(prop);
		assertEquals(1, result);
		ManagementCompany newCompany = new ManagementCompany(manage);
		prop.setRentAmount(-9000.0);
		result =newCompany.addProperty(prop);
		assertEquals(1, result);
		assertTrue(result+1==manage.getPropertyCount()&& result+1 == newCompany.getPropertyCount(), "Equal");
		//
		
	}
	

}
