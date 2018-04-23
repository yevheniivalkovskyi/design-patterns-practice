package com.practice.java.design_patterns.ocp.solution;

import com.practice.java.design_patterns.ocp.Product;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

  @Override
  public Stream<Product> filter(List<Product> list, Specification<Product> specification) {
    return list.stream().filter(specification::isSatisfied);
  }
}
