package hotel_project;

public class TRezerwacja {

	protected int ID_rezerwacji;
	public String Data;
	public String Czas_trwania;
	public TPokoj Pokoj;
	protected TUser Klient;

	public void TRezerwacja(int ID_rezerwacja, String Data, String Czas_trwania, TPokoj Pokoj, TUser Klient) {
		this.ID_rezerwacji = ID_rezerwacji;
                this.Data = Data;
                this.Czas_trwania = Czas_trwania;
                this.Pokoj = Pokoj;
                this.Klient = Klient;
	}
        
            @Override
	public String toString() {
		return this.ID_rezerwacji + ", " + this.Data + ", " + this.Czas_trwania + ", " + this.Pokoj.toString() + ", " + this.Klient.toString();
	}

	public int getID_rezerwacji() {
		return this.ID_rezerwacji;
	}

	public void setID_rezerwacji(int ID_rezerwacji) {
		this.ID_rezerwacji = ID_rezerwacji;
	}

	public String getData() {
                return this.Data;
	}

	public void setData(String Data) {
		this.Data = Data;
	}

	public String getCzas_trwania() {
		return this.Czas_trwania;
	}

	public void setCzas_trwania(String Czas_trwania) {
		this.Czas_trwania = Czas_trwania;
	}

	public String getPokoj() {
		return this.Pokoj.toString();
	}

	public void setPokoj(TPokoj Pokoj) {
		this.Pokoj = Pokoj;
	}

	public String getKlient() {
		return this.Klient.toString();
	}

	public void setKlient(TUser Klient) {
		this.Klient = Klient;
	}

}
