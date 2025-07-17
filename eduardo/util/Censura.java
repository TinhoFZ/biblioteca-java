package eduardo.util;

public class Censura {
	private String texto;
	private String[] palavroes = {"cacete", "putamerda", "viado", "vaisefoder", "vsf", "vsfd", "vaitomarnocu",
			"cu", "merda", "filhodaputa", "fdp", "putaquepariu", "pqp", "porra", "caralho", "puta", "putaria"};
	
	public Censura(String texto) {
		this.texto = texto;
		
	}
	
	// Vai separar as palavras diferentes e irá colocá-las em um array
	private String[] formatarTexto() {
		texto = texto.toLowerCase();
		texto.trim();
		String[] palavras = texto.split("[\\s\\-_/+]");
		return palavras;
	}
	
	private String censurar(String palavrao) {
		int letras = palavrao.length();
		palavrao = "";
		
		for(int i = 0; i < letras; i ++) {
			palavrao = palavrao + "*";
		}
		return palavrao;
	}
	
	public String checarCensura() {
		
		String[] palavras = formatarTexto();
		texto = "";
		
		for (int i = 0; i < palavroes.length; i ++) {
			for (String filtro : palavroes) {
				if(palavroes[i].contains(filtro)) {
					palavroes[i] = censurar(palavroes[i]);
					break;
				}
			}
			texto = texto + palavroes[i] + " ";
		}
		
		return texto;
	}
}
