package hu.szamalk;

import java.util.Random;

public class Tabla {
    private char[][] T;
    private char ÜresCella;

    private static final Random rnd = new Random();

    public Tabla(char üresCella) {
        T = new char[8][8];
        ÜresCella = üresCella;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                T[i][j] = ÜresCella;
            }
        }
    }

    public void Megjelenit(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println();
            Elhelyez(8);
        }
//        for (int i = 0; i < T.length; i++) {
//                for (int j = 0; j < T.length; j++) {
//                    System.out.print(T[i][j]);
//                }
//        }
    }

    public void Elhelyez(int n){
        int db = n;
        int veletlenHelyre = rnd.nextInt(0, 8);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(T[veletlenHelyre][veletlenHelyre] == '#')
                    T[veletlenHelyre][veletlenHelyre] = 'K';
            }
            }

    }


}
