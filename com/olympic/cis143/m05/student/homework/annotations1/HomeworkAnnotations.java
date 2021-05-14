package com.olympic.cis143.m05.student.homework.annotations1;

public class HomeworkAnnotations implements IHomeworkAnnotation {
	@Override
    public String sayHello() {
        return "Hello";
    }
	@SuppressWarnings({"unchecked","Deprecated"})
	@Deprecated
    public String sayGoodBye() {
        return "Goodbye";
    }
}
