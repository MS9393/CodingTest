package programmers.lv0;

public class pr181864 {
    public int solution(String myString, String pat) {
        String newMyString = "";
        for(String aa : myString.split("")){
            newMyString += "A".equals(aa) ? "B" : "A";
        }

        return newMyString.indexOf(pat) == -1 ? 0 : 1;
    }
}