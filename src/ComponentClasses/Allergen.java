package ComponentClasses;
public class Allergen {
	int code;
	String name;

	public Allergen() {
	}

	public Allergen(int i) {
		this.setCode(i);
	}
	
	public Allergen(int i, String code) {
		this.setCode(i);
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
		switch (code) {
		case 1:
			this.name = "gluten";
			break;
		case 2:
			this.name = "shellfish";
			break;
		case 3:
			this.name = "eggs";
			break;
		case 4:
			this.name = "fish";
			break;
		case 5:
			this.name = "peanuts";
			break;
		case 6:
			this.name = "soy";
			break;
		case 7:
			this.name = "dairy";
			break;
		case 8:
			this.name = "nuts";
			break;
		case 9:
			this.name = "celery";
			break;
		case 10:
			this.name = "mustard";
			break;
		case 11:
			this.name = "sesame";
			break;
		case 12:
			this.name = "sulphites";
			break;
		case 13:
			this.name = "mollusk";
			break;
		case 14:
			this.name = "lupin";
			break;
		default:
			this.name = "";
			break;
		}
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
