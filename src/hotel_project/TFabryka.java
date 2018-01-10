package hotel_project;


public class TFabryka {
	
	public TUser Create_user(String[] data) {
		
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
        
        
        
	public TPokoj Create_pokoj(String[] data, THotel Hotel) {
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

        
	public THotel Create_hotel(String[] data) {
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


	public TRezerwacja Create_rezerwacja(String[] data, TUser User, TPokoj Pokoj) {
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
