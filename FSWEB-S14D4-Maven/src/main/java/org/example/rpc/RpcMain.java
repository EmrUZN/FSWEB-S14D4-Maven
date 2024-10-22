package org.example.rpc;

public class RpcMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("shrek", 1000,40);
        Monster wolf = new Werewolf("wolf", 500, 100);

        printAttackResult(shrek);
        printAttackResult(wolf);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("atak result of: "+ monster.getName()+ ":"+ monster.attack());
    }

}
