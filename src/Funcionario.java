class Funcionario {

	private double salarioBase;
	private int horasExtras;
	private Data dataAdmissao;

	Funcionario() {

	}

	Funcionario(double salarioBase, int horasExtras, Data dataAdmissao) {

		this.salarioBase = salarioBase;
		this.horasExtras = horasExtras;
		this.dataAdmissao = dataAdmissao;
	}

	public double salarioLiquido() {
		double salarioLiquido;
		salarioLiquido = this.salarioBase + this.valorHorasExtras() - this.valorValeTransporte(100);
		System.out.println(salarioLiquido);
		return salarioLiquido;
	}

	public void reajustarSalario(double porcentagem) {
		this.salarioBase *= porcentagem;
	}

	public double decimoTerceiro() {
		int mesesValidos;
		double valorDecimoTerceiro;
		if (this.dataAdmissao.getDia() <= 15)
			mesesValidos = 12 - (this.dataAdmissao.getMes() - 1);
		else
			mesesValidos = 12 - this.dataAdmissao.getMes();
		valorDecimoTerceiro = (this.salarioBase / 12) * mesesValidos;
		return valorDecimoTerceiro;
	}

	private double valorHorasExtras() {
		double valorExtra;
		valorExtra = this.salarioBase / 90.00;
		return valorExtra;
	}

	private double valorValeTransporte(double valPassagem) {
		double valorValeTransporte;
		double maior, menor;
		maior = this.salarioBase * (6 / 100.00);
		menor = 44 * valPassagem;
		if (maior > menor)
			valorValeTransporte = menor;
		else
			valorValeTransporte = maior;
		return valorValeTransporte;
	}
}
