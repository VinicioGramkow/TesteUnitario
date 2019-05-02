package JSON;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Classes.Numero;

public class JSON {

	public List<Numero> importa() {
		List<Numero> list = new ArrayList<Numero>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Arquivos/Numero.json"));
			Type listType = new TypeToken<ArrayList<Numero>>() {
			}.getType();
			list = new Gson().fromJson(bufferedReader, listType);
			return list;

		} catch (java.io.FileNotFoundException e) {
			return list;
		}
	}

}
