public class pr181878 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().indexOf(pat.toLowerCase()) != -1 ? 1 : 0;
    }
}
