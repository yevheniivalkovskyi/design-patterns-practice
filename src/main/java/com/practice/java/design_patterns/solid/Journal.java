package com.practice.java.design_patterns.solid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
  private final List<String> entries = new ArrayList<String>();
  private static int count = 0;

  public void addEntry(String text) {
    entries.add("" + (++count) + ": " + text);
  }

  public void removeEntry(int index) {
    entries.remove(index);
  }

  @Override
  public String toString() {
    return String.join(System.lineSeparator(), entries);
  }

  public void save(String fileName) throws FileNotFoundException {
    try (PrintStream out = new PrintStream(fileName)) {
      out.println(toString());
    }
  }

  public void load(String filename) {
  }

  public void load(URL url) {
  }

  static class Persistence {
    public void saveToFile(Journal journal, String filename, boolean override) throws FileNotFoundException {
      if (override || new File(filename).exists()) {
        try (PrintStream out = new PrintStream(filename)) {
          out.println(toString());
        }
      }
    }
  }

  public static void main(String[] args) throws Exception {
    Journal journal = new Journal();
    journal.addEntry("Test journal");
    journal.addEntry("Second test journal");
    System.out.println(journal);

    Persistence persistence = new Persistence();
    String filename = "";
    persistence.saveToFile(journal,filename, true);
  }
}
