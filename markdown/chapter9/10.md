#枚举和注解
### 枚举
#### 自定义枚举类
1. 不需要setXxx()方法，因为枚举对象通常只读
2. 对于枚举对象使用 final和static修饰
3. 枚举对象名，通常大写
4. 枚举对象可以有多个属性

步骤

1. 构造器私有化
2. 本类内部创建一组对象[]
3. 对外暴露对象，public final static修饰
4. 可以提供getXxx，但不提供setXxx方法

#### enum关键字实现枚举
1. 当我们使用enum关键字来实现一个枚举类时，默认会继承Enum类，而且是一个final类
2. 传统的 public final static Season SPRING = new Season("春天", "温暖");简化成    SPRING("春天", "温暖"),
3. 如果使用无参构造器创建枚举对象，则实参列表和小括号可以省略
4. 当有多个枚举对象时，使用”,“隔开，最后一个是”;“
5. 枚举对象必须放在枚举类的行首

#### 小结
1. 使用enum关键字之后,就不能再继承其他类了,因为enum会隐式继承Enum,Enum是final类
2. 枚举类和普通类一样,可以实现接口
```java
enum 类名 implements 接口1,接口2{
    
}
```
### 注解(Annotation)
- 注解(Annotation)也称为元数据，用来修饰解释包，类，方法，属性，构造器，局部变量等数据信息
- 和注释一样，不影响代码逻辑，但注解可以被编译和运行，相当于嵌入在代码当中的补充信息

```java
@Override:限定某个方法，是重写父类方法
@Deprecated:用于表示某个程序元素(类，方法等)已经过时
@SuppressWarnings():抑制编译器警告
```

#### 元注解
元注解用来修饰其他注解Annotation

1. Retention 指定注解的作用范围
2. Target 指定注解可以在哪些地方使用
3. Documented 指定该注解是否会在javadoc体现
4. Inherited 子类会继承父类的注解