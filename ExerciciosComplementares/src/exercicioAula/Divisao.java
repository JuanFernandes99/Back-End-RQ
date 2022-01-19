package exercicioAula;
//tipo (wc,cozinha)
public class Divisao {
	
private TipoDivisao tipo;
private double m2;
private int numJanelas;
private int numLugares;
public Divisao(TipoDivisao aTipo, double aM2, int aNumJanelas, int aNumLugares) {

	tipo = aTipo;
	m2 = aM2;
	numJanelas = aNumJanelas;
	numLugares = aNumLugares;
}
public TipoDivisao getTipo() {
	return tipo;
}
public double getM2() {
	return m2;
}
public int getNumJanelas() {
	return numJanelas;
}
public int getNumLugares() {
	return numLugares;
}
public void setTipo(TipoDivisao aTipo) {
	this.tipo = aTipo;
}
public void setM2(double aM2) {
	this.m2 = aM2;
}
public void setNumJanelas(int aNumJanelas) {
	this.numJanelas = aNumJanelas;
}
public void setNumLugares(int aNumLugares) {
	this.numLugares = aNumLugares;
}


}
