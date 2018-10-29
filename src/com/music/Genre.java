package com.music;

import java.util.LinkedList;
import java.util.List;

public class Genre {
  private List<Genre> parents;
  private List<Genre> children;
  private String name;

  public Genre(String name,List<Genre> parents)
  {
    this.parents=parents;
    this.name=name;
    this.children = new LinkedList<>();
    if(parents!=null)
    for(Genre g: parents)
    {
      g.children.add(this);
    }
  }
  public Genre(String name) //initialize genre without parents
  {
    this.name=name;
    this.parents = null;
    this.children = new LinkedList<>();
  }

  public String getName() {
    return name;
  }

  public List<Genre> getChildren() {
    return children;
  }

  public List<Genre> getParents() {
    return parents;
  }


  @Override
  public String toString() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj==null || this.getClass()!=obj.getClass())
    {
      return false;
    }
    return this.name == ((Genre)obj).name;
  }
}
