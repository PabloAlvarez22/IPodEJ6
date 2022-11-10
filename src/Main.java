/**
 * @author pablo
 *
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        IIpod_simulator ipod = new IPodJJ(); //Linea que debe modificarse
        boolean exit = false;
        Scanner sc  = new Scanner(System.in);
        boolean isOn = false;
        boolean isLocked = true;
        float up = (float)0.5;
        String input;
        while (!exit)
        {
            System.out.println("1. Encender/Apagar\n2. Bloquear/Desbloquear\n3. Subir volumen\n4. Bajar volumen\n5. Siguiente cancion\n6. Anterior cancion\n7. Ver estado\n8. Agregar actual como favorita\n9. Reproducir favorita\n10. Salir de simulador");
            input = sc.nextLine();
            switch (input)
            {
                case "1":
                {
                    isOn = ipod.SwitchONOFF(isOn);
                    break;
                }
                case "2" :
                {
                    isLocked = ipod.LockUnlockDevice(isLocked);
                    break;
                }
                case "3":
                {
                    System.out.println("Volumen: "+ipod.setVolume((ipod.getVolume()+up)));
                    break;
                }
                case "4":
                {
                    System.out.println("Volumen: "+ipod.setVolume((ipod.getVolume()-up)));
                    break;
                }
                case "5":
                {
                    System.out.println("Reproduciendo: "+ipod.selectSpecificSong(ipod.Next(ipod.getActualIndex())));
                    break;
                }
                case "6":
                {
                    System.out.println("Reproduciendo: "+ipod.selectSpecificSong(ipod.Prev(ipod.getActualIndex())));
                    break;
                }
                case "7":
                {
                    System.out.println(ipod.getStatus(isOn, isLocked, true,ipod.selectSpecificSong(ipod.getActualIndex())));
                    break;
                }
                case "8":
                {
                    ipod.addToFavorite(ipod.selectSpecificSong(ipod.getActualIndex()));
                    break;
                }
                case "9":
                {
                    System.out.println("Ingresa la posiicon del favorito que desea reproducir (1-10)");
                    input = sc.nextLine();
                    int index;
                    try{
                        index = Integer.parseInt(input);
                        System.out.println("Reproduciendo: "+ipod.selectSpecificFavoriteSong(index));

                    }catch (Exception e){
                        System.out.println("Debe ingresar un numero entero");
                    }
                    break;
                }
                case "10":
                {
                    exit = true;
                    break;
                }
                default:
                    System.out.println("Ingrese un numero de opcion valido");

            }
        }
        System.out.println("Adios");
    }
}