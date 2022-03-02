package Chap99.CodingBat.Array1;

public class Array2 {

  public int countEvens(int[] nums) {
    int cnt = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        cnt++;
      }
    }
    return cnt;
  }

  public int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return max - min;
  }

  public int centeredAverage(int[] nums) {
    int sum = 0;
    int max = nums[0];
    int min = nums[0];
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    sum = sum - max - min;
    return sum / (nums.length - 2);
  }
  public int sum13(int[] nums) {
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
  sum += nums[i];
  if (nums[i] == 13){
  sum = sum - nums[i];
  i++;
  }
  }
  return sum;
  }

  // public int sum13(int[] nums) {
  //   int sum = 0;
  //   boolean is13 = false;
  //   boolean was13 = false;

  //   // [1, 2, 13, 2, 1, 13]
  //   for (int i = 0; i < nums.length; i++) {
  //     if (nums[i] != 13) {
  //       sum += nums[i];
  //     }
  //     was13 = is13;
  //   }
  //   return sum;
  // }

}
