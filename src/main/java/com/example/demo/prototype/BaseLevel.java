package com.example.demo.prototype;

public class BaseLevel implements Cloneable {
  public String levelName;
  public int numberOfNPCs;
  public int numberOfTokens;

  public String getLevelName() {
    return levelName;
  }

  public int getNumberOfNPCs() {
    return numberOfNPCs;
  }

  public int getNumberOfTokens() {
    return numberOfTokens;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }

  public void setNumberOfNPCs(int npc) {
    this.numberOfNPCs = npc;
  }

  public void setNumberOfTokens(int tokens) {
    this.numberOfTokens = tokens;
  }

  public BaseLevel clone() throws CloneNotSupportedException {
    return (BaseLevel) super.clone();
  }
}
