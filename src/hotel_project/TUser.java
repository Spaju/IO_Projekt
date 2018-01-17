package hotel_project;

public class TUser {

	public String Login;
	protected String Haslo;
	public String Email;
	protected String Pesel;
	protected String Imie;
	protected String Nazwisko;


	public void TUser(String Pesell, String Emaill, String Hasloo, String Loginn, String Imiee, String Nazwiskoo) {
		this.Login = Loginn;
                this.Haslo = Hasloo;
                this.Email = Emaill;
                this.Pesel = Pesell;
                this.Imie = Imiee;
                this.Nazwisko = Nazwiskoo;
	}
        
        public void TUser(String data[]) {
		this.Login = data[4];
                this.Haslo = data[3];
                this.Email = data[2];
                this.Pesel = data[1];
                this.Imie = data[5];
                this.Nazwisko = data[6];
	}
        
            @Override
	public String toString() {
		return this.Imie + " " + this.Nazwisko + " " + this.Pesel;
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
        
        @Override
        public boolean equals(Object obj) {
                if(this == obj)
                    return true;
		if(obj == null)
                    return false;
                if(getClass() != obj.getClass())
                    return false;
                TUser other = (TUser) obj;
                return this.Pesel.equals(other.Pesel);
        }

}
