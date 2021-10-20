class Data {

	private int ano;
	private int mes;
	private int dia;

	Data() {

	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return ano;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

//Adicionar Dia
	public void adicionarDia(int x) {

		for (int i = 0; i < x; i++)
			adicionarDia();
	}

	private int adicionarDia() {
		if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
				|| this.mes == 12) {

			this.dia++;
			if (dia == 32) {
				dia = 1;
				adicionarMes(mes, dia);
			}
		} else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
			this.dia++;
			if (dia == 31) {
				dia = 1;
				adicionarMes(mes, dia);
			}
		} else if (this.mes == 2 && ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0))) {
			this.dia++;
			if (dia == 30) {
				dia = 1;
				adicionarMes(mes, dia);
			}
		} else {
			this.dia++;
			if (dia == 29) {
				dia = 1;
				adicionarMes(mes, dia);
			}
		}
		return this.dia;
	}

//Adicionar Mês
	public int adicionarMes(int mes, int dia) {

		if (this.mes == 12 && this.dia == 1) {
			adicionaAno();
		}
		return this.mes++;
	}

	public int adicionaAno() {
		mes = 0;
		return this.ano++;
	}

/*Comparar Datas
Atenção se o método adicionarDia for chamado antes do CompararData essa comparação ocorrerá com a data inicial
com os acréscimos de dias estabelecidos.
*/	
	public void CompararData(int dia1, int mes1, int ano1) {
		if (ano > ano1) {
			ano = ano1;
			mes = mes1;
			dia = dia1;
		} else if (ano == ano1) {
			if (mes > mes1) {
				ano = ano1;
				mes = mes1;
				dia = dia1;
			} else if (mes == mes1) {
				if (dia > dia1) {
					ano = ano1;
					mes = mes1;
					dia = dia1;
				}
			}
		}

	}

//Imprimir
	public void imprimir() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}

	public void imprimirMaisAntiga() {
		System.out.println("A data mais antiga é: " + dia + "/" + mes + "/" + ano);
	}
}
