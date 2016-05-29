/**
 * Created by igor on 29.05.16.
 */
public class AskMe implements SharedContacts{
    static void answer(int result){
        switch (result){
            case NO:
                System.out.printf("NO ");
                break;
            case YES:
                System.out.printf("YES ");
                break;
            case MAYBE:
                System.out.printf("MAYBE ");
                break;
            case LATER:
                System.out.printf("LATER ");
                break;
            case SOON:
                System.out.printf("SOON ");
                break;
            case NEVER:
                System.out.printf("NEVER ");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }
}
