package ejerciciosprofe;
import java.util.Scanner;
public class Aplicacion211 {
 public static void main(String[] args) {
 boolean capicua = false;

 System.out.println("Escriba un número:");
 int num = new Scanner(System.in).nextInt();//leemos el numero que sea introducido y se lo asignamos a la variable num

 int u = num % 10;//u sera igual al resto de num/10(unidades)
 num /= 10;//le quitamos las unidades a num
 int d = num %10;//d sera igual al resto de num/10(decenas)
 num /= 10;//le quitamos las decenas digito a num
 int c = num%10;// c sera igual al resto de num/10(centenas)
 num /= 10;//le quitamos las centenas a num
 int um = num;//um sera igual a num(millares)

 if (u == um && d==c) {// si las unidades son iguales a los millares y las decenas a las centenas se hara
 capicua = true;
 } else if (um==0 && u==c) {//si los millares son cero y las unidades son iguales a las centenas se hara
 capicua = true;
 } else if (um==0 && c==0 && d==u) {//si millares y centenas son cero y las unidades soniguales a las decenas se hara
 capicua = true;
 } else if (um==0 && c==0 && d==0) {// si tanto las decenas como las centenas como los millares son cero se hara
 capicua = true;
 }

 if (capicua) {//se hara si capicua = true
 System.out.println("El número es capicua");
 } else {
 System.out.println("No es capicua");
 }

 }
}