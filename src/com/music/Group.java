package com.music;

import java.util.LinkedList;
import java.util.List;

public class Group {
  private String name;
  private List<Artist> artists;
  private List<Album> albums;
  public Group(String name)
  {
    this.name=name;
    this.artists=new LinkedList<>();
    this.albums = new LinkedList<>();
  }

  public List<Album> getAlbums() {
    return albums;
  }

  public List<Artist> getArtists() {
    return artists;
  }

  public String getName() {
    return name;
  }
  public void addArtist(Artist artist)
  {
    artists.add(artist);
    artist.addGroup(this);
  }
  public void addAlbum(Album album)
  {
    albums.add(album);
  }

  public void setAlbums(List<Album> albums) {
    this.albums = albums;
  }

  public void setArtists(List<Artist> artists) {
    this.artists = artists;
    for(Artist a: artists)
    {
      if(!a.getGroups().contains(this)) {
        a.addGroup(this);
      }
    }
  }

  @Override
  public String toString() {
    return name;
  }
}
