/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_project;

/**
 *
 * @author Dell
 */
public class TFabryka {
	/**
	 * 
	 * @param data
     * @return 
	 */
	public TUser Create_user(String[] data) {
		// TODO - implement TFabryka.Create_user
		TUser TUser = null;
                switch(Integer.parseInt(data[0]))
                {
                    case 0:
                        TUser = new TUser();
                        TUser.setPesel(data[1]);
                        break;
                    case 1:
                        TUser=new TUser();
                        TUser.setPesel(data[1]);
                        TUser.setEmail(data[2]);
                        TUser.setHaslo(data[3]);
                        TUser.setLogin(data[4]);
                        TUser.setImie(data[5]);
                        TUser.setNazwisko(data[6]);
                        break;
                }
                return TUser;
        }
                       

	/**
	 * 
	 * @param data
	 */
	public TPokoj Create_pokoj(String[] data, THotel Hotel) {
		// TODO - implement TFabryka.Create_pokoj
		TPokoj TPokoj = null;
                switch(Integer.parseInt(data[0]))
                {
                    case 0:
                        TPokoj = new TPokoj(); //do wyszukiwania
                        TPokoj.setHotel(Hotel);
                        TPokoj.setNumer(Integer.parseInt(data[1]));
                        break;
                    case 1:
                        TPokoj = new TPokoj(); //do tworzenia nowego obiektu
                        TPokoj.setHotel(Hotel);
                        TPokoj.setNumer(Integer.parseInt(data[1]));
                        TPokoj.setCena(Float.parseFloat(data[2]));
                        TPokoj.setStan(data[3]);
                        TPokoj.setKlasa(data[4]);
                        TPokoj.setIl_miejsc(Integer.parseInt(data[5]));
                        break;
                }
                return TPokoj;
	}

	/**
	 * 
	 * @param data
	 */
	public THotel Create_hotel(String[] data) {
		// TODO - implement TFabryka.Create_hotel
		THotel THotel = null;
                switch(Integer.parseInt(data[0]))
                {
                    case 0:
                        THotel = new THotel(); //do wyszukiwania
                        THotel.setNazwa(data[1]);   
                        break;
                    case 1:
                        THotel = new THotel(); //do tworzenia nowego obiektu
                        THotel.setNazwa(data[1]);
                        THotel.setLokacja(data[2]);
                        THotel.setIl_wolnych_miejsc(data[3]);
                        break;
                }
                return THotel;
	}

	/**
	 * 
	 * @param data
	 */
	public TRezerwacja Create_rezerwacja(String[] data, TUser User, TPokoj Pokoj) {
		// TODO - implement TFabryka.Create_rezerwacja
		TRezerwacja TRezerwacja = null;
                switch(Integer.parseInt(data[0]))
                {
                    case 0:
                        TRezerwacja = new TRezerwacja();
                        TRezerwacja.setID_rezerwacji(Integer.parseInt(data[1]));
                        break;
                    case 1:
                        TRezerwacja = new TRezerwacja();
                        TRezerwacja.setID_rezerwacji(Integer.parseInt(data[1]));;
                        TRezerwacja.setData(data[2]);
                        TRezerwacja.setCzas_trwania(data[3]);
                        TRezerwacja.setKlient(User);
                        TRezerwacja.setPokoj(Pokoj);
                        break;
                }
                return TRezerwacja;
	}

}
