package com.example.finishingdicoding;

import java.util.ArrayList;

public class PlayerData {
    public static String[][] data = new String[][]{
            {
                "Gianluigi Buffon",
                "GK",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Gianluigi_Buffon_%2831815848711%29.jpg/408px-Gianluigi_Buffon_%2831815848711%29.jpg",
                "Gianluigi \"Gigi\" Buffon merupakan pemain sepak bola profesional asal Italia. Saat ini, dia bergabung kembali ke klub Juventus setelah sebelumnya dibeli klub Perancis Paris Saint-Germain pada 2018. Buffon juga merupakan penjaga gawang utama di tim nasional sepak bola Italia. Juventus membelinya dari Parma pada 2001",
                "Jan 28, 1978 (42)"
            },
            {
                "Leonardo Bonucci",
                    "CB",
                    "https://tmssl.akamaized.net//images/portrait/header/39983-1448464012.jpg?lm=1448464025",
                    "Leonardo Bonucci adalah seorang pemain sepak bola professional yang berposisi sebagai bek asal Italia. Ia juga merupakan pemain tim nasional sepak bola Italia. Ia pernah bermain sebagai bek bersama Inter Milan, Bari, Ac Milan, dan saat ini bermain bersama JUVENTUS dan juga menjabat sebagai Kapten dari tim tersebut",
                    "May 1, 1987 (32)"
            },
            {
                "Giorgio Chiellini",
                    "CB",
                    "https://tmssl.akamaized.net//images/portrait/header/29260-1448464153.jpg?lm=1448464171",
                    "Giorgio Chiellini adalah pemain sepak bola Italia yang bermain untuk klub Serie A Juventus. Dia berposisi sebagai bek tengah, di mana di awal kariernya sebagai pemain sepak bola, ia adalah seorang bek kiri.",
                    "Aug 14, 1984 (35)"
            },
            {
                "Alex Sandro",
                    "LB",
                    "https://tmssl.akamaized.net//images/portrait/header/79960-1474296962.jpg?lm=1474296972",
                    "Alex Sandro Silva Lobo, atau Alex Sandro, adalah pemain sepak bola Brazil yang bermain untuk klub Italia Juventus yang bernomor punggung 12.",
                    "26 Januari 1991 (usia 29 tahun)"
            },
            {
                "Danilo",
                    "RB",
                    "https://tmssl.akamaized.net//images/portrait/header/145707-1462894787.jpg?lm=1462894805",
                    "anilo Luiz da Silva atau dikenal dengan Danilo adalah seorang pemain sepak bola Brasil yang bermain sebagai bek kanan atau gelandang FC Porto. Saat ini dia memperkuat klub asal Italia Juventus FC Juventus dari 7 Agustus 2019",
                    "15 Juli 1991 (usia 28 tahun)"
            },
            {
                "Sami Khedira",
                    "CM",
                    "https://tmssl.akamaized.net//images/portrait/header/29401-1503327624.jpg?lm=1503327673",
                    "Sami Khedira merupakan seorang pemain sepak bola Jerman, yang berposisi sebagai gelandang, Orang tuanya adalah imigran asal Tunisia. Ia dikenal sebagai pemain masa depan Jerman. Tak salah bila pelatih Joachim Löw mengandalkannya di Euro 2016 di Paris. Saat ini ia bermain untuk Juventus.",
                    " 4 April 1987 (usia 33 tahun),"
            },
            {
                "Blaise Matuidi",
                    "CM",
                    "https://tmssl.akamaized.net//images/portrait/header/33923-1454670291.jpg?lm=1454670290",
                    "Blaise Matuidi adalah seorang pemain sepak bola berkewarganegaraan Prancis yang bermain untuk klub Juventus pada posisi gelandang.",
                    "9 April 1987 (usia 33 tahun)"
            },
            {
                "Miralem Pjanic",
                    "CM",
                    "https://tmssl.akamaized.net//images/portrait/header/44162-1567161979.png?lm=1567162015",
                    "Miralem Pjanić adalah seorang pemain sepak bola berkewarganegaraan Bosnia-Herzegovina yang bermain untuk klub Juventus FC biasa bermain pada posisi gelandang. Pjanić memulai karier juniornya di klub Schifflange 95 dan Metz kemudian memulai karier seniornya di klub tersebut",
                    "2 April 1990 (usia 30 tahun)"

            },
            {
                "Aaron Ramsey",
                    "CM",
                    "https://tmssl.akamaized.net//images/portrait/header/50057-1518795716.jpg?lm=1518795731",
                    "Aaron Ramsey seorang pemain sepak bola Wales yang berposisi sebagai gelandang tengah. Saat ini ia bermain untuk Juventus di Serie A dan untuk tim nasional Wales. Aaron James Ramsey merupakan pemain sepak bola di tim nasional Welsh yang juga berkontribusi mewakili Britania Raya pada Olympic Games 2012",
                    " 26 Desember 1990 (usia 29 tahun)"
            },
            {
                "Cristiano Ronaldo",
                    "LW",
                    "https://tmssl.akamaized.net//images/portrait/header/8198-1568120625.jpg?lm=1568120652",
                    "Cristiano Ronaldo dos Santos Aveiro, OIH atau lebih dikenal Cristiano Ronaldo merupakan seorang pemain sepak bola Portugal. Ia dapat berposisi sebagai sayap kiri atau kanan serta penyerang tengah. Saat ini ia bermain untuk tim Italia, Juventus dan untuk tim nasional Portugal.",
                    "5 Februari 1985 (usia 35 tahun),"
            },
            {
                "Paulo Dybala",
                    "SS",
                    "https://tmssl.akamaized.net//images/portrait/header/206050-1541076083.jpg?lm=1541076105",
                    "Paulo Bruno Exequiel Dybala adalah seorang pemain sepak bola berkewarganegaraan Argentina yang bermain untuk klub Juventus biasa bermain pada posisi penyerang. Ia memiliki nama panggilan La Joya. Permainannya dianggap seperti penyerang Argentina Sergio Agüero atau penyerang Italia Vincenzo Montella",
                    "15 November 1993 (usia 26 tahun)"
            }

    };

    public static ArrayList<Player> getListData(){
        Player player = null;
        ArrayList<Player> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++){
            player = new Player();
            player.setName(data[i][0]);
            player.setPosition(data[i][1]);
            player.setPhoto(data[i][2]);
            player.setDetail(data[i][3]);
            player.setLahir(data[i][4]);

            list.add(player);
        }
        return list;
    }
}
