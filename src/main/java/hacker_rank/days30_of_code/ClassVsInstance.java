package hacker_rank.days30_of_code;

public class ClassVsInstance {

    public class Person {
        private int age;

        public Person(int initialAge) {
            if(initialAge >= 0) {
                this.age = initialAge;
            } else {
                System.out.println("Age is not valid, setting age to 0..");
                this.age = 0;
            }

        }

        public void amIOld() {
            if(this.age < 13) {
                System.out.println("You are young..");
            } else if(this.age < 18) {
                System.out.println("You are a teenager..");
            } else {
                System.out.println("You are old..");
            }
        }

        public void yearPasses() {
            this.age++;
        }
    }
}
