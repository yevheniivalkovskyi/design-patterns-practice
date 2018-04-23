package com.practice.java.design_patterns.ocp.solution;

import com.practice.java.design_patterns.ocp.Color;
import com.practice.java.design_patterns.ocp.Product;

public class ColorSpecification implements Specification<Product> {

  private Color color;

  public ColorSpecification(Color color) {
    this.color = color;
  }

  @Override
  public boolean isSatisfied(Product item) {
    return item.getColor() == color;
  }

}
