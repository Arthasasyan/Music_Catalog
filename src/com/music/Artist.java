package com.music;

import java.util.LinkedList;
import java.util.List;

public class Artist {
  private String name;
  private List<Group> groups;
  public Artist(String name)
  {
    this.name = name;
    this.groups = new LinkedList<>();
  }

  public String getName() {
    return name;
  }

  public List<Group> getGroups() {
    return groups;
  }
  public void addGroup(Group group)
  {
    groups.add(group);
  }

  @Override
  public String toString() {
    return name;
  }
}
