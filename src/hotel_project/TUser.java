package hotel_project;

public class TUser {

	public String Login;
	protected String Haslo;
	public String Email;
	protected String Pesel;
	protected String Imie;
	protected String Nazwisko;


	public void TUser(String Login, String Haslo, String Email, String Pesel, String Imie, String Nazwisko) {
		this.Login = Login;
                this.Haslo = Haslo;
                this.Email = Email;
                this.Pesel = Pesel;
                this.Imie = Imie;
                this.Nazwisko = Nazwisko;
	}

	public String getLogin() {
		return this.Login;
	}

	public void setLogin(String Login) {
                this.Login = Login;
	}

	public String getHaslo() {
		return this.Haslo;
	}

	public void setHaslo(String Haslo) {
                this.Haslo = Haslo;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
                this.Email = Email;
	}

	public String getPesel() {
		return this.Pesel;
	}

	public void setPesel(String Pesel) {
                this.Pesel = Pesel;
	}

	public String getImie() {
		return this.Imie;
	}

	public void setImie(String Imie) {
                this.Imie = Imie;
	}

	public String getNazwisko() {
		return this.Nazwisko;
	}

	public void setNazwisko(String Nazwisko) {
                this.Nazwisko = Nazwisko;
	}

}
