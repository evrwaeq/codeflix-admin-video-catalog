package com.codeflix.admin.video.catalog.infrastructure;

import com.codeflix.admin.video.catalog.application.UseCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    System.out.println(new UseCase().execute());
  }
}
