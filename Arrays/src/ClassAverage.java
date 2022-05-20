public class ClassAverage {
  static double sum(int[] arr) {
    double s=0;
    for (int i=0;i<arr.length;i++) {
      s += arr[i];
    }
    return s;
  }
  public static void main(String[] args) {
    String[] students = {"Hadi","Hari","Lucas","Daniel","Raydon","Sami","Owen","Nathan"};
    int[] grades = {33, 8, 57, 96, 28, 79, 98, 86};
    
    // Calculate average
    double avg = sum(grades) / grades.length;
    System.out.printf("Average: %.2f\n",avg);
    // Calculate highest grade
    int highestGrade = 0;
    String nerd = "";
    // Print out whoever is above average.
    for (int i=0;i<grades.length;i++) {
      if (grades[i] > highestGrade) {
        nerd = students[i];
        highestGrade = grades[i];
      }
      if (grades[i] > avg) {
        System.out.printf("%s (%d) is better than the average!\n", students[i],grades[i]);
      }
    }
    System.out.printf("The student with the highest grade is %s (%d)",nerd,highestGrade);
  }
}
