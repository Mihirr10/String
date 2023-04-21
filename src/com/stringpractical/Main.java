package com.stringpractical;

public class Main {
  public static void main(String[] args) {

    String teamName = "All Time football XI";
    System.out.println(teamName + ":");

    StringBuffer footballPlayer = new StringBuffer();

    footballPlayer.append(" Lionel Messi\n");
    footballPlayer.append("Cristiano Ronaldo\n");
    footballPlayer.append("Alfredo DI stefano\n");
    footballPlayer.append("Diego Maradona\n");
    footballPlayer.append("Pele\n");
    footballPlayer.append("Johan cruff\n");
    footballPlayer.append("Xavi Hernandez\n");
    footballPlayer.append("Robarto carlos\n");
    footballPlayer.append("Franz Beckenbauer\n");
    footballPlayer.append("Sergio Ramos\n");
    footballPlayer.append("Iker casillas\n");

    System.out.println(footballPlayer);
    System.out.println(footballPlayer.toString().toUpperCase());
    System.out.println(footballPlayer.toString().trim());

    StringBuilder cricketPlayer = new StringBuilder();
    cricketPlayer.append("   Matthew Hayden\n");
    cricketPlayer.append("Virender Sehwag\n");
    cricketPlayer.append("Rickey Ponting\n");
    cricketPlayer.append("Sachin Tendulker\n");
    cricketPlayer.append("Brian Lara\n");
    cricketPlayer.append("Jacques Kallis\n");
    cricketPlayer.append("Adam Gilchrist\n");
    cricketPlayer.append("Wasim Akram\n");
    cricketPlayer.append("Glenn Mcgrath\n");
    cricketPlayer.append("Shane Warne\n");
    cricketPlayer.append("Muttiah Muralitharan\n");

    System.out.println("\nAll time Test Cricket XI:\n" + cricketPlayer);
    System.out.println(cricketPlayer.toString().toUpperCase());
    System.out.println(cricketPlayer.toString().trim());
  }
}