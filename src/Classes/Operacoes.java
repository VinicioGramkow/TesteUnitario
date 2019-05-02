package Classes;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;

public class Operacoes {

	public double media(List<Numero> numeros) {
		double med = 0;
		for (int i = 0; i < numeros.size(); i++) {
			med += numeros.get(i).getNumero();
		}
		med = med / numeros.size();
		
		DecimalFormat df = new DecimalFormat("0.00");
		String formatado = df.format(med);
		formatado = formatado.replaceAll(",", ".");
		double media = Double.parseDouble(formatado);
		
		return media;
	}

	public double moda(List<Numero> numeros) {
		int vezes = 0;
		double mod = 0;
		int compara = 0;
		for (int i = 0; i < numeros.size(); i++) {
			vezes = 0;
			for (int j = i + 1; j < numeros.size(); j++) {
				if (numeros.get(i).getNumero() == numeros.get(j).getNumero()) {
					vezes++;
				}
			}
			if (vezes > compara) {
				mod = numeros.get(i).getNumero();
				compara = vezes;
			}
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		String formatado = df.format(mod);
		formatado = formatado.replaceAll(",", ".");
		double moda = Double.parseDouble(formatado);
		
		return moda;
	}

	public double mediana(List<Numero> numeros) {
		numeros.sort(Comparator.comparingDouble(Numero::getNumero));

		int meio;
		double med;

		meio = numeros.size() / 2;

		if (numeros.size() % 2 != 0) {
			med = numeros.get(meio).getNumero();
		} else {
			med = (numeros.get(meio - 1).getNumero() + numeros.get(meio).getNumero()) / 2;
		}

		DecimalFormat df = new DecimalFormat("0.00");
		String formatado = df.format(med);
		formatado = formatado.replaceAll(",", ".");
		double mediana = Double.parseDouble(formatado);
		
		return mediana;
	}
	
	public double variancia(List<Numero> numeros){
		double var = 0;
		for(int i = 0; i < numeros.size(); i++) {
			double resultado = (numeros.get(i).getNumero() -  media(numeros));
			var += resultado * resultado;
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		String formatado = df.format(var/(numeros.size() - 1));
		formatado = formatado.replaceAll(",", ".");
		double variancia = Double.parseDouble(formatado);
		
		return variancia;
	}
	
	public double desvioPadrao(List<Numero> numeros) {
				
		DecimalFormat df = new DecimalFormat("0.00");
		String formatado = df.format(Math.sqrt(variancia(numeros)));
		formatado = formatado.replaceAll(",", ".");
		double desvio = Double.parseDouble(formatado);
		
		return desvio;
	}

}
