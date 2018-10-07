package com.music;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Album implements Iterable<Song> {
  private Group author;
  private LinkedList<Song> songs;
  private String name;
  private Genre genre;
  private Date releaseDate;



  public Album(Group author, String name, Genre genre)
  {
    this.songs = new LinkedList<Song>();
    this.author=author;
    this.name = name;
    this.genre = genre;
    author.addAlbum(this);
  }

  public void addSong(Song song)
  {
    this.songs.add(song);
  }

  public Genre getGenre() {
    return genre;
  }

  public Group getAuthor() {
    return author;
  }

  public String getName() {
    return name;
  }

  @Override
  public Iterator<Song> iterator() {
    return songs.iterator();
  }

  @Override
  public String toString() {
    return author.toString() + "'s album " + name;
  }
}
