package hotel_project;

import java.util.List;


public class TPokoj {

	protected int Numer;
	protected int Il_miejsc;
	protected THotel Hotel;
	protected String Klasa;
	protected float Cena;
	protected String Stan;
	protected List<TRezerwacja> Rezerwacje;

        
	public void TPokoj(int Numer, int Il_miejsc, THotel Hotel, String Klasa, float Cena, String Stan) {
		this.Numer = Numer;
                this.Il_miejsc = Il_miejsc;
                this.Hotel = Hotel;
                this.Klasa = Klasa;
                this.Cena = Cena;
                this.Stan = Stan;
                
	}
           @Override
	public String toString() {
		return this.Numer + " " + this.Il_miejsc + " " + this.Hotel.toString() + " " + this.Klasa + " " + this.Cena + " " + this.Stan;
	}

	public int getNumer() {
		return this.Numer;
	}

	public void setNumer(int Numer) {
		this.Numer = Numer;
	}

	public int getIl_miejsc() {
		return this.Il_miejsc;
        }

	public void setIl_miejsc(int Il_miejsc) {
		this.Il_miejsc = Il_miejsc;
	}

	public String getHotel() {
		return this.Hotel.toString();
	}

	public void setHotel(THotel Hotel) {
		this.Hotel = Hotel;
	}

	public String getKlasa() {
		return this.Klasa;
	}

	public void setKlasa(String Klasa) {
		this.Klasa = Klasa;
	}

	public float getCena() {
		return this.Cena;
	}

	public void setCena(Float Cena) {
		this.Cena = Cena;
	}

	public String getStan() {
		return this.Stan;
	}

	public void setStan(String Stan) {
		this.Stan = Stan;
	}

	public boolean equals(TPokoj obj) {
		if(obj == null)
                    return false;
                if(this.Numer == obj.Numer)
                    return this.Hotel == obj.Hotel;
                else
                    return false;
	}

	public THotel searchHotel() {	
            throw new UnsupportedOperationException();
	}

}
