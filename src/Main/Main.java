package Main;
import ComponentClasses.Allergen;
import ComponentClasses.Ingredient;

public class Main {

	public static void main(String[] args) {
		Allergen a = new Allergen();
		Allergen b = new Allergen();
		a.setCode(1);
		b.setCode(3);
		System.out.println(a.getCode() + "   " + a.getName() + "///// " + b.getCode()
				+ "     " + b.getName());

		Ingredient breadcrumb = new Ingredient();
		breadcrumb.setCode(3);
		breadcrumb.setName("breadcrumbs");
		breadcrumb.setMeasuringMethodCode("u");
		breadcrumb.setkCal(395);
		breadcrumb.setCarbs(71.98);
		breadcrumb.setProtein(13.15);
		breadcrumb.setFat(5.3);
		breadcrumb.setSalt(2.0);
		breadcrumb.getAllergens().add(new Allergen(1));
		breadcrumb.getAllergens().add(new Allergen(7));
		breadcrumb.getAllergens().add(new Allergen(14));

		System.out.println("Breadcrumb info:");
		System.out.println(" Served in " + breadcrumb.getMeasuringMethod());
		System.out.println(" Energy    " + breadcrumb.getkJul());
		System.out.println(" Allergens    ");
		for (Allergen z : breadcrumb.getAllergens()) {

			System.out.println("Item is: " + z.getName());

		}
		if (breadcrumb.hasAllergen(1))
			System.out.println("Gluten!!!!!!");
		if (breadcrumb.hasAllergen(2))
			System.out.println("KAKA!!!!!!");
		System.out.println(breadcrumb.retrieveName(3));
		System.out.println(breadcrumb.retrieveCode("breadcrumbs"));
	}

}
