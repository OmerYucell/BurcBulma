import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ay,gun;
        boolean isError = false;
        String burc = "";



        Scanner inp = new Scanner(System.in);

        System.out.print("Doğdugunuz Ayı Seciniz :");
        ay = inp.nextInt();

        System.out.println("Dogdugunuz Günü Seciniz :");
        gun = inp.nextInt();
        if (ay >=1 && ay <=12){

            if (ay == 1){
                if (gun >= 1 && gun <= 31){
                    if (gun <22){
                        burc = "Oglak";
                    }else {
                        burc = "Kova";
                    }
                }
                }
            if (ay == 2){
                if (gun >=1 && gun <=28){
                    if (gun <20){
                        burc = "Kova";
                    }else {
                        burc = "Balık";
                    }
                }
            }if (ay == 3){
                if (gun >=1 && gun <=31){
                    if (gun <21){
                        burc = "Balık";
                    }else {
                        burc = "Koc";
                    }
                }
            }if (ay == 4){
                if (gun >=1 && gun <=30){
                    if (gun <21){
                        burc = "Koc";
                    }else {
                        burc = "Boga";
                    }
                }
            }if (ay == 5){
                if (gun >=1 && gun <=31){
                    if (gun <22){
                        burc = "Boga";
                    }else {
                        burc = "İkizler";
                    }
                }
            }if (ay == 6){
                if (gun >=1 && gun <=30){
                    if (gun <23){
                        burc = "İkizler";
                    }else {
                        burc = "Yengec";
                    }
                }
            }if (ay == 7){
                if (gun >=1 && gun <=31){
                    if (gun <23){
                        burc = "Yengec";
                    }else {
                        burc = "Aslan";
                    }
                }
            }if (ay == 8){
                if (gun >=1 && gun <=31){
                    if (gun <23){
                        burc = "Aslan";
                    }else {
                        burc = "Basak";
                    }
                }
            }if (ay == 9){
                if (gun >=1 && gun <=30){
                    if (gun <23){
                        burc = "Basak";
                    }else {
                        burc = "Terazi";
                    }
                }
            }if (ay == 10){
                if (gun >=1 && gun <=31){
                    if (gun <24){
                        burc = "Terazi";
                    }else {
                        burc = "Akrep";
                    }
                }
            }if (ay == 11){
                if (gun >=1 && gun <=30){
                    if (gun <22){
                        burc = "Akrep";
                    }else {
                        burc = "Yay";
                    }
                }
            }if (ay == 12){
                if (gun >=1 && gun <=31){
                    if (gun <22){
                        burc = "Yay";
                    }else {
                        burc = "Oglak";
                    }
                }
            }
        }else {
            isError = true;
        }

        if (isError){
            System.out.println("Hatalı Giriş yaptiniz");
        }else {
            System.out.print("Burucunuz :" +burc);
        }

    }
}
