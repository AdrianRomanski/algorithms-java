package hacker_rank.days30_of_code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStack {

    private Stack<Character> stack = new Stack<>();
    private Queue<Character> queue = new LinkedList<>();

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    char popCharacter() {
        return this.stack.pop();
    }

    char dequeueCharacter() {
        return this.queue.poll();
    }




 }
