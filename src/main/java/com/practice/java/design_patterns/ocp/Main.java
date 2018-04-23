package com.practice.java.design_patterns.ocp;

import com.practice.java.design_patterns.ocp.solution.*;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
    Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    Product house = new Product("House", Color.BLUE, Size.LARGE);

    List<Product> products = Arrays.asList(apple, house, tree);
    ProductFilter filter = new ProductFilter();
    System.out.println("By color");
    filter.filterByColor(products, Color.GREEN)
            .forEach(product -> System.out.println(product.getName()));

    //using new filters
    BetterFilter betterFilter = new BetterFilter();
    betterFilter.filter(products, new ColorSpecification(Color.GREEN))
            .forEach(p -> System.out.println(p.getName() + " : " + p.getColor()));
    betterFilter.filter(products,
            new AndSpecification<>(
                    new ColorSpecification(Color.GREEN),
                    new SizeSpecification(Size.LARGE)
            ));

  }
}
