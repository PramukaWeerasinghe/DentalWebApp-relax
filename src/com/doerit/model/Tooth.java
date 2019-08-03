/**
 * 
 */
package com.doerit.model;

import java.util.List;

/**
 * @author Arjuna
 *
 */
public class Tooth {
  
  private String toothId;
  private List<ToothProperty> toothProperty;
  
  public String getToothId() {
    return toothId;
  }
  public void setToothId(String toothId) {
    this.toothId = toothId;
  }
  public List<ToothProperty> getToothProperty() {
    return toothProperty;
  }
  public void setToothProperty(List<ToothProperty> toothProperty) {
    this.toothProperty = toothProperty;
  }
  
  @Override
  public String toString() {
    return "Tooth [toothId=" + toothId + ", toothProperty=" + toothProperty + "]";
  }
  
  

}
