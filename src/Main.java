public class Main {
    public static void main(String[] args) {

        // Skapar ett deck
        Deck d1 = new Deck();
        // Fyller alla kort in i decken
        d1.fyllning();
        // Blandar alla kort
        d1.blandning();

        // Skapar 3 hand (spelare) och en dealer hand
        Hand h1, h2, h3, dealer;
        h1 = new Hand();
        h2 = new Hand();
        h3 = new Hand();
        dealer = new Hand();
        // Array lista av händer, för att uppdela dem från dealer
        Hand[] händer = {h1, h2, h3};

        // 2 kort delas ut till händer
        d1.delning(händer, 2);

        // 2 kort delas ut till dealer
        d1.delning(dealer, 2);

        // Vänder coh visar alla kort som händer har
        for (int i = 0; i < händer.length; i++) {
            händer[i].vändKorten();
            System.out.println(händer[i].visaHand());
        }

        // Dealers kort vänds och visas
        dealer.korten.get(0).vändKort();
        System.out.println("Dealers kort: \n" + dealer.visaHand());
    }
}













/*
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⡤⣶⡤⣤⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠛⢉⡼⠛⠁⣠⡟⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡤⠖⠛⠉⠉⠽⠓⠒⠓⠒⠿⠉⠛⠒⠦⣤⡀⠀⣠⡶⠋⠁⠀⢠⡟⠀⠀⠴⠟⠛⢳⡆
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡤⣶⡶⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⢯⡀⠀⠀⢀⡏⡆⠀⠀⠀⢀⣼⣋⡅
⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⠚⠉⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠲⣄⣸⠁⠀⠀⠀⠀⠉⠀⣸⡇
⠀⠀⠀⠀⣀⣠⠴⠞⠋⠀⣀⡴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣦⣄⠀⠀⠀⢀⣴⠏⠀
⣤⡴⠒⠛⠉⠀⠀⠐⠒⠛⣷⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⣌⣛⣒⣤⠿⠟⣶⠆
⢹⣧⡀⠀⠀⠀⠀⠀⠀⣼⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠏⠀⠀⠀⠀⠀⠀⠀⠀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡄⠉⠀⠀⣰⠏⠀
⠀⢿⡷⣄⠀⠀⠀⠀⢰⡷⠋⠀⠀⠀⠀⠀⠀⠀⠀⣠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠉⠛⣯⠀⠀
⠀⠈⢷⣈⠙⢶⣒⠛⠋⢠⠞⠀⠀⠀⠀⠀⡴⠀⢠⡏⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⣿⡦⣴⠟⠁⠀⠀
⠀⠀⠀⢹⡟⠂⠩⠛⢲⡏⠀⠀⠀⠀⠀⢰⡇⣀⣿⠀⢸⠀⠀⠀⠀⠀⠀⡄⠀⠐⢺⢷⠂⠰⡄⠀⢸⡀⠀⠀⠀⠀⠀⠀⠹⣟⡁⠀⠀⠀⠀
⠀⠀⠀⠈⠛⠲⢶⠀⡾⠀⠀⠀⠀⠀⢠⢸⡷⠫⢸⡆⢸⣆⠀⠀⠀⠀⠀⢳⠀⢀⡿⠘⢧⡀⢹⣄⠀⣧⠀⠀⠀⠀⠀⠀⠀⠈⠙⠲⢤⣤⡆
⠀⠀⠀⠀⠀⠀⠈⢹⠁⢰⠀⠀⠀⠀⢸⢸⡅⠀⠀⠻⣎⣿⢦⣀⠀⠀⠀⣸⡀⣼⣷⣾⣿⣿⣾⣿⢦⣿⠀⠀⠀⠀⠀⠀⠀⢷⠦⠴⠖⠋⠁
⠀⠀⠀⠀⠀⠀⠀⢸⠀⢸⡄⠀⠀⠀⣿⠸⣇⠀⠀⠀⠈⠙⠂⠙⠷⣄⣀⣿⠟⢿⣿⡏⣀⡀⢙⣿⣿⣏⡀⠀⠀⠀⠀⢸⡀⠸⡆⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⣿⡀⠀⠀⢸⡷⢿⣶⣶⣦⣍⡢⠀⠀⠀⠀⠙⠀⠀⢸⣟⠉⠽⠿⠍⣻⣿⠟⠀⠀⠀⠀⠀⣸⠁⢰⠇⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠻⣄⣧⡿⢦⣄⡀⣷⠀⠀⠈⠉⠛⠻⢦⠀⠀⠀⠀⠀⠀⠠⠿⠤⠤⠤⢒⡿⠃⣠⡞⠀⠀⠀⣠⡏⢀⡞⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⢀⣬⠟⠁⠀⠉⢉⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⡯⠴⣺⣿⠀⠀⢀⡴⣿⡖⠋⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢀⣠⡤⠶⠋⠁⠀⠀⠀⢀⡄⠈⢳⣄⠀⠀⠀⠀⠀⠠⣄⣠⣤⣀⡄⠀⠀⠀⠀⠀⢀⡴⠋⣯⣤⠖⠋⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀
⠀⣠⡶⠚⠉⢁⡆⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠈⠓⣶⣄⣀⠀⠀⠈⠉⠉⠁⠀⠀⠀⣀⡤⠞⠋⠀⠀⠀⡀⠀⠀⠀⠸⣷⠀⠀⠀⠀⠀⠀⠀
⢸⠟⠀⠀⣴⡟⠀⠀⠀⠀⠀⠀⡼⠀⠀⠀⠀⣴⣿⣿⣤⡉⠛⢿⡖⠦⠤⠤⠖⢛⣿⠋⠀⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠹⣷⣄⡀⠀⢀⡀⠀
⢸⠀⠀⢸⡿⠁⢠⡄⠀⠀⠀⠀⡇⠀⠀⢀⡼⠛⠻⣿⣮⣙⣦⡈⣿⣆⠀⠀⢀⡾⠛⢷⣤⡀⠀⠀⠀⠀⢸⠀⠀⠀⢰⡄⠙⣮⡉⠉⠉⠁⠀
⠘⣧⠀⡏⡇⠀⠸⡇⠀⠀⠀⠀⢻⠀⢀⡏⠀⠀⠀⠘⣿⣿⣿⣷⣽⣿⣦⣤⣼⡇⢀⡿⢸⠿⣆⠀⠀⠀⠈⣧⠀⠀⠀⢳⡄⠈⠻⣆⠀⠀⠀
⠀⠈⢷⣇⣧⡀⠀⢹⣄⠀⠀⠀⠈⣇⢸⠁⠀⠀⠀⠀⠨⣿⣿⣿⣿⣆⢹⣆⣸⢡⣿⣷⡟⣠⣿⡀⠀⠀⠀⣿⠀⠀⠀⠀⣿⢆⠀⠘⢷⡀⠀
⠀⠀⠀⠀⠈⠙⠲⢤⣹⣦⣀⠀⠀⠘⡟⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣾⠋⠈⢷⡄⠀⢀⡟⠀⠀⠀⠀⢹⡌⢷⡀⠈⢷⡀
⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠉⠛⠓⢶⡇⠀⠀⠀⠀⠀⠀⠀⠀⠹⣮⣿⣿⣿⣿⣿⣿⣽⠃⠀⠀⠀⠹⣦⠞⠁⠀⠀⠀⠀⢸⡇⠀⢳⠀⢸⡇
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⣿⠻⣏⠀⠀⠀⠀⠀⠀⠈⢳⣄⡀⠀⠀⣀⡾⠃⠀⢸⣇⡞⠁
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢺⠇⠀⠹⣆⠀⠀⠀⠀⠀⠀⠀⠉⠉⠙⠋⠉⠀⠀⠀⠼⠋⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⣀⣀⣀⣽⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 */