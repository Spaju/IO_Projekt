/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_project;

import java.util.List;
/**
 *
 * @author Dell
 */
public class THotel {

	protected String Nazwa;
	protected String Lokacja;
	protected String Il_wolnych_miejsc;
	protected List<TPokoj> Pokoje;

	/**
	 * 
	 * @param Nazwa
	 * @param Lokacja
	 * @param Il_wolnych_miejsc
	 * @param Pokoje
	 */
	public THotel THotel(String Nazwa, String Lokacja, int Il_wolnych_miejsc, List<TPokoj> Pokoje) {
		// TODO - implement THotel.THotel
		throw new UnsupportedOperationException();
	}

	public void setHotel() {
		// TODO - implement THotel.setHotel
		throw new UnsupportedOperationException();
	}
        @Override
	public String toString() {
		// TODO - implement THotel.toString
		throw new UnsupportedOperationException();
	}

	public void getNazwa() {
		// TODO - implement THotel.getNazwa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Nazwa
	 */
	public void setNazwa(int Nazwa) {
		// TODO - implement THotel.setNazwa
		throw new UnsupportedOperationException();
	}

	public void getLokacja() {
		// TODO - implement THotel.getLokacja
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Lokacja
	 */
	public void setLokacja(int Lokacja) {
		// TODO - implement THotel.setLokacja
		throw new UnsupportedOperationException();
	}

	public void getIl_wolnych_miejsc() {
		// TODO - implement THotel.getIl_wolnych_miejsc
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Il_wolnych_miejsc
	 */
	public void setIl_wolnych_miejsc(int Il_wolnych_miejsc) {
		// TODO - implement THotel.setIl_wolnych_miejsc
		throw new UnsupportedOperationException();
	}

	public List<String> getPokoje() {
            List<String> Pokoje = new List<>();
            iterator<TPokoj> help = Pokoje.iterator();  
            while(help.hasNext())
                    {
                        TPokoj next = help.next();
                        Pokoje.add(next.toString());
                    }
            return Pokoje;
	}

	/**
	 * 
	 * @param Pokoje
	 */
	public void setPokoje(int Pokoje) {
		// TODO - implement THotel.setPokoje
		throw new UnsupportedOperationException();
	}

	public boolean equals() {
		// TODO - implement THotel.equals
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Pokoj
	 */
	public TPokoj searchPokoj(TPokoj Pokoj) {
                throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
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
