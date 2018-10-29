package com.music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cathalog {
  private Map<String, Genre> genreMap;
  private Map<String, Group> groupMap;
  private Map<String, Artist> artistMap;
  private Map<String, Album> albumMap;
  private Map<String, Compilation> compilationMap;
  private Map<String, Song> songMap;
  private String name;

  public Cathalog(String name)
  {
    this.name=name;
    genreMap=new HashMap<>();
    groupMap=new HashMap<>();
    artistMap = new HashMap<>();
    albumMap = new HashMap<>();
    compilationMap = new HashMap<>();
    songMap = new HashMap<>();
  }

  public String getName() {
    return name;
  }

  public Genre getGenre(String name)
  {
    return genreMap.get(name);
  }

  public Group getGroup(String name)
  {
    return groupMap.get(name);
  }

  public Artist getArtist(String name)
  {
    return artistMap.get(name);
  }

  public Album getAlbum(String name)
  {
    return albumMap.get(name);
  }

  public Compilation getCompilation(String name)
  {
    return compilationMap.get(name);
  }

  public Song getSong(String name)
  {
    return songMap.get(name);
  }

  public void addSong(Song song)
  {
    songMap.put(song.toString(), song);
  }

  public void addAlbum(Album album)
  {
    albumMap.put(album.toString(),album);
    for(Song song : album)
    {
      addSong(song);
    }
  }

  public void addGenre(Genre genre)
  {
    genreMap.put(genre.getName(), genre);
  }

  public void addGroup(Group group)
  {
    groupMap.put(group.getName(), group);
  }

  public void addArtist(Artist artist)
  {
    artistMap.put(artist.getName(), artist);
  }

  public void addCompilation(Compilation compilation)
  {
    compilationMap.put(compilation.getName(), compilation);
  }

  public List<Song> getSongs (Genre genre)
  {
    List<Song> songs= new ArrayList<>();
    for(Map.Entry<String,Song> entry : songMap.entrySet())
    {
      Song song = entry.getValue();
      if(song.getAlbum().getGenre().equals(genre))
      {
        songs.add(song);
      }
    }
    for(Genre child : genre.getChildren())
    {
      songs.addAll(getSongs(child));
    }
    return songs;
  }
}
