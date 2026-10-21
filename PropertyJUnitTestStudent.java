import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyJUnitTestStudent {
    @Test
    public void testNoArgConstructor() {
    	Property p = new Property();
        assertEquals("Property 1", p.getPropertyName());
        assertEquals("Cleveland", p.getCity());
        assertEquals(900.0, p.getRentAmount(), 0.001);
        assertEquals("Alexander Hamilton", p.getOwner());
    }
    @Test
    public void testArgConstructor1() {
    	Property p = new Property("Greg's Produce", "Hamburg", 101010.10, "Greg Johnson");
        assertEquals("Greg's Produce", p.getPropertyName());
        assertEquals("Hamburg", p.getCity());
        assertEquals(101010.10, p.getRentAmount(), 0.001);
        assertEquals("Greg Johnson", p.getOwner());
        
    }
    @Test
    public void testArgConstructor2() {
    	Property p = new Property("Gregory's Farm Produce", "Hamburger", 1010.10, "Gregory Johnson");
        assertEquals("Gregory's Farm Produce", p.getPropertyName());
        assertEquals("Hamburger", p.getCity());
        assertEquals(1010.10, p.getRentAmount(), 0.001);
        assertEquals("Gregory Johnson", p.getOwner());
        
    }
    @Test
    public void testCopyConstructor1() {
    	Property p = new Property("Greg's Produce", "Hamburg", 101010.10, "Greg Johnson");
    	Property property = new Property(p);
    	p.setCity("Albany");
    	p.setPropertyName("John's Car Company");
    	p.setOwner("Levon Gevorgyan");
    	p.setRentAmount(900.0);
        assertEquals("Greg's Produce", property.getPropertyName());
        assertEquals("Hamburg", property.getCity());
        assertEquals(101010.10, property.getRentAmount(), 0.001);
        assertEquals("Greg Johnson", property.getOwner());
        
    }
    @Test
    public void testCopyConstructor2() {
    	Property p = new Property("Heather's Produce", "Hong Kong", 5000.10, "John Gregson");
    	Property property = new Property(p);
    	p.setCity("Albany");
    	p.setPropertyName("John's Car Company");
    	p.setOwner("Levon Gevorgyan");
    	p.setRentAmount(900.0);
        assertEquals("Heather's Produce", property.getPropertyName());
        assertEquals("Hong Kong", property.getCity());
        assertEquals(5000.10, property.getRentAmount(), 0.001);
        assertEquals("John Gregson", property.getOwner());
        
    }

}
