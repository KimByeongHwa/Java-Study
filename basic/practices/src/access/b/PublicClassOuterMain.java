package access.b;

// import access.a.DefaultClass;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default - 다른 패키지 접근 불가
        // DefaultClass defaultClass = new DefaultClass();
    }
}
