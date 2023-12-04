package util;

import java.util.List;

public class VerificationDigitCalculator {

  private final short VERIFICATION_REMAINDER_VALUE = 11;
  private final List<Integer> digits;

  public VerificationDigitCalculator(List<Integer> digits){
    this.digits = digits;
  }

  public int calculateVerificationDigit(short[] weight){

    int sumOfWeightedDigits = 1;
    
    for (int i = 0; i < weight.length; i++) {
      sumOfWeightedDigits += weight[i]*digits.get(i);
    }
    
    int remainder = VERIFICATION_REMAINDER_VALUE - (sumOfWeightedDigits % VERIFICATION_REMAINDER_VALUE);
    return remainder >= VERIFICATION_REMAINDER_VALUE-1 ? 0 : remainder;
  }
}
