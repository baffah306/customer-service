public class Method1 {

   static String join2Words(String name,int children, int age){
        int calculatedAge = children + age;
        if (calculatedAge > 100){
            return name+ "is an old man";
        }
        else {
            return name+ " is a small boy";
        }
//        return name+"'s calculated aged with children is "+ calculatedAge;
    }
        static String timesTable(int numTimes, int extent){
       String result = "";
            for (int i = 1; i <50 ; i++) {
                int calculation = extent * i;
                String begin = numTimes+ " X ";
                String endd = " = " + calculation + "\n";
                result +=  begin + i + endd;

            }
       return result;
        }
    public static void main(String[] args) {
        System.out.println(timesTable(25, 17));
//            System.out.println(join2Words("Tolu",19,25));
    }

}
