package br.com.alura.musicaprojeto.principal;

import br.com.alura.musicaprojeto.modelo.MinhasPreferidas;
import br.com.alura.musicaprojeto.modelo.Musica;
import br.com.alura.musicaprojeto.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Surreal");
        minhaMusica.setCantor("Luísa Sonza");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Papo Reto");
        meuPodcast.setApresentador("Mano Brown");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i <5000 ; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui((minhaMusica));

    }
}
