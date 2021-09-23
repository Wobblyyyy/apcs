public class Evaluation {
    private static final boolean p = true;
    private static final boolean q = false;
    private static final boolean r = false;
    
    private static void print(String expression,
                              boolean result) {
        System.out.println(expression + ": " + result);
    }
    
    public static void main(String[] args) {
        print(
            "!(p && q)",
            (!(p && q))
        );
        print(
            "!(p && q || r)",
            (!(p && q || r))
        );
        print(
            "!p || !q && !(p && r)",
            (!p || !q && !(p && r))
        );
        print(
            "(!p == q) && !q || !p",
            ((!p == q) && !q || !p)
        );
        print(
            "!(p == q) && !r || !q || !(!q || r))",
            (!(p == q) && !r || !q || !(!q || r))
        );
    }
}
