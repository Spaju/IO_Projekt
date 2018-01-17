package hotel_project;

//import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class TPokoj {


	protected int Numer;
	protected int Il_miejsc;
	protected THotel Hotel;
	protected String Klasa;
	protected float Cena;
	protected String Stan;
	protected List<TRezerwacja> Rezerwacje = new ArrayList<>();

        
	public void TPokoj(int Numer, int Il_miejsc, THotel Hotel, String Klasa, float Cena, String Stan) {
		this.Numer = Numer;
                this.Il_miejsc = Il_miejsc;
                this.Hotel = Hotel;
                this.Klasa = Klasa;
                this.Cena = Cena;
                this.Stan = Stan;        
	}
        
        public void TPokoj(String[] data, THotel Hotel) {
		this.Numer = Integer.parseInt(data[1]);
                this.Il_miejsc = Integer.parseInt(data[5]);
                this.Klasa = data[4];
                this.Cena = Float.parseFloat(data[2]);
                this.Stan = data[3];
                this.Hotel = Hotel;
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

	@Override
        public boolean equals(Object obj) {
                if(this == obj)
                    return true;
		if(obj == null)
                    return false;
                if(getClass() != obj.getClass())
                    return false;
                TPokoj other = (TPokoj) obj;
                if(this.Numer == other.Numer)
                    if(this.Il_miejsc == other.Il_miejsc)
                        if(this.Cena == other.Cena)
                            return true;
                return false;
        }
}
