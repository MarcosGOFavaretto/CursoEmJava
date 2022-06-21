package utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Utils() {
	}

	public static String formatDate(Date dateToFormat) {
		return sdf.format(dateToFormat);
	}

}