package hotel_project;

public class Danne {
    
    public String dane_user[][] = new String[][]{
        {"1", "5", "6", "7", "8", "9", "10"},
        {"1", "123123123", "arturm@gmail.com", "kaszka2", "SuperKolo", "Tomek", "Kiel"},
        {"1", "86111409645", "amfa12@gmail.com", "morfa", "Dopalacze", "Mariusz", "Koks"},
        {"1", "93090303459", "karzel@gmail.com", "malyduzy", "Liliput", "Tomek", "Zastaw"},
        {"1", "54090456459", "rzepa@gmail.com", "pyra", "car", "Kamil", "Opium"},
        {"1", "456", "67451296", "35", "47", "85", "35"},
        {"3", "0", "0", "0", "0", "0", "0"}
    };
    
    public String dane_pokojow[][] = new String[][]{
        {"1", "11", "12", "Wolne", "druga", "4"},{"1", "12", "8", "Zajete", "pierwsza", "2"},
        {"1", "15", "16", "Wolne", "kondo", "2"},{"1", "07", "11", "Wolne", "druga", "2"},
        {"1", "08", "2", "Wolne", "druga", "4"},{"1", "05", "14", "Zajete", "pierwsza", "4"},
        {"1", "11", "8", "Zajete", "kondo", "3"},{"1", "13", "16", "Zajete", "druga", "6"}
    };
    
    public String dane_pokojow22[][][] = new String[][][] {
        {
            dane_pokojow[0], dane_pokojow[1], dane_pokojow[2]
        },
        {
            dane_pokojow[3], dane_pokojow[4], dane_pokojow[5]
        }
    };
    
    public String dane_hotelow[][] = new String[][]{
        {"1", "5", "6", "9"}, {"1", "10", "5", "7"}, {"1", "25", "3", "11"},
        {"1", "2", "4", "13"}, {"1", "15", "6", "19"}, {"1", "6", "24", "9"}
    };
    
    public static TPokoj pokoje[] = {
        new TPokoj(), new TPokoj(), new TPokoj(), new TPokoj(),
        new TPokoj(), new TPokoj(), new TPokoj(), new TPokoj()
    };
    
    public static TPokoj pokojeee[][] = {
        {new TPokoj(), new TPokoj(), new TPokoj(), new TPokoj()},
        {new TPokoj(), new TPokoj(), new TPokoj(), new TPokoj()}
    };
    
    public static TUser user[] = {
        new TUser(), new TUser(), new TUser(), new TUser(), new TUser(), new TUser()
    };
    
    public static THotel hotele[] = {
        new THotel(), new THotel(), new THotel(), new THotel(), new THotel(), new THotel()
    };
    
    public float pokoje_cena[] = {
        12F, 8F, 16F, 11F, 2F, 14F, 8F
    };
    
    public float hotele_cena[][] = {
        {12F, 8F, 16F}, {11F, 2F, 14F}
    };
    
    public void Danne(){
        for(int i=0;i<6;i++)
            user[i].TUser(dane_user[i]);
        for(int i=0; i<6;i++)
            hotele[i].THotel(dane_hotelow[i]);
        for(int i=0;i<6;i++)
            pokoje[i].TPokoj(dane_pokojow[i], hotele[i]);
        for(int i=0; i<2; i++)
            for(int j=0; j<3; j++)
                pokojeee[i][j].TPokoj(dane_pokojow22[i][j], hotele[3*i+j]);
    }

}