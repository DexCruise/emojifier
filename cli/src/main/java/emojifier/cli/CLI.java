package emojifier.cli;

import emojifier.core.EmojifyWrapper;

public class CLI {
    public static void main(String[] args) {
        System.out.println(EmojifyWrapper.emojify(args[0]));
    }
}
