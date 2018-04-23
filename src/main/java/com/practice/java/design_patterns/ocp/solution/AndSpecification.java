package com.practice.java.design_patterns.ocp.solution;

public class AndSpecification<T> implements Specification<T> {
  private Specification<T> first;
  private Specification<T> second;

  public AndSpecification(Specification<T> first, Specification<T> second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public boolean isSatisfied(T item) {
    return first.isSatisfied(item) && second.isSatisfied(item);
  }

}
