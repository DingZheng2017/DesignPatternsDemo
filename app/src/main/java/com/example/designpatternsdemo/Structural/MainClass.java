package com.example.designpatternsdemo.Structural;

import com.example.designpatternsdemo.Structural.Component.Employee;
import com.example.designpatternsdemo.Structural.Decorator.Beverage;
import com.example.designpatternsdemo.Structural.Decorator.DarkRoast;
import com.example.designpatternsdemo.Structural.Decorator.HouseBlend;
import com.example.designpatternsdemo.Structural.Decorator.Milk;
import com.example.designpatternsdemo.Structural.Decorator.Mocha;
import com.example.designpatternsdemo.Structural.Facade.ApproveFacade;
import com.example.designpatternsdemo.Structural.Flyweight.Flyweight;
import com.example.designpatternsdemo.Structural.Flyweight.FlyweightFactory;
import com.example.designpatternsdemo.Structural.Proxy.AbstractObject;
import com.example.designpatternsdemo.Structural.Proxy.ProxyObject;
import com.example.designpatternsdemo.Structural.Proxy.RealObject;
import com.example.designpatternsdemo.Structural.bridge.ImportantMsg;
import com.example.designpatternsdemo.Structural.bridge.Msg;
import com.example.designpatternsdemo.Structural.bridge.SendMsgInterface;
import com.example.designpatternsdemo.Structural.bridge.SmsSendMsg;

public class MainClass {

    public void testBridge() {
        SendMsgInterface smdSendMsg = new SmsSendMsg();
        Msg importantMsg = new ImportantMsg(smdSendMsg);
        importantMsg.send();
    }

    public void testComponent() {
        Employee a= new Employee("a");
        Employee b = new Employee("b");
        a.add(b);
    }

    /**
     * 咖啡馆，人们需要根据自己的爱好来订购咖啡，而具体的coffee种类假设一共用两类：
     * HouseBlend（混合咖啡）和darkRoast（深焙咖啡）。而另外客人也可根据的口味来添加一些其他的东西，
     * 例如：摩卡（mocha）、Milk（牛奶）
     */
    public void testDecorator(){
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
    }

    /**
     * 内部处理办理卫生许可证，办理税务登记，办理工商登记流程
     */
    public void testFacade(){
        ApproveFacade af = new ApproveFacade();
        af.wholeApprove();
    }

    public void testFlyweight(){
        Flyweight fly1 = FlyweightFactory.getFlyweight("a");
        fly1.action(1);

        Flyweight fly2 = FlyweightFactory.getFlyweight("a");
        System.out.println(fly1 == fly2);

        Flyweight fly3 = FlyweightFactory.getFlyweight("b");
        fly3.action(2);

        Flyweight fly4 = FlyweightFactory.getFlyweight("c");
        fly4.action(3);

        Flyweight fly5 = FlyweightFactory.getFlyweight("d");
        fly4.action(4);

        System.out.println(FlyweightFactory.getSize());
    }

    public void testProxy(){
        AbstractObject proxy = new ProxyObject(new RealObject());
        proxy.operation();
    }
}
