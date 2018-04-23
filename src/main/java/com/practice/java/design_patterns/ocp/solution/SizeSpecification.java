package com.practice.java.design_patterns.ocp.solution;

import com.practice.java.design_patterns.ocp.Product;
import com.practice.java.design_patterns.ocp.Size;

public class SizeSpecification implements Specification<Product> {
  private Size size;

  public SizeSpecification(Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product item) {
    return item.getSize() == size;
  }
}
