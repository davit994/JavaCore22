package chapters.chapter9;

public class B implements A.NestedIF {

    public boolean isNotNegative(int х) {
        return х < 0 ? false : true;
    }
}
