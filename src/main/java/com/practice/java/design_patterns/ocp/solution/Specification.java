package com.practice.java.design_patterns.ocp.solution;

public interface Specification<T> {
  boolean isSatisfied(T item);
}
