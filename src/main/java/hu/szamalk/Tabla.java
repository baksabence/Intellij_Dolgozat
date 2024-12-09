package hu.szamalk;

public class Tabla {
    private char[][] T;
    private char ÜresCella;

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
        }
//        for (int i = 0; i < T.length; i++) {
//                for (int j = 0; j < T.length; j++) {
//                    System.out.print(T[i][j]);
//                }
//        }
    }

}
