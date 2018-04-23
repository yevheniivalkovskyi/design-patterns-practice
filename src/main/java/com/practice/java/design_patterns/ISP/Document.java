package com.practice.java.design_patterns.ISP;

public class Document {

}

interface Machine {
  void print(Document document) throws Exception;

  void fax(Document document);

  void scan(Document document);
}

class MultiFunctionPrinter implements Machine {

  @Override
  public void print(Document document) {
    //
  }

  @Override
  public void fax(Document document) {
//
  }

  @Override
  public void scan(Document document) {
//
  }
}

class OldFashionedPrinter implements Machine {

  @Override
  public void print(Document document) throws Exception {
    throw new Exception("Can't print");
  }

  @Override
  public void fax(Document document) {

  }

  @Override
  public void scan(Document document) {

  }
}
