import java.io.*;
public class uang {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System
        .in));
        
        int nominal;
        
        System.out.print("Masukkan Jumlah Uang: ");
        nominal = Integer.parseInt(br.readLine());

        //menghitung jumlah dua puluh ribu
        int DuaPuluhRibu = (nominal / 20000);
        int sisa = (nominal % 20000);
        //menghitung jumlah sepuluh ribu
        int PuluhRibu = (sisa / 10000);
        sisa = sisa % 10000;
        //menghitung jumlah ribuan
        int Ribuan = (sisa / 1000);
        sisa = sisa % 1000;
        //menghitung jumlah ratusan
        int Ratusan = sisa / 100;
        sisa= sisa %100;
        int Sisauang=sisa;
       
        System.out.println("");
        System.out.println("Jumlah Uang : " + nominal);
        System.out.println("Duapuluh Ribu : "+ DuaPuluhRibu );
        System.out.println("Sepuluh Ribu : "+ PuluhRibu);
        System.out.println("Seribu : " + Ribuan);
        System.out.println("Seratus : " + Ratusan);
        System.out.println("Sisa Uang : " + Sisauang);
       
    }
    
}
