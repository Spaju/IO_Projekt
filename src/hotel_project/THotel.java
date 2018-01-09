package hotel_project;

import java.util.List;
import java.util.Iterator;

public class THotel {

	protected String Nazwa;
	protected String Lokacja;
	protected String Il_wolnych_miejsc;
	protected List<TPokoj> Pokoje;

	public void THotel(String Nazwa, String Lokacja, String Il_wolnych_miejsc, List<TPokoj> Pokoje) {
		this.Nazwa = Nazwa;
                this.Lokacja = Lokacja;
                this.Il_wolnych_miejsc = Il_wolnych_miejsc;
                this.Pokoje = Pokoje;
	}
        
        @Override
	public String toString() {
		return this.Nazwa + " " + this.Lokacja;
	}

	public String getNazwa() {
		return this.Nazwa;
	}

	public void setNazwa(String Nazwa) {
		this.Nazwa = Nazwa;
	}

	public String getLokacja() {
		return this.Lokacja;
	}

	public void setLokacja(String Lokacja) {
		this.Lokacja = Lokacja;
	}

	public String getIl_wolnych_miejsc() {
		return this.Il_wolnych_miejsc;
	}

	public void setIl_wolnych_miejsc(String Il_wolnych_miejsc) {
		this.Il_wolnych_miejsc = Il_wolnych_miejsc;
	}

	public List<String> getPokoje() {
            List<String> Pokojee = new List<String>();
            Iterator<TPokoj> help = Pokoje.iterator();
            while(help.hasNext())
                    {
                        TPokoj next = help.next();
                        Pokojee.add(next.toString());
                    }
            return Pokojee;
	}

	public void setPokoje(List<TPokoj> Pokoje) {
		this.Pokoje = Pokoje;
	}

	public boolean equals(THotel obj) {
                if(obj == null)
                    return false;
		if(this.Nazwa == obj.Nazwa)
                    return this.Lokacja == obj.Lokacja;
                else
                    return false;
	}

	public TPokoj searchPokoj(TPokoj Pokoj) {
                int idx;
                if((idx=Pokoje.indexOf(Pokoj))!=-1)
                {
                    Pokoj=Pokoje.get(idx);
                    return Pokoj;
                }
                return null;
	}

	public TPokoj addPokoj(String[] data) {
            TFabryka Factory = new TFabryka();
            TPokoj Pokoj = Factory.Create_pokoj(data);
            if(searchPokoj(Pokoj)==null)
                {
                    Pokoje.add(Pokoj);
                }
                return null;
	}

}
