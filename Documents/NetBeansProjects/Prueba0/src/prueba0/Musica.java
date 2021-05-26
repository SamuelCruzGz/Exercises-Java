/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba0;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class Musica {

    public void Artista(String nombre){
        System.out.println("Tu banda/artista favorito es: "+nombre);
    }
    public void Album (String album){
        System.out.println("Tu album favorito es: "+album);
    }
    
    public void Canción (String cancion){
        System.out.println("Tu canción favorita es: "+cancion);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu artista favorito: ");
        String artistaB = sc.nextLine();
        System.out.println("Ingresa tu album favorito: ");
        String album1 = sc.nextLine();
        System.out.println("Ingresa tu cancion favorita: ");
        String cancion1 = sc.nextLine();
        
        Musica artista = new Musica ();
        artista.Artista(artistaB);
        
        Musica album = new Musica ();
        album.Album(album1);
        
        Musica cancion = new Musica ();
        cancion.Canción(cancion1);
    }
}
