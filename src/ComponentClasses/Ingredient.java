package ComponentClasses;
import java.util.ArrayList;
import java.util.Iterator;

public class Ingredient {

	int code;
	String name;
	String measuringMethodCode;
	String measuringMethod;
	double kCal;
	double kJul;
	double carbs;
	double protein;
	double fat;
	double salt;
	ArrayList<Allergen> allergens = new ArrayList<Allergen>();

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeasuringMethodCode() {
		return measuringMethodCode;
	}

	public void setMeasuringMethodCode(String measuringMethodCode) {
		this.measuringMethodCode = measuringMethodCode.toLowerCase();
		switch (this.measuringMethodCode) {
		case "u":
			this.measuringMethod = "unit";
			break;
		case "g":
			this.measuringMethod = "grams";
			break;
		case "ml":
			this.measuringMethod = "mililiters";
			break;
		default:
			this.measuringMethod = "";
			break;
		}
	}

	public String getMeasuringMethod() {
		return measuringMethod;
	}

	public void setMeasuringMethod(String measuringMethod) {
		this.measuringMethod = measuringMethod;
	}

	public double getkCal() {
		return kCal;
	}

	public void setkCal(double kCal) {
		this.kCal = kCal;
		this.kJul = kCal / 4.184;
	}

	public double getkJul() {
		return kJul;
	}

	public void setkJul(double kJul) {
		this.kJul = kJul;
		this.kCal = kJul * 4.184;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getSalt() {
		return salt;
	}

	public void setSalt(double salt) {
		this.salt = salt;
	}

	public ArrayList<Allergen> getAllergens() {
		return allergens;
	}

	public void setAllergens(ArrayList<Allergen> allergens) {
		this.allergens = allergens;
	}

	public String retrieveName(int code) {
		String name = "";
		if (code == this.code)
			name = this.name;
		return name;
	}

	public int retrieveCode(String name) {
		int code = 0;
		if (name == this.name)
			code = this.code;
		return code;
	}

	public boolean hasAllergen(int code) {
		boolean ok = false;
		for (Iterator<Allergen> it = this.allergens.iterator(); it.hasNext();) {
			if (it.next().code == code) ok = true;
		}
		return ok;
	}

}
