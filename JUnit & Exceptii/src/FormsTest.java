import java.util.ArrayList;
import java.util.List;
//import Forms;
import org.junit.Assert;
import org.junit.Test;

public class FormsTest {
//TODO : sa imi explice cineva cum folosesc .class-urile 
	private List<GeometricForms> geomForm;
	
	@org.junit.Before
	public void setUp() {
		geomForm = new ArrayList<GeometricForms>();
		
		geomForm.add(new GeometricForms(Forms.CIRCLE.toString()));
		geomForm.add(new GeometricForms(Forms.RECTANGLE.toString()));
		geomForm.add(new GeometricForms(Forms.TRIANGLE.toString()));
	}
	
	@org.junit.Test
	public void testIsCircle() {


		Assert.assertTrue(geomForm.get(0).isCircle());
		Assert.assertFalse(geomForm.get(1).isCircle());
		Assert.assertFalse(geomForm.get(2).isCircle());
	}
}
