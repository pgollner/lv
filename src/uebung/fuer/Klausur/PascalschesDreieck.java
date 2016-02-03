package uebung.fuer.Klausur;

public class PascalschesDreieck {

    

    public static void main(String[] args) {
        int i; 
        int j;
        int N=7;
        int[][] triangle=new int[N][];
        for(i=0;i<N;i++) {
            triangle[i]=new int[i+1]; // Neue Zeile
            triangle[i][0]=1; //
            for(j=1;j<i;j++) {
                triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
            }
            triangle[i][i]=1; // letztze Zeile
        }
        for(i=0;i<N;i++) {
            // Schleife fuer die Zeilen
            String line="";
            for(int k=N-i;k>0;k--) {
                line+="   ";
            }
            for(j=0;j<=i;j++) {
                // Schleife ueber die Zahlen der Zeile
                String numStr=""+triangle[i][j];
                for(int k=0;k<(6-numStr.length()+1)/2;k++) {
                    // Ausgleich auf Feldbreite
                    line+=" ";
                }
                line+=numStr; // Zahl zentriert ausgeben
                for(int k=0;k<(6-numStr.length())/2;k++) {
                    line+=" ";
                }
            }
            System.out.println(line);
        }
    }

}
