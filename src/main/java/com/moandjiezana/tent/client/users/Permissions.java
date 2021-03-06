package com.moandjiezana.tent.client.users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Permissions {

  @JsonProperty("public")
  private boolean publicVisible;
  private Group[] groups;
  private Map<String, Boolean> entities;

  public boolean isPublicVisible() {
    return publicVisible;
  }

  public void setPublicVisible(boolean publicVisible) {
    this.publicVisible = publicVisible;
  }

  public Map<String, Boolean> getEntities() {
    return entities;
  }

  public void setEntities(Map<String, Boolean> entities) {
    this.entities = entities;
  }

  public Group[] getGroups() {
    return groups;
  }

  public void setGroups(Group[] groups) {
    this.groups = groups;
  }
}
