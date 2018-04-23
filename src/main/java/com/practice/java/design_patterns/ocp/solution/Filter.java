package com.practice.java.design_patterns.ocp.solution;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
  Stream<T> filter(List<T> list, Specification<T> specification);
}
