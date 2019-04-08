package com.example.designpatternsdemo.Behavioral;

import com.example.designpatternsdemo.Behavioral.Interpreter.And;
import com.example.designpatternsdemo.Behavioral.Interpreter.Constant;
import com.example.designpatternsdemo.Behavioral.Interpreter.Context;
import com.example.designpatternsdemo.Behavioral.Interpreter.Expression;
import com.example.designpatternsdemo.Behavioral.Interpreter.Not;
import com.example.designpatternsdemo.Behavioral.Interpreter.Or;
import com.example.designpatternsdemo.Behavioral.Interpreter.Variable;
import com.example.designpatternsdemo.Behavioral.Iterator.Book;
import com.example.designpatternsdemo.Behavioral.Iterator.BookShelf;
import com.example.designpatternsdemo.Behavioral.Iterator.Iterator;
import com.example.designpatternsdemo.Behavioral.Mediator.Colleague1;
import com.example.designpatternsdemo.Behavioral.Mediator.ConcreteMediator;
import com.example.designpatternsdemo.Behavioral.command.BakeChickenWingCommand;
import com.example.designpatternsdemo.Behavioral.command.BakeMuttonCommand;
import com.example.designpatternsdemo.Behavioral.command.Barbecuer;
import com.example.designpatternsdemo.Behavioral.command.Command;
import com.example.designpatternsdemo.Behavioral.command.Waiter;

import java.io.Console;

public class MainClass {

    //开店前的准备
    public void testCommand(){
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChikenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();
        //开门营业 顾客点菜
        girl.addOrder(bakeMuttonCommand1);
        girl.addOrder(bakeMuttonCommand2);
        girl.addOrder(bakeChikenWingCommand1);
        //点菜完毕，通知厨房
        girl.notifyOrders();
    }

    public void testInterpreter(){
        Context context = new Context();
        Variable xVariable = new Variable("X");
        Variable yVariable = new Variable("Y");
        Constant constant = new Constant(true);
        context.assign(xVariable, false);
        context.assign(yVariable, true);

        Expression expression = new Or(new And(constant, xVariable), new And(yVariable, new Not(xVariable)));
        //X = false
        System.out.println("X = " + xVariable.interpret(context));
        //Y = true
        System.out.println("Y = " + yVariable.interpret(context));
        //((true AND X) OR (Y AND (NOT X))) = true
        System.out.println(expression.toString() + " = " + expression.interpret(context));
    }

    public void testIterator(){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("倚天屠龙记"));
        bookShelf.appendBook(new Book("葵花宝典"));
        bookShelf.appendBook(new Book("九阳真经"));
        bookShelf.appendBook(new Book("神雕侠侣"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    public void testMediator(){
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleague1 col1 = new Colleague1(mediator);
//        Colleague2 col2 = new Colleague2(mediator);
        mediator.colleagueChanged(col1);
    }
}
