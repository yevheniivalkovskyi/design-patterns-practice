package com.practice.java.design_patterns.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

  /*
  always add new method that is not good
  OCP - open for extending and close for modification
   */
  public Stream<Product> filterByColor(List<Product> products, Color color) {
    return products.stream().filter(p -> p.getColor() == color);
  }

  public Stream<Product> filterBySize(List<Product> products, Size size) {
    return products.stream().filter(p -> p.getSize() == size);
  }

  public Stream<Product> filterBySizeAndColor(
          List<Product> products,
          Color color,
          Size size
  ) {
    return products.stream()
            .filter(product -> product.getSize() == size && product.getColor() == color);
  }

}
