package eduardo.util;

class Data {
	private int ano, mes, dia;
	private final int DIA_MAX = 31, MES_MAX = 12;
	
	public Data() {	}
	
	public Data(int dia, int mes,  int ano){
		setDia(dia);
		setMes(mes);
		this.ano = ano;
	}


	public void setDia(int dia) {
		if(dia > 0 && dia <= DIA_MAX) {
			this.dia = dia;
		} else {
			System.out.println("O dia é invalido!");
		}
	}
	public int getDia() {
		return dia;
	}


	public void setMes(int mes) {
		if(mes > 0 && mes <= MES_MAX) {
			this.mes = mes;
		} else {
			System.out.println("O mês é invalido!");
		}
	}
	public int getMes() {
		return mes;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}

	public String formatar(int a, int b, int c) {
		String formatado = a + "/" + b + "/" + c;
		return formatado;
	}

	public String getYMD() {
		return formatar(ano, mes, dia);
	}

	public String getDMY() {
		return formatar(dia, mes, ano);
	}

	public String getMDY() {
		return formatar(mes, dia, ano);
	}
}