class Cat {
    int age;
    int birthday;
    Cat(int i, int j){
        age = i;
        birthday = j;
        System.out.println("we re in a Cat with 2 parameters");
    }
    Cat(int i){
        this(i, i);
        System.out.println("we re in a Cat with 1 parameters");
    }
    Cat(){
        this(0);
        System.out.println("we re in a Cat with no parameters");
    }
}
