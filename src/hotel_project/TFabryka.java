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

	public TFabryka() {
		// TODO - implement TFabryka.TFabryka
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
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
	public TPokoj Create_pokoj(String[] data) {
		// TODO - implement TFabryka.Create_pokoj
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
	public THotel Create_hotel(String[] data) {
		// TODO - implement TFabryka.Create_hotel
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
	public TRezerwacja Create_rezerwacja(String[] data) {
		// TODO - implement TFabryka.Create_rezerwacja
		throw new UnsupportedOperationException();
	}

}
