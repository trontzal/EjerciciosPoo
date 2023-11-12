
public class Cuenta {
	private String nombre;
	private String numeroCuenta;
	private Double tipoInteres;
	private Double saldo;

	// Constructores**********************
	// Constructor por defecto
	public Cuenta() {

	}

	// Contructor con parametros
	public Cuenta(String nombre, String numeroCuenta, Double tipoInteres, Double saldo) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	// Constructor copia
	public Cuenta(final Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(Double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	// Metdodos ********************************
	// Metodo ingreso
	public boolean ingreso(double cantidad) {
		if (cantidad >= 0) {
			saldo += cantidad;
			return true;
		} else {
			return false;
		}
	}

	// Metodo reintegro
	public boolean reintegro(double cantidad) {
		if (cantidad >= 0 && saldo >= cantidad) {
			saldo -= cantidad;
			return true;
		} else {
			return false;
		}
	}

	// Metodo transferencia
	public boolean transferencia(Cuenta cuentaDestino, double cantidad) {
		if (cantidad >= 0 && saldo >= cantidad) {
			saldo -= cantidad;
			cuentaDestino.saldo += cantidad;
			return true;
		} else {
			return false;
		}
	}

}
