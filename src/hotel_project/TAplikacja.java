package hotel_project;

import java.util.List;

public class TAplikacja {

	protected List<THotel> Hotele;
	protected List<TUser> Users;
	protected List<TRezerwacja> Rezerwacje;

        public static void main(String[] t) {
                TAplikacja ap = new TAplikacja();
                String Hotel1[] = {"1", "Hilton", "Wroclaw", "10"};
                String Hotel2[] = {"1", "Remont", "Warszawa", "20"};
                String Hotel3[] = {"1", "Mugo", "Katowice", "8"};
                ap.addHotel(Hotel1);
                ap.addHotel(Hotel2);
                ap.addHotel(Hotel3);
                //ap.showlHotel();
                String Pokoj1[] = {"1", "11", "1200", "Wolne", "druga", "4"};
                String Pokoj2[] = {"1", "12", "800", "Zajete", "pierwsza", "2"};
                String Pokoj3[] = {"1", "15", "1600", "Wolne", "kondo", "2"};
                String Pokoj4[] = {"1", "07", "1100", "Wolne", "druga", "2"};
                String Pokoj5[] = {"1", "08", "2000", "Wolne", "druga", "4"};
                String Pokoj6[] = {"1", "05", "1400", "Zajete", "pierwsza", "4"};
                String Pokoj7[] = {"1", "11", "800", "Zajete", "kondo", "3"};
                String Pokoj8[] = {"1", "13", "1600", "Zajete", "druga", "6"};
                String Pokoj9[] = {"1", "14", "1300", "Wolne", "pierwsza", "3"};
                String Pokoj10[] = {"1", "05", "1500", "Wolne", "druga", "3"};
                String Pokoj11[] = {"1", "09", "1800", "Wolne", "druga", "6"};
                String Pokoj12[] = {"1", "15", "2000", "Zajete", "kondo", "1"};
                ap.Hotele.get(0).addPokoj(Pokoj1);
                ap.Hotele.get(0).addPokoj(Pokoj2);
                ap.Hotele.get(1).addPokoj(Pokoj3);
                ap.Hotele.get(1).addPokoj(Pokoj4);
                ap.Hotele.get(2).addPokoj(Pokoj5);
                ap.Hotele.get(1).addPokoj(Pokoj6);
                ap.Hotele.get(1).addPokoj(Pokoj7);
                ap.Hotele.get(0).addPokoj(Pokoj8);
                ap.Hotele.get(0).addPokoj(Pokoj9);
                ap.Hotele.get(0).addPokoj(Pokoj10);
                ap.Hotele.get(2).addPokoj(Pokoj11);
                ap.Hotele.get(2).addPokoj(Pokoj12);
                ap.showPokoj(0);
                ap.showPokoj(1);
                ap.showPokoj(2);
                String User1[] = {"1", "92021803641", "arturm@gmail.com", "kaszka2", "SuperKolo", "Artur", "Mazur"};
                String User2[] = {"1", "86111409645", "amfa12@gmail.com", "morfa", "Dopalacze", "Mariusz", "Koks"};
                String User3[] = {"1", "93090303459", "karzel@gmail.com", "malyduzy", "Liliput", "Tomek", "Zastaw"};
                ap.addUser(User1);
                ap.addUser(User2);
                ap.addUser(User3);
                String Rezerw1[] = {"1", "123789", "14.02.2018", "5 dni"};
                String Rezerw2[] = {"1", "534652", "18.04.2018", "2 dni"};
                ap.addRezerwacja(Rezerw1, 0, 1, 2);
                ap.addRezerwacja(Rezerw1, 1, 2, 1);
	}
        
        
	public void showlHotel() {
		for(int i=0; i<Hotele.size(); i++)
                    Hotele.get(i).toString();
	}
        

	public void showPokoj(int x) {
		for(int i=0; i<Hotele.get(x).Pokoje.size(); i++)
                    Hotele.get(x).Pokoje.get(i).toString();
	}
        
        
        public void showRezerwacje() {
		for(int i=0; i<Rezerwacje.size(); i++)
                    Rezerwacje.get(i).toString();
	}
        

	public TRezerwacja addRezerwacja(String[] data, int x, int z, int c) {
                TFabryka fabryka = new TFabryka();
                TRezerwacja Rezerwacja = fabryka.Create_rezerwacja(data, Users.get(x), Hotele.get(z).Pokoje.get(c));
                if(searchRezerwacja(Rezerwacja)==null)
                {
                    Rezerwacje.add(Rezerwacja);
                }
                return null;
	}


	public THotel addHotel(String[] data) {
                TFabryka fabryka = new TFabryka();
                THotel Hotel = fabryka.Create_hotel(data);
                if(searchHotel(Hotel)==null)
                {
                    Hotele.add(Hotel);
                }
                return null;
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
		for(int i=0;i<Users.size();i++){
                    if(Users.get(i)==User)
                        return User;
                }
                return null;
	}
        
        
        public TRezerwacja searchRezerwacja(TRezerwacja Rezerwacja) {
		for(int i=0;i<Rezerwacje.size();i++){
                    if(Rezerwacje.get(i)==Rezerwacja)
                        return Rezerwacja;
                }
                return null;
	}
        
        
        public THotel searchHotel(THotel Hotel) {
		for(int i=0;i<Hotele.size();i++){
                    if(Hotele.get(i)==Hotel)
                        return Hotel;
                }
                return null;
	}

}
