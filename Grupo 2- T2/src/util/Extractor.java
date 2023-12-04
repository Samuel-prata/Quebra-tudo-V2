package util;

import java.util.ArrayList;
import java.util.List;

final class Extractor {

  public static List<Integer> extractDigits(String text) {

    List<Integer> extractedDigits = new ArrayList<>();
    
    for (char currentDigit : text.toCharArray()) {
      if (Character.isDigit(currentDigit)) {
        extractedDigits.add(Character.getNumericValue(currentDigit));
      }
    }

    return extractedDigits;
  }
}
