class FizzBuzz {
  public static int toInt(String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      return -1;
    }
  }

  public static void main(String[] args) {
    int length = 100;
    if (args.length > 0) {
      length = toInt(args[0]);
    }
    for (int i = 1; i <= length; i++) {
      /*
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
      */
      String out = "";
      if (i % 3 == 0) {
        out += "Fiz";
      }
      if (i % 5 == 0) {
        out += "Buzzzzz";
      }
      if (out.equals("")) {
        out = "" + i;
      }
      out += "\n";
      System.out.print(out);
    }
  }
}
