package soup.on.plate;

public class Validator {

	public String validate(String arg) {
		if(arg.contains("$") || arg.contains("%")) {
			return "illegal character";
		}
		return "OK";
	}
}
