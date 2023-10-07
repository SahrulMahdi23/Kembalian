/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	int jumlah = 150000;
	int sisaKembalian = jumlah - 86500;
	
	int limaPuluh = sisaKembalian / 50000;
	int sisa = sisaKembalian % 50000;
	
	int duaPuluh = sisa / 20000;
	sisa = sisa % 20000;
	
	int sepuluh = sisa / 10000;
	sisa = sisa % 10000;
	
	int limaRibu = sisa / 5000;
	sisa = sisa % 5000;
	
	int duaRibu = sisa / 2000;
	sisa = sisa % 2000;
	
	int seribu = sisa / 1000;
	sisa = sisa % 1000;
	
	int limaRatusRupiah = sisa / 500;
	sisa = sisa % 500;
	
	System.out.println("jumlah = " + jumlah);
    System.out.println("kembalian = " + sisaKembalian);
    System.out.println("lima puluh = " + limaPuluh);
    System.out.println("dua puluh = " + duaPuluh);
    System.out.println("sepuluh = " + sepuluh);
    System.out.println("lima ribu = " + limaRibu);
    System.out.println("dua ribu = " + duaRibu);
    System.out.println("seribu = " + seribu);
    System.out.println("lima ratus rupiah = " + limaRatusRupiah);
	}
}
