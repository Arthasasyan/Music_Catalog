package com.music;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args)
  {
    Cathalog cathalog = new Cathalog("My strange playlist");
    Artist eliseRyd = new Artist("Elise Ryd");
    Group amaranthe  = new Group("Amaranthe");
    Genre rock = new Genre("Rock");
    List<Genre> parents = new ArrayList<>();
    parents.add(rock);
    Genre modernMetal = new Genre("Modern Metal", parents);
    Album nexusAlbum = new Album(amaranthe,"The Nexus", modernMetal);
    Song nexusSong = new Song("The Nexus", nexusAlbum);
    cathalog.addAlbum(nexusAlbum);
    cathalog.addArtist(eliseRyd);
    cathalog.addGroup(amaranthe);
    cathalog.addGenre(rock);
    cathalog.addGenre(modernMetal);
    System.out.println(cathalog.getSongs(cathalog.getGenre("Rock")));
  }
}
