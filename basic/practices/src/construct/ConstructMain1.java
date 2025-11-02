package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 18, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 17, 70);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println(s.name + '|' + s.age + '|' + s.grade);
        }
    }
}
