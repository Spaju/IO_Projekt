package hotel_project;

import java.util.List;

public class TAplikacja {

	protected List<THotel> Hotele;
	protected List<TUser> Users;
	protected List<TRezerwacja> Rezerwacje;

        public static void main(String[] t) {

	}
        
        public void searchHotel(){
            ;
        }
        
	public void showlHotel() {
		throw new UnsupportedOperationException();
	}

	public void showPokoj() {
		throw new UnsupportedOperationException();
	}

	public void update_info() {
		throw new UnsupportedOperationException();
	}

	public void deleteRezerwacje() {
		throw new UnsupportedOperationException();
	}


	public TRezerwacja addRezerwacja(String[] data) {
                throw new UnsupportedOperationException();
	}


	public THotel addHotel(String[] data) {
                throw new UnsupportedOperationException();
	}
        

	public TUser addUser(String[] data) {
		TFabryka fabryka = new TFabryka();
                TUser User = fabryka.Create_user(data);
                if(searchUser(User)==null)
                {
                    Users.add(User);
                }
                return null;
	}


	public TUser searchUser(TUser User) {
		// TODO - implement TAplikacja.searchUser
		throw new UnsupportedOperationException();
	}

}
