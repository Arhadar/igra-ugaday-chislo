public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    String a1;
    String a2;
    String a3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9");

        while (true) {
            System.out.println("Число, которое нужно угадать: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Первый игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Первый игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                if (p1isRight == true) a1 = "Да!!!";
                else a1 = "Нет!";
                if (p2isRight == true) a2 = "Да!!!";
                else a2 = "Нет!";
                if (p3isRight == true) a3 = "Да!!!";
                else a3 = "Нет!";

                System.out.println("У нас есть первый победитель!");
                System.out.println("Первый игрок угадал?" + a1);
                System.out.println("Первый игрок угадал?" + a2);
                System.out.println("Первый игрок угадал?" + a3);
                System.out.println("Конец игры!");
                break;
            } else {
                System.out.println("Игроки должны попробоват ещё!");

            }
        }

    }


}
