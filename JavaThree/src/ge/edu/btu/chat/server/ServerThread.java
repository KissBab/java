package ge.edu.btu.chat.server;

import java.util.Scanner;

public class ServerThread implements Runnable {

    @Override
    public void run() {

        System.out.println("მიმდინეარეობს კავშირის დამყარება ...");

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("დასვი კითხვა: ");
            String question;
            question = input.next();
            if(question.equals("გამარჯობა")) {
                System.out.println("პასუხი: მოგესალმებით, რით შემიძლია დაგეხმაროთ");
            }else if(question.equals("მაჩვენე კურსი")) {
                System.out.println("პასუხი: 3.3021");
            }else if(question.equals("ნახვამდის")) {
                System.out.println("პასუხი: გმადლობთ რომ დაგვიკავშირდით, ნახვამდის!!!");
                break;
            }else {
                System.out.println("პასუხი: სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს");
            }
        }

        System.out.println("კავშირის დასასრული !!!");

    }
}
