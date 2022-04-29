package ru.zorro.test_git_repo.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- start ---");
        user1Func();
        user2Func();
        System.out.println("--- end ---");
    }

    private static void user2Func() {
        System.out.println("user2 func");
    }

    private static void user1Func() {
        System.out.println("user 1 func");
    }

}
