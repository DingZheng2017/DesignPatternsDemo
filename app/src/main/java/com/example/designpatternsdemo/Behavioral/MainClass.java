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
import com.example.designpatternsdemo.Behavioral.Memento.Caretaker;
import com.example.designpatternsdemo.Behavioral.Memento.Originator;
import com.example.designpatternsdemo.Behavioral.Observer.CurrentConditionsDisplay;
import com.example.designpatternsdemo.Behavioral.Observer.Observer;
import com.example.designpatternsdemo.Behavioral.Observer.WeatherData;
import com.example.designpatternsdemo.Behavioral.State.Booked;
import com.example.designpatternsdemo.Behavioral.State.Payed;
import com.example.designpatternsdemo.Behavioral.State.StateContext;
import com.example.designpatternsdemo.Behavioral.Strategy.OperationAdd;
import com.example.designpatternsdemo.Behavioral.Strategy.OperationMultiply;
import com.example.designpatternsdemo.Behavioral.Strategy.OperationSubstract;
import com.example.designpatternsdemo.Behavioral.Strategy.StrategyContext;
import com.example.designpatternsdemo.Behavioral.TemplateMethod.Cricket;
import com.example.designpatternsdemo.Behavioral.TemplateMethod.Football;
import com.example.designpatternsdemo.Behavioral.TemplateMethod.Game;
import com.example.designpatternsdemo.Behavioral.Visitor.Computer;
import com.example.designpatternsdemo.Behavioral.Visitor.ComputerPart;
import com.example.designpatternsdemo.Behavioral.Visitor.ComputerPartDisplayVisitor;
import com.example.designpatternsdemo.Behavioral.command.BakeChickenWingCommand;
import com.example.designpatternsdemo.Behavioral.command.BakeMuttonCommand;
import com.example.designpatternsdemo.Behavioral.command.Barbecuer;
import com.example.designpatternsdemo.Behavioral.command.Command;
import com.example.designpatternsdemo.Behavioral.command.Waiter;

public class MainClass {

    //开店前的准备
    public void testCommand() {
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

    public void testInterpreter() {
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

    public void testIterator() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("倚天屠龙记"));
        bookShelf.appendBook(new Book("葵花宝典"));
        bookShelf.appendBook(new Book("九阳真经"));
        bookShelf.appendBook(new Book("神雕侠侣"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    public void testMediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleague1 col1 = new Colleague1(mediator);
//        Colleague2 col2 = new Colleague2(mediator);
        mediator.colleagueChanged(col1);
    }

    public void testMemento() {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
    }

    public void testObserver() {
        WeatherData weatherData = new WeatherData();
        Observer currentDisplay = new CurrentConditionsDisplay();
        weatherData.setHumidity(12);
        weatherData.setPressure(23);
        weatherData.setTemperature(344);
        weatherData.registerObServer(currentDisplay);
        weatherData.measuermentsChanged();
    }

    public void testState() {
        StateContext context = new StateContext();
        context.setState(new Booked());
        context.setState(new Payed());
    }

    public void testStrategy() {
        StrategyContext context = new StrategyContext(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new StrategyContext(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new StrategyContext(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

    public void testTemplateMethod() {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }

    public void testVisitor() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
