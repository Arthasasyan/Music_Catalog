package com.music;

import java.util.LinkedList;
import java.util.List;

public class Compilation {
  private String name;
  private List<Song> songs;

  public Compilation(String name)
  {
    this.name=name;
    this.songs=new LinkedList<>();
  }

  public String getName() {
    return name;
  }

  public List<Song> getSongs() {
    return songs;
  }

  public void setSongsList(List<Song> songs) {
    this.songs = songs;
  }

  public void addSong(Song song)
  {
    songs.add(song);
  }

  @Override
  public String toString() {
    return name;
  }
}
